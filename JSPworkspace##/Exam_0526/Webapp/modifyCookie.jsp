<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<%
/* 쿠키의 값을 변경 하려면 먼저 동일한 쿠키 이름으로 생성하여 응답객체에 추가
해당 이름의 쿠키가 없으면 새로운 쿠키가 생성이 되고, 존재할 경우 해당이름의 쿠키 값 변경
존재 여부를 확인 후 변경하는 것이 좋음.
*/

Cookie[] cookies = request.getCookies();
if (cookies != null && cookies.length > 0) {
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("name")) {
	Cookie cookie = new Cookie("name",
			URLEncoder.encode("JSP!", "UTF-8"));
	response.addCookie(cookie);
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 값 변경</title>
</head>
<body>name 쿠키의 값을 변경합니다.
</body>
</html>