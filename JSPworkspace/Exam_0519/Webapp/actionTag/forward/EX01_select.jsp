<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>옵션 선택 화면</title>
</head>
<body>
<%-- 톰캣이 프로젝트를 실행할 때 기본객체가 가지고 있는 getContextPath는 최상위 파일로 요청하게 됨.
기본값이 최상위로 들어감. webapp까지--%>
<form action="<%= request.getContextPath() %>/actionTag/forward/EX01_view.jsp">
보고싶은 페이지 선택 :
	<select name ="code"> <!-- name=변수 이름  -->
		<%-- value속성을 안넣으면 뒤 단어가 value --%>
		<option value = "A">A 페이지 </option>
		<option value = "B">B 페이지 </option>
		<option value = "C">C 페이지 </option>
	</select>
	<input type ="submit" value="이동">
	</form>
</body>
</html>