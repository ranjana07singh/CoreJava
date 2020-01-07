package com.cjc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArgumentsBased {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement smt = con.createStatement();){
		int rollno = Integer.parseInt(args[0]);
			String name = args[1];
			String address = args[2];
			String sql="insert into test values("+rollno+",' "+name+" ',' "+address+" ')";
			smt.execute(sql);
			
		}catch (SQLException  e) {
		}
	}catch ( ClassNotFoundException e) {
	}

}
}
