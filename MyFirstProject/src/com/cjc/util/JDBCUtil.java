package com.cjc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
	public static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myservlet", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error in Connection while getting connection " + e);
		}
		
		return con;
	}

}
