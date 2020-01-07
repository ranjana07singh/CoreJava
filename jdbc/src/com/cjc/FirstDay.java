package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDay {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement smt = con.createStatement();
				String sql = "insert into employee values(109,'ram',30,'mumbai',20000,'cjc','javaTrainer')";
				smt.execute(sql);
				smt.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
