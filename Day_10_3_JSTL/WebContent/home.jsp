<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>home.jsp</h3>
<h2>Welcome ${param.user }</h2>

<c:set var="user1" value="${param.user }"></c:set><br>
	<p>value from core Lib:
<c:out value="${user1}"></c:out></p><br><br>

<c:if test="${user1=='seed' }">
	If Welcomes: <c:out value="${user1}"></c:out>
</c:if><br><br>
<h3>From choose Welcome:
<c:choose>
	<c:when test="${user1=='seed' }"><c:out value="${user1}"></c:out></c:when>
	<c:otherwise> Not a Valid User</c:otherwise>
</c:choose>
</h3>

</body>
</html>