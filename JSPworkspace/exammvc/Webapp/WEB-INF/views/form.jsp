<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="${pageContext.request.contextPath }/add" method ="post">
	<input type ="text" name ="n1"> +
	<input type ="text"name ="n2">
	<input type ="submit" value="더하기">
</form>

<form action ="${pageContext.request.contextPath}/min" method ="post">
	<input type ="text" name ="n1">-
	<input type ="text"name ="n2">
	<input type ="submit" value="빼기">
</form>
<br>
<form action ="${pageContext.request.contextPath }/mul" method ="post">
	<input type ="text" name ="n1"> *
	<input type ="text"name ="n2">
	<input type ="submit" value="곱하기">
</form>

<form action ="${pageContext.request.contextPath }/div" method ="post">
	<input type ="text" name ="n1"> /
	<input type ="text"name ="n2">
	<input type ="submit" value="나누기">
</form>
</body>
</html>