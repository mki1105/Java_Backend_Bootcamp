<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page buffer = "1kb" autoFlush = "true" %>
<%--autoFlush="false" 는 버퍼가 다 찼을 경우 비울지 여부. none이 아닌 경우에만 가능 --%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>autoFlush 예제</title>
</head>
<body>
<!-- 이 부분에서 4KB 이상의 데이터 발생 -->
<% for(int i =0; i <1000; i++){ %>
	1234
	<% } %>
}
</body>
</html>