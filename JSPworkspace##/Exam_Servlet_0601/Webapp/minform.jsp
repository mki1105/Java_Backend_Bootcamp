<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 양식</title>
</head>
<body>

<form action ="${pageContext.request.contextPath}/min" method ="post">
	<input type ="text" name ="n1">-
	<input type ="text"name ="n2">
	<input type ="submit" value="빼기">
</form>
</body>
</html>