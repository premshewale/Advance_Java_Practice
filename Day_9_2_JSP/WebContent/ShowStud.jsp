<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s1" class="com.demo.bean.Student"></jsp:useBean>
<%= s1 %><br><br>
<jsp:setProperty property="*" name="s1"/><br><br>
<%= s1 %><br><br>
<jsp:setProperty property="rollno" name="s1" value="888"/><br><br>
<%= s1 %><br><br>
<jsp:getProperty property="rollno" name="s1"/>

<jsp:useBean id="s2" class="com.demo.bean.Student">
<jsp:setProperty property="rollno" name="s2" value="1111"/><br><br>
<jsp:setProperty property="sname" name="s2" value="ABC"/><br><br>
<jsp:setProperty property="percentage" name="s2" value="98.5"/><br>
</jsp:useBean><br>
<jsp:getProperty property="rollno" name="s2"/>
<jsp:getProperty property="sname" name="s2"/>
<jsp:getProperty property="percentage" name="s2"/>
</body>
</html>