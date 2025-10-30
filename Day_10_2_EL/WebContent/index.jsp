<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>index.jsp</h3>
<h2>Demo EL</h2>
<h2>
${"Welcome to EL" }<br>
${ 7*5 }<br>
${4<=6?"Biggernumber":"Smallernumber"}
</h2>
<form action="home.jsp">
User name<input type="text" name="user"><br><br>
<input type="submit">
</form >
</body>
</html>