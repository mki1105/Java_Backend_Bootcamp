<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보관리</title>
</head>
<body>
	<h2>도서정보관리-도서정보</h2>
	<form action="<c:url value="/books/book_list"/>" method="get">
		<table border="1" width="90%">
			<colgroup>
				<col width="25%" />
				<col width="20%" />
				<col width="20%" />
				<col width="*" />
			</colgroup>
			</table>
			<tr>
			<c:forEach items="${list}" var="list" varStatus="loop">
				<td align="center" rowspan="5" width="450" height="200">이미지</td>
				<td>BOOK ISBN</td>
				<td>${list.bookisbn}</td>
			</tr>
</c:forEach>
			<tr>
				<td>도서명</td>
				<td colspan="3">${list.book}</td>
			</tr>
			<tr>
				<td>저자</td>
				<td colspan="3" heigth="100">${list.writer}</td>
			</tr>
			<tr>
				<td>출판사</td>
				<td colspan="3" heigth="100">${list.publishing}</td>
			</tr>
			<tr>
				<td>도서가격</td>
				<td colspan="2" heigth="100">${list.price}원</td>
			</tr>
			<table border="3" width="90%">
				<tr>
					<td>책 소개</td>
					<td align="center" rowspan="1" width="250" height="100">
						${dto.content}</td>
				</tr>
				<table width="90%">
					<tr>
					<tr>
						<td><button type="submit">도서정보 목록</button></td>
					</tr>
				</table>
			</table>
			</form>
</body>
</html>