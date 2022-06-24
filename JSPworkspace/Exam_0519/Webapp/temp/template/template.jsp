<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- attribute 요청이 유지되는동안 남겨둬야 되는 값,
    	잠시 저장해두는 값, 추가로 저장해두는 값   --%>
 <%
 	String pageTitle = (String) request.getAttribute("pageTitle");
 	String contentPage = request.getParameter("contentPage"); 	
 	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= pageTitle %></title>
</head>
<body>
<table width = "400" border ="1" cellpadding ="2" cellpacing="0">
	<tr>
	<td colspan ="2">
	<jsp:include page ="/actionTag/temp/module/top.jsp"	flush ="false"/></td>
	</tr>
	<tr>
	<td width ="100" align ="top">
	<jsp:include page = "/actionTag/temp/module/left.jsp" flush ="false"/></td>
	<td width ="300" alige ="top">
		<!-- 내용부분 시작 -->
	<jsp:include page ="<%=contentPage %>" flush ="false"/>
		<!-- 내용부분 끝 -->
	</td>
	</tr>
	<tr>
	<td colspan ="2">
	<jsp:include page ="/actionTag/temp/module/bottom.jsp" flush="false"/></td>
	</tr>


</table>
</body>
</html>