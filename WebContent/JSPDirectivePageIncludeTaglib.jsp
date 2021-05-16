<%-- This is Directive tag
When we create jsp file automatically page tag is added
We can add import statement separated by commas
 --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.Statement,java.util.Random"%>
    
    <%-- We can only write import tag multiple time inside page tag --%>
    <%@page import="java.util.ArrayList" %>
    
    <%-- Used to include header file --%>
    <%@ include file="MyHeaderFile.jsp" %>
    
    <%-- We can use taglib of  Directive tag to make our own tag --%>
    <%-- <%@ taglib uri="uri" prefix="fx" %>  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Directive | Page | Include | Taglib</title>
</head>
<body>

</body>
</html>