<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<s:form action="/getLogin">
		<s:textfield key="userId" label="Enter User Id"></s:textfield>
		<s:textfield key="password" label="Enter Password"></s:textfield>
		<s:submit/>
	</s:form>
</body>
</html>