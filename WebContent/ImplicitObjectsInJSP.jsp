<%-- Different types Implicit Objects is available JSP. We can directly use them without making reference
	 Some of the objects are 
	 Builtin 		Object (Can be used in Scriptlet and Expression)
	 request		HttpserveletRequest
	 response		HttpserveletResponse
	 pageContext	PageContext
	 out
	 session
	 application
	 config

  --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Objects in JSP</title>
</head>
<body>
<%
	pageContext.setAttribute("name", "Ankan", PageContext.SESSION_SCOPE);
%>
</body>
</html>