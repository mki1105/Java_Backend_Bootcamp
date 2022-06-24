<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>secondPage</title>
</head>
<%--
pagecontext는 하나의 페이지마다 전달 
session은 하나의 브라우저니까 바뀌지 않고, application도 동일
2번으로 다이렉트로 요청하면 page와 request는 null이고 session과 application은 하나의 브라우저 하나의 서비스가 실행되고
있기 때문에 값이 나옴--%>
<body>
	하나의 페이지 속성 :
	<%=pageContext.getAttribute("name") %><br>
	하나의 요청 속성 :
	<%=request.getAttribute("name") %><br>
	하나의 세션 속성 :
	<%=session.getAttribute("name") %><br>
	하나의 애플리케이션 속성 :
	<%=application.getAttribute("name") %><br>
	
	<a href = "exam10_03.jsp"> 또다른 페이지</a>

</body>
</html>