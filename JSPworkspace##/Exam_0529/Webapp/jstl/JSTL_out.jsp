<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--태그 라이브러리 사용방법 지시어로 uri식별자와 접두사를 연결 -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- jsp에서는 pageContext.setAttribute("000","000");
JSTL core에서 <c:set var ="000" value ="000" scope ="page"/> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:out 태그 예제</title>
</head>
<body>
	<c:out value ="Hello World" />
</body>
</html>