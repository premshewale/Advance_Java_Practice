<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="java.util.Date"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>index.jsp</h2>
<%=new Date() %>
<%if(request.getParameter("msg")!=null){ %>
<h3 style="color:red"><%= request.getParameter("msg") %></h3><% } %>

<form action="validate.jsp">
User name <input type="text" name="user"><br><br>
Password <input type="password" name="pass"><br><br>
<input type="submit">
<%@ include file="aboutus.jsp" %>
</form>
</body>
</html>