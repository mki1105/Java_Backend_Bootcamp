<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 로그아웃은 session을 통해 구별하므로 세션값 없애 --%>
<% session.invalidate(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 로그아웃 </title>
	<link href = "css/style.css" rel= "stylesheet" type = "text/css">
	 <style>
    a{ text-decoration:none; }
    </style>
</head>
<body>
  성공적으로 로그아웃 되었습니다.<br/><br/>
 <a href = "login.jsp"> 로그인 페이지로 이동</a>
</body>
</html>