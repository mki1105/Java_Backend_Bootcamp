<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 문자열을 구분자로 분리해서 하나씩 추출가능
 <c:forTokens var="토큰을 저장할 변수" item="토큰으로 나눌 문자열" delims="구분자">
    몸체
	</c:forTokens> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:forTokens 태그</title>
</head>
<body>
	<c:forTokens var="city" items="서울.인천,세종.부산" delims=",">
		${city }<br>
	</c:forTokens>
	<hr>
	<c:forTokens var="city" items="서울.인천,대구.부산" delims=",.">
	${city }<br>
	</c:forTokens>
</body>
</html>