<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>displayusers.jsp</h3>
<h2>Display Data from Table user4julydb</h2>

<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver"
					 url="jdbc:oracle:thin:@AGNI:1521:oracle12c"  
					 	user="fsdm24_1" password="fsdm24_1" var="conn"/>
					 	
<sql:query var="rs" dataSource="${conn }">
	select * from user4julydb
</sql:query>
<table border="3" bgcolor="lightgray">
	<tr style="color: red" ><th>UserName</th>
		<th>Password</th>
		<th>Role</th></tr>
	<c:forEach var="r" items="${rs.rows }">
		<tr><td><c:out value="${r.username }"></c:out></td>	
			<td><c:out value="${r.password }"></c:out></td>	
			<td><c:out value="${r.role }"></c:out></td></tr>	
	
	</c:forEach>
</table>

</body>
</html>