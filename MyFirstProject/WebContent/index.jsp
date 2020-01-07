<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

 <div align="center"><h1>Login</h1></div>
 	<div align="center">
	 <form action="login" method="post">
			 <table>
 			<tr>
                <td>User Name :</td>
                <td><input type="text" name="username"/></td>  
            </tr>
            <tr>
                <td>Password  :</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="login" value="Login"/></td>
                <td><a href="Register.jsp">SignUp</a></td>
            </tr>
        </table>
		</form>
		<p style="color:red;"></p></td>
	 </div>
</body>
</html>