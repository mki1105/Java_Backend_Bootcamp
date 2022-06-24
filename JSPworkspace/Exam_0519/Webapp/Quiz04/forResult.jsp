<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%!
public int sum(int num){
	int sum = 0;
	for(int i =0; i <= num; i++){
		sum +=i;
	}
	return sum;
}
%>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>
<h2>계산 결과</h2>
<br>
<%
	String num = request.getParameter("plus");
	int number = Integer.parseInt(num);
	for(int i=1; i<=number; i++){
%>
		<%= i %>
		
		<% if(i == number){
%>
		<%= "=" %>
		
		<%= sum(number) %>
<%
		}else{ %>
		<%= "+" %>
	<%} 
}
%>	
</body>
</html>