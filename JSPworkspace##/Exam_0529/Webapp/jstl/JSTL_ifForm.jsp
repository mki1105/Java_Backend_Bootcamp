<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%-- <c:if test = "조건식">
   		위 조건이 참일 경우 실행할 내용
    		</c:if> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>항목 선택 폼</title>
</head>
<body>
	<form action ="JSTL_ifResult.jsp">
		<label for ="color"> 색상을 선택하세요.</label><br>
		<select id =" color" name ="color">
		<option value ="1"> 빨강</option>
		<option value ="2"> 초록</option>
		<option value ="3"> 파랑</option>
		</select>
		<input type ="submit" value ="전송">
	</form>
</body>
</html>