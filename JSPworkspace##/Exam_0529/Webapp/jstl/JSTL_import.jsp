<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:import 태그</title>
</head>
<body>
     c:forToken.jsp 파일과 변수 모두 포함<br>
     <c:import url = "http://localhost:8080/Exam_0529/jstl/JSTL_forTokens.jsp"
     var ="data">
     </c:import>
     ${data} <!-- 몸체를 여기에? -->
</body>
</html>