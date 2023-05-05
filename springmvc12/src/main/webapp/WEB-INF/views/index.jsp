<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>

<body>
<h1 style='color:red'>Welcome to my first Web page</h1>

<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
List <String> c=(List <String>)request.getAttribute("c");
%>



<h2>my name is<%=name %></h2>
<h2>Id=<%=id %></h2>
<ul>
<%
for(String val:c)
{
	%>
	<li><%= val %></li>

<%}%>
</ul>
</body>
</html>

