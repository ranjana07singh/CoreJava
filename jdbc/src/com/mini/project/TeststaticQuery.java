package com.mini.project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TeststaticQuery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Statement smt=null;
		
		try {
			Connection con = jdbcUtil.getConnection();
			smt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while(true){
		System.out.println(" 1. insert data \n 2. retrive data \n 3. update data \n 4. delete data");
		System.out.println("enter your choice:: ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			try {
			String sql="insert into test values(2,'anand','Mumbai')";
				smt.execute(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try{
				String sql="select * from test where rollno=2";
				System.out.println("rollno "+"name "+"Address");
				ResultSet rs = smt.executeQuery(sql);
				rs.next();
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}catch (SQLException e) {
			}
			break;
		case 3:
			try{
				String sql="update test set address='Pune' where rollno=1";
				//smt.execute(sql);
				int count=smt.executeUpdate(sql);
				System.out.println(count);
			}catch (SQLException e) {
			}
			break;
		case 4:
			try{
				String sql="delete from test where rollno=2";
				//smt.execute(sql);
				smt.executeUpdate(sql);
			}catch (SQLException e) {
			}
			break;
		default:
			break;
		}
	}
	}
}
