<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	System.out.println("서버에서 확인 : [" + name + "," + age +"]");
%><%--사용자가요청에 포함한 데이터를 처리할 코드 작성
값을 꺼냈고 위는 톰캣에서 처리하는 내용 이 아래부터는 브라우저로 출력할 값--%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv ="Content-Type" content="text/html; charset=UTF-8">
<title>사용자가 보낸 값 확인</title>
</head>
<body>
브라우저로 출력할 값 <br>
<%= name %> (<%= age %>)님 안녕하세요.
</body>
</html>