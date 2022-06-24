<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	request.setCharacterEncoding("UTF-8");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라미터 출력</title>
</head>
<body>
<b> 입력한 정보는 아래와 같습니다.</b>

ID : <%= request.getParameter("ID") %><br><br>
Password : <%= request.getParameter("password") %><br><br>
자기소개 : <%= request.getParameter("pr") %> <br><br>

</body>
</html>