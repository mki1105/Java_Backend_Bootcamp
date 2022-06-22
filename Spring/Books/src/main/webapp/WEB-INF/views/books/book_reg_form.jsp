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
<style type="text/css">
textarea {
	width: 100%;
	resize: none;
}
</style>
</head>
<body>
	<!--  작성완료가 되면 목록보기로 이동되어야 함. -->
	<h2>도서정보관리-도서추가</h2>
	<form action="<c:url value="/books/add"/>"	modelAttribute="formData"  method="post">
		<table border="1" width="100%">
			<tr>
				<td colspan="3" align="right" style="border: none;">*표시는 필수
					입니다.</td>
			</tr>
			<tr>
				<td align="center" rowspan="7" width="200" height="100">이미지</td>
			<tr>
				<td>*BOOK ISBN</td>
				<td><input type="text" name="bookisbn" />
			</tr>

			<tr>
				<td>*도서명</td>
				<td><input type="text" name="book" /></td>
			</tr>
			<tr>
				<td>*저자</td>
				<td><input type="text" name="writer" /></td>
			</tr>
			<tr>
				<td>*출판사</td>
				<td><input type="text" name="publishing" /></td>
			</tr>
			<tr>
				<td>*도서가격</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>이미지</td>
				<td><input class="file" type="file" name="image" /></td>
			</tr>
			<!-- 		</table>
 -->
			<!-- 		<table border="1" width="100%"> -->
			<tr>
				<td>책 소개</td>
				<td colspan="3"><textarea name="content" style="border: none;"></textarea></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<button type="submit">도서정보 추가</button>
					<button type="submit">도서정보 목록</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>