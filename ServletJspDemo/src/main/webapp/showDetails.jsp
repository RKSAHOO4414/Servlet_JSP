<%@page import="com.my.web.model.details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<%
		//details d1 = (details) request.getAttribute("detail");
		details d1 = (details) session.getAttribute("detail");
		
		out.println(d1);
	%>

</body>
</html>