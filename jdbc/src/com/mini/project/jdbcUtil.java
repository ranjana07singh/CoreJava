package com.mini.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {
	public  static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
