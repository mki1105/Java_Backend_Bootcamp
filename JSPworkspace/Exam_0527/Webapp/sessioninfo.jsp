<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session = "true" %>
<%@ page import ="java.util.Date" %>
<%@ page import ="java.text.SimpleDateFormat" %>
<% Date time = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
session.setMaxInactiveInterval(60*60);
// request 기본객체의 getSession()메소드를 사용하면
// 세션 객체가 있을 경우 해당 세션 객체를 반환하고 없을 경우 새로 생성하여 반환하게 된다.
HttpSession httpSession = request.getSession();
%>  <!-- 초 단위 설정  ↑-->
<%-- 세션은 jsp페이지에서 디폴트로 생성된다. 기본값은 true 최초로 웹 서버에 접근했을 때 생성이 되고
 세션이 종료될 때까지 세션을 사용함! --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보</title>
</head>
<body>
세션 ID : <%= session.getId() %><br>

<%
time.setTime(session.getCreationTime());
%>
최초 세션 생성 시간 : <%= formatter.format(time) %><br>
<%
	 time.setTime(session.getLastAccessedTime());
%>
마지막에 접근 시간 : <%= formatter.format(time) %>
</body>
</html>