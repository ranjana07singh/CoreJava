package com.cjc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mini.project.Employee;
import com.mini.project.jdbcUtil;

public class DatabaseOperation {
	public void insertdata(Employee emp){
		try{
			Connection con = jdbcUtil.getConnection();
			Statement smt = con.createStatement();
			
			String sql="insert into employee values("+emp.getId()+",'"+emp.getName()+"','"+emp.getAddress()+"',"+emp.getSalary()+")";
			smt.execute(sql);
		}catch (SQLException e) {
		}
	}
	public void getEmployeeDetails(Employee emp){
		
		try {
			Connection con = jdbcUtil.getConnection();
			Statement smt = con.createStatement();
			String sql="select * from Employee where id= "+emp.getId();
			
			System.out.println("--------"+sql+"------");
			
			ResultSet rs = smt.executeQuery(sql);
			if(rs.next()){
				System.out.println("Employee Id: "+rs.getInt(1));
				System.out.println("Employee name: "+rs.getString(2));
				System.out.println("Employee Address: "+rs.getString(3));
				System.out.println("Employee Salary: "+rs.getDouble(4));
			}
			else{
				System.out.println("Employee not Found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateData(Employee emp){
		
		String attrName=" ";
		String attrValue=" ";
		try {
		if(emp.getName()!=null){
			attrName="Name";
			attrValue=emp.getName();
		}
		else if(emp.getAddress()!=null){
			attrName="address";
			attrValue=emp.getAddress();
		}
		else if(emp.getSalary()!=null){
			attrName="salary";
			attrValue=emp.getSalary();
		}
		
			Connection con = jdbcUtil.getConnection();
			Statement smt = con.createStatement();
			
			String sql = "update employee set " +  attrName + " = '" + attrValue + 
					"' where id = " + emp.getId(); 
			
		//	String sql = "update employee set name= '"+ emp.getName() +"' where id ="+emp.getId();
			
			System.out.println("--------"+sql+"------");
			
			int update = smt.executeUpdate(sql);
			
			System.out.println(update);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		public void deleteEmployee(Employee emp){
			try{
			Connection con = jdbcUtil.getConnection();
			Statement smt = con.createStatement();
			String sql="delete from employee where id=  "+emp.getId();
			
			System.out.println("--------"+sql+"------");
			ResultSet rs = smt.executeQuery(sql);
			
			System.out.println(rs);
			
			}catch (SQLException e) {
				System.out.println("error in sql "+e);
			}
		}
		
	}


