<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill the Form</title>
</head>
<body>
	<!-- If we use struts form then 
		 1. We dont have to explecitly mention '.action' at the end of theURL
		 2. We don't have to declare type explecitely
		 3. The type of the request is 'post' by default
		 4. By default the key parameter is considered as level if not mentioned explecitely
	-->
	<s:form action="/demo/getTutorial">
		<s:textfield label="Enter Subject name" key="subject"></s:textfield>
		<s:submit/>
	</s:form>
	<!-- <form method="post" action="/Struts2Tutorial/demo/getTutorial.action">
		<h2>Enter Subject</h2>
		<input type="text" name="subject"/>
		<button type="submit">Submit</button>
	</form> -->
</body>
</html>