package com.cjc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaySecond {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from employee");
		System.out.println("id  "+"name  "+"Age  "+"Address "+"Salary "+ "WorkPlace "+"Designation ");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getDouble(5)+" "+rs.getString(6)+" "+rs.getString(7));
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
