<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
</head>
<body>
<%-- 처음에 에러가 나는 이유는 request객체로부터
네임을 꺼냈을 때 값이 없어서 null이 반환이 되는데
toUpperCase를 실행하려고 해서  에러가 뜸
요청했을 때  ?name = hello 
url에 적혀있는게 전부 파라미터 서버에 추가적인 데이터를 파라미터라고 한다.
브라우저에 요청을 다받는게 request임 .파라미터 값이 없을 경우
그 때 사용할 에러페이지는 지정한다.--%>
name 파라미터 값:
<%=request.getParameter("name").toUpperCase() %>
</body>
</html>