<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.Calendar" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Calendar 클래스 사용</title>
</head>
<body>

<%--(import 사용하지 않은 jsp코드)
<%java.util.Calendar cal = java.util.Calendar.getInstance();%>
오늘은
<%= cal.get(java.util.Calendar.YEAR) %>년
<%= cal.get(java.util.Calendar.MONTH)+1%> 월
<%= cal.get(java.util.Calendar.DATE) %>일 입니다.
--%>
<% 
	Calendar cal = Calendar.getInstance(); %>
	오늘은
	<%=cal.get(Calendar.YEAR) %>년
	<%=cal.get(Calendar.MONTH)+1 %> 월
	<%=cal.get(Calendar.DATE) %>일 입니다.
	
</body>
</html>