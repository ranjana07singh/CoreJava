package com.cjc.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.util.JDBCUtil;
@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username = request.getParameter("username");
String password = request.getParameter("password");
try {
	Connection con = JDBCUtil.getConnection();
	PreparedStatement prd = con.prepareStatement("SELECT * FROM EMPLOYE  where UserName=? and Password=? ");
	prd.setString(1, username);
	prd.setString(2, password);
	ResultSet rs = prd.executeQuery();
	if(rs.next()){
		System.out.println("Login Successfully");
		request.setAttribute("UserName", username);
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		rd.forward(request, response);
	}
	else{
		 System.out.println("Invalid Username and Password");
		 request.setAttribute("value", "Invalid Username and Password");
	     request.getRequestDispatcher("index.jsp").forward(request, response);

	} 
	
}catch (SQLException e) {
	e.printStackTrace();
}




}
}
