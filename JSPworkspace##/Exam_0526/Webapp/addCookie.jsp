<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--쿠키는 서버에서 생성하고 브라우저에 응답하여 저장하도록 하는 데이터 조각이다
 브라우저는 저장된 쿠키를 해당 사이트에 자원 요청 시 포함하여 전송하게 됨
 브라우저가 사이트를 이용하면서 유지할 값이 있다면 사용 --%>
<%

	String co = request.getParameter("co");
	if(co != null){
	//쿠키 생성(규약에 맞지 않는 값을 사용한다면 인코딩 필요) - key, value
	Cookie cookie = new Cookie(co, co);
	cookie.setMaxAge(60);
	//생성한 쿠키를 응답객체에 추가(여러개 가능함)
	response.addCookie(cookie);

	}
	//쿠키 값 읽어오기 - 요청안에 쿠키들이 들어있고, 쿠키 꺼낼 때는 배열 필요
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
	for (int i = 0; i < cookies.length; i++) {
		System.out.println(cookies[i].getName()); 
		System.out.println(cookies[i].getValue());// 쿠키 값
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키생성</title>
</head>
<body>
<form>
	<input type ="text" name ="co">
	<input type ="submit" value = "추가">
</form>
</body>
</html>