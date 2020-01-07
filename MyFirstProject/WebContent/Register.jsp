<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here!!!!!</title>
</head>
<body>
<body style="background-color:lightblue">
	<div align="center"><h1>Registration Page</h1></div>
	<div align="center">
		<form action="register" method="post">
			<table>
            <tr>
                <td>Id :</td>
                <td><input type="text" name="id"/></td>  
            </tr>
            <tr>
                <td> Name :</td>
                <td><input type="text" name="name"/></td>
            </tr>
             <tr>
                <td>Address :</td>
                <td><input type="text" name="address"/></td>
            </tr>
              <tr>
                <td>Mobile :</td>
                <td><input type="text" name="moblie"/></td>
            </tr>
             <tr>
                <td>User Name :</td>
                <td><input type="text" name="username"/></td>
            </tr>
             <tr>
                <td>Password :</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="register" value="Register"/></td>
            </tr>
        </table>
		</form>
	</div>
</body>
</html>