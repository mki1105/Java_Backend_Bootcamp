<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <% // 세션은 브라우저가 해당하는 웹 사이트를 이용하는 동안 (네이버 관련 자원을 이용하는 동안)
	 // 페이지 요청 동안 유지시켰으면 하는 값을 저장하는 용도로 사용하면 됨.
	 // 요청헤더에 쿠키값이 있고 없고는 세션값이 기억하고 있는 값인가 아닌가.
  	 String data = request.getParameter("data");
  	 session.setAttribute("data", data);
     session.setMaxInactiveInterval(60);
  	 System.out.println(session.getMaxInactiveInterval());
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%= session.getAttribute("data") %>
</body>
</html>