<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 첨부형 게시판</title>
</head>
<body>
<h2>파일 첨부형 게시판 - 상세보기</h2>
<table border="1" width="90%">
	<colgroup>
		<col width ="15%" /> <col width ="35%"/>
		<col width ="15%" /> <col width ="*"/>
	</colgroup>
	<!-- 게시글 정보 = 서블릿(컨트롤러)에서 request영역에 저장한 dto객체의 내용을 뷰에 el태그로 출력 {속성명, 멤버변수}-->
	<tr>	
		<td> 번호</td><td> ${dto.idx}	</td>
		<td> 작성자</td><td> ${dto.name}</td>
	</tr>
	<tr>	
		<td> 작성일</td><td> ${dto.postdate}	</td>
		<td> 조회수</td><td> ${dto.visitcount}</td>
	</tr>
	<tr>	
		<td> 제목</td>
		<td colspan = "3"> ${dto.title}</td>
	</tr>	
	</tr>
	<tr>	
		<td> 내용</td>
		<td colspan = "3" heigth ="100"> ${dto.content}</td>
	</tr>	
		
		<!-- 첨부파일  필수는 아님-->
	<tr>
		<td> 첨부파일</td>
		<td>
			<c:if test ="${not empty dto.ofile}">
			${dto.ofile}
			<a href ="../mvcboard/download.do?ofile=${dto.ofile}&sfile=${dto.sfile}&idx=${dto.idx}">
			[다운로드]</a>
			</c:if>
		</td>
			<td>다운로드수</td>
			<td> ${dto.downcount}</td>
	</tr>
	
	
	<!-- 하단메뉴(버튼), 수정하기 삭제하기는 비밀번호 검증페이지 pass.do로 먼저 이동해야 함. -->
	<tr>
		<td colspan ="4" align ="center">
			<button type = "button" onclick = "location.href = 
			'../mvcboard/pass.do?mode=edit&idx=${param.idx}';"> 수정하기 </button>
			<button type = "button" onclick = "location.href = 
			'../mvcboard/pass.do?mode=delete&idx=${param.idx}';"> 삭제하기 </button>
			<button type = "button" onclick = "location.href = 
			'../mvcboard/list.do?mode=edit&idx=${param.idx}';"> 목록 바로가기 </button>
		</td>
	</tr>
</table>
</body>
</html>