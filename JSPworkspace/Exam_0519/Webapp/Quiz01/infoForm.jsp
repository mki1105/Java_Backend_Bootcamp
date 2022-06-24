<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력양식 페이지</title>
</head>
<body>
<form action ="infoResult.jsp" method = 'post'>
ID : <input type = "text" name = "ID" size = "10"><br></br>

Password : <input type = "password" name= "password" size = "10"><br></br>
자기소개 : <br>
<textarea name ="pr" cols="30" rows ="5"></textarea>
<br>

<input type ="submit" value ="전송">
<input type ="submit" value ="초기화">
</form>
</body>
</html>