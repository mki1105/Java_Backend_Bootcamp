<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>더하기</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addproc" method ="post"></form>
	<input type ="text" name ="n1">
	<input type ="text" name ="n2">
	<input type ="submit" value ="덧셈">
	
</body>
</html>