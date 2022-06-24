<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>c:out과 c:catch 태그</title></head>
<body>
    <c:set var="age" value="30" scope="page"> </c:set>
    나이 : <c:out value="${age }"> 10 </c:out> <p>
    
    <c:remove var="age" scope="page"></c:remove>
    나이 : <c:out value="${age }"> 10 </c:out> <p>
    나이 : <c:out value="${age }" default="5"></c:out> <p>
    
    <c:catch var="errMsg">
        정수를 0으로 나눌 수 없음 <p>
        <%= 10/0 %> <p>
    </c:catch>
    <c:out value="${errMsg}"> </c:out>
</body>
</html>
