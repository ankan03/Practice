<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exception Handling in JSP</title>
</head>
<body>
<%--We can make normal exception handelling same as java 
<%
	try{
		int i = 8/0;
		
	}catch(Exception e){
		out.println("Error: "+e.getMessage());
	}
%>
--%>

<%--We can make normal exception handelling same as java --%>
<%
	int i=9/0;
%>

</body>
</html>