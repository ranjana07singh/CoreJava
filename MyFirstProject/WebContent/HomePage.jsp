<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
String username=(String)request.getAttribute("UserName");
System.out.println(username);
session.setAttribute("UserName", username);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>

<style type="text/css">
h1{
color: red;
}
</style>
</head>
<body style="background-color:lightblue">
<div style="background-color:pink;color:red"; align="right">
	<h2>Hello <%=username %></h2>
</div>
<div align="center">
	<h1 align="center">Welcome to Complete java Classes</h1>

	<a href="ViewPage.jsp">View Profile</a>
	<br>
	<br>
	<a href="UpdateProfile.jsp">Update Profile</a>
	<br>
	<br>
	<a href="ChangePassword.jsp">Change Password</a>
</div>
</body>
</html>