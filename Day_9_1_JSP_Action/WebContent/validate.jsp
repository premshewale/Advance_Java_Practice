<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String user=request.getParameter("user");
String pass=request.getParameter("pass");
//RequestDispatcher rd;

if(user.equals("seed") && pass.equals("seed")){
	
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>
	<%
//	rd=request.getRequestDispatcher("welcome.jsp");
//	rd.forward(request, response);	
	
}else{
	//out.println("Error...please try with correct credentials..");
					
	%>
	<jsp:include page="index.jsp">
	<jsp:param value="Invalid user" name="msg"/>
	</jsp:include>
	<%
	//rd=request.getRequestDispatcher("index.jsp");
	//rd.forward(request, response);	
}
%>

</body>
</html>