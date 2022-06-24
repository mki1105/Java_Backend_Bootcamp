<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> SendRedirect</title>
</head>
<body>
구글 홈페이지 이동
<%
response.sendRedirect("http://www.google.com");
%>
</body>
</html>