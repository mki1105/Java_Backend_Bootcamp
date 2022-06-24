<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
현재 세션 :<%= session.getId() %>
<form method = "post" action ="test.jsp">
<input type = "text" name = "data">
<input type ="submit" value ="전송">
</form>
</body>
</html>