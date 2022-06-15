<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setCharacterEncoding("UTF-8");
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과페이지</title>
</head>
<body>
<h4>입력하신 정보는 아래와 같습니다.</h4><br>

학력 : <%= request.getParameter("grade")%>
소속국가 : <%= request.getParameter("country") %>
관심분야 :
<%
	String[] category = request.getParameterValues("category");
		if(category != null){
		for(int i=0; i < category.length; i++){
%>
		<%= category[i] %>
<%
		}
	}
%>
</body>
</html>