<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "boardone.BoardDao" %>
<%@ page import = "java.sql.Timestamp" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id ="article" scope ="page" class ="boardone.BoardDto">
	<jsp:setProperty name = "article" property ="*"/>
</jsp:useBean>
   <%-- writeForm.jsp 로부터 (num, ref, step,level)4개를 받아서  DB에 데이터를 넣어줄 JSP파일 --%>
<%
	article.setRegdate(new Timestamp(System.currentTimeMillis()));
	article.setIp(request.getRemoteAddr());
	BoardDao dbPro = BoardDao.getInstance();
	dbPro.insertArticle(article);
	response.sendRedirect("list.jsp");
%>
