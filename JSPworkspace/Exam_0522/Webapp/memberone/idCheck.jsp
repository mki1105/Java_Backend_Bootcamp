<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import = "memberone.*" %>
  <% MemberDao dao = MemberDao.getInstance(); %>
 <%-- <jsp:useBean id= "dao" class = "memberone.MemberDao"/> --%> 

<%
	String id = request.getParameter("id");
	boolean check = dao.idCheck(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 중복체크</title>
<link href="css/style.css?after" rel="styleheet" type="text/css">
<%-- script 태그의 src속성은 외부 스크립트 파일의 url을 명시함 --%>
<script src="script.js"></script>
<style>
a {
	text-decoration: none;
}
</style>
</head>
<body>
	<br>
	<b><%= id %></b>
	<%
	if (check) {
		out.println("는 이미 존재하는 ID 입니다.<br/></br/>");
	} else {
		out.println("는 사용 가능합니다. <br/></br/>");
	}
	%>
	<a href="#" onClick="javascript:self.close()"> 닫기</a>
</body>
</html>