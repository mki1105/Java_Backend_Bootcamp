<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first, last 프로퍼티</title>
</head>
<body>
	<%
		String[] movieList = { "타이타닉", "시네마천국", "혹성탈출", "킹콩" };
	pageContext.setAttribute("movieList", movieList);
	%>
	<ul>
		<c:forEach var="movie" items="${movieList}" varStatus="status">
			<c:choose><!-- c:if에 없는 else개념 구현 -->
				<c:when test="${status.first}">
					<li style="font-weight: bold; color: red;">${movie}</li>
				</c:when> <!-- when은 case -->
				<c:otherwise><!-- otherwise는 default -->
					<li>${movie}</li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</ul>

		<c:forEach var="movie" items="${movieList}" varStatus="status">
		${movie} <c:if test ="${not status.last}">, </c:if>
		</c:forEach>
</body>
</html>