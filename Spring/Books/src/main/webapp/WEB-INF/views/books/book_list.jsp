<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리</title>
<style>
a {
	text-decoration: none;
}
</style>
<!-- a태그는 밑줄 제거 -->
</head>
<body>
	<h2>도서정보관리 - 리스트</h2>
	<form method="get">
		<table border="1" width="150%">
			<tr>
				<td align="left">검색키워드 입력 : <input type="text"
					name="searchWord" /> <input type="submit" value="검색하기" /></td>
			</tr>
		</table>
	</form>

	<!-- 목록 테이블 -->
	<table border="1" width="150%">
		<tr>
			<th width="10%">등록 번호</th>
			<th width="15%">도서 표지</th>
			<th width="10%">도서 ISBN</th>
			<th width="15%">도서 제목</th>
			<th width="15%">저자</th>
			<th width="15%">출판사</th>
			<th width="10%">가격</th>
		</tr>
			<c:forEach items="${list}" var="list" varStatus="status">
				<tr align="center">
					<td>${status.count}</td>
					<td>
						<img src="${pageContext.request.contextPath}/resources/upload/${list.image}">			
					</td>
					<td>${list.bookisbn}</td>
					<td align="left"><a href="../books/book_detail?idx=${list.book}">${list.book}</a></td>
					<td>${list.writer}</td>
					<td>${list.publishing}</td>
					<td>${list.price}원</td>
				</tr>

			</c:forEach>
	</table>
		<tr align="center">
			<td width="100">
				<button type="button"
					onclick="location.href='../mvcboard/write.do';">도서목록추가</button>
	
</body>
</html>