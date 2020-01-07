package com.cjc.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.model.Employee;
import com.cjc.util.JDBCUtil;
@WebServlet(urlPatterns="/register")
public class RegisterServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String moblie = request.getParameter("moblie");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	System.out.println(moblie);
	System.out.println(username);
	System.out.println(password);
	
	Employee emp= new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setAdr(address);
		emp.setMobileno(moblie);
		emp.setUsername(username);
		emp.setPassword(password);
		try {
		Connection con = JDBCUtil.getConnection();	
		
			PreparedStatement prepareStatement = con.prepareStatement("insert into employe(id,Name,Address,Mobile,UserName,Password) values(?,?,?,?,?,?)");
			prepareStatement.setString(1, emp.getId());
			prepareStatement.setString(2, emp.getName());
			prepareStatement.setString(3, emp.getAdr());
			prepareStatement.setString(4, emp.getMobileno());
			prepareStatement.setString(5, emp.getUsername());
			prepareStatement.setString(6, emp.getPassword());
			int count = prepareStatement.executeUpdate();
			System.out.println(count);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
}
