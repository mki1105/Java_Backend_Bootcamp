<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.Enumeration" %>
<%@ page import ="java.util.Map" %>
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

<b>request.getParameter() 메서드 사용 </b><br>

name 파라미터 = <%=request.getParameter("name") %><br>
address 파라미터 = <%= request.getParameter("address") %><br>

<b> request.getParameterValues()메서드 사용  </b>

<%
	String[] values = request.getParameterValues("pet");
	if(values != null){
		for(int i = 0; i <values.length; i ++){
%>
		<%= values[i] %>
<%	
		}
	}
%>
<br>
<b> request.getParameterValues()메서드 사용  </b>

<%-- Enumeration은 객체들을 집합체 형태로 관리해주는 인터페이스
한번에 하나씩 처리할 수 있는 메소드, 데이터 한번에 출력할 수 있음 --%>
<%
	Enumeration enumData = request.getParameterNames();
	while(enumData.hasMoreElements()){
		String name = (String)enumData.nextElement();
%>
	<%= name %>
<%
	}
%>
<br>

<b> request.getParameterValues()메서드 사용  </b>

<%-- getParameter 웹 브라우저가 전송한 파라미터의 맵을 구한다.--%>
<%
	Map parameterMap = request.getParameterMap();
	String[] nameParam = (String[])parameterMap.get("name");
	if(nameParam != null){
%>
name = <%= nameParam[0] %>
<%
	}
%>		

</body>
</html>