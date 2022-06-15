<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>   
  <%	
	String search = request.getParameter("search");
	//System.out.println(search);
	if(search.equals("구글")){
		response.sendRedirect("https://www.google.com");
	}else if(search.equals("네이버")){
		response.sendRedirect("https://www.naver.com");
	}else if(search.equals("다음")){
		response.sendRedirect("https://www.daum.net");
	}
%>

<meta charset="UTF-8">
<title>콤보 박스 결과 페이지</title>
