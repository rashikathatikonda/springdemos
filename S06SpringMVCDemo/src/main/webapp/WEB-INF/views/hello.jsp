<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
<h1>Hello!! Welcome to spring MVC</h1>
<%
out.println("UserName:"+request.getAttribute("username")+"<br>");
out.println("Password:"+request.getAttribute("password"));
%>
<p>UserName:<b>${username}</b></p>
<p>Password:<b>${password}</b></p>

</body>
</html>