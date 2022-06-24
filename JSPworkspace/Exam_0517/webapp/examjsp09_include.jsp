<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <h2> include 사용 예제</h2>
<%
	String name = "Ben";
%>
<%@ include file = "examjsp09_top.jsp" %>
포함하는 페이지 지시어(include) 예제의 내용
<%@ include file = "examjsp09_bottom.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
</body>
</html>