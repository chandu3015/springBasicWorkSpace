<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<h1>Hello JSP  !!</h1>
<h2>Hello JSP ${errorMessage} !!</h2>
<form name ="loginForm" action="/login.do" method="post">
Enter name:<input type="text" name="name" /> <br/>
Enter Password:<input type="password" name="password" /><br/>
<button type="submit" value="submit">Enter passord</button>
</form>
</body>
</html>