<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%-- <c:forEach [var="변수이름"] items="배열 또는 컬렉션"
    		몸체
		</c:forEach> (저장된 각각의 항목의 수만큼 몸체를 반복)--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:forEach 태그</title>
</head>
<body>
<%
	String[] movieList = { "타이타닉", "시네마천국","혹성탈출", "킹콩"};
	pageContext.setAttribute("movieList", movieList);
	%>
	
	<c:forEach var ="movie" items ="${movieList}">
	${movie}<p>
	</c:forEach>
	
	<table border ="1">
		<c:forEach var ="movie" items ="${movieList}" varStatus ="status">
			<tr>
				<td> ${status.index}</td>
				<td> ${status.count}</td>
				<td> ${movie}</td>
			</tr>		
		</c:forEach>
	</table>
	</body>
</html>