<%-- This is Directive tag --%>
<%@page import="com.sun.java_cup.internal.runtime.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP to Servlet</title>
</head>
<body>


<%-- This is declaration tag --%>
<%!
int j = 9;

%>
<h1>Hello World !!</h1>

	<%-- This is scriptlet tag --%>
<%
int i = 9;
out.println("Ankan Mukherjee");
%>

<%-- This is Expression tag --%>
<br>
My favourite food is  <%= "Luchi & Motor dal"%>

</body>
</html>