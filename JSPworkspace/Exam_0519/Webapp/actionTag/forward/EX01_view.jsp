<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String code = request.getParameter("code");
    	String viewPageURI = null;
    	
    	if(code.equals("A")){
    		viewPageURI = "/actionTag/forward/viewModule/a.jsp";
    	}
    	else if(code.equals("B")){
    		viewPageURI = "/actionTag/forward/viewModule/b.jsp";
    	}
    	else if(code.equals("C")){
    		viewPageURI = "/actionTag/forward/viewModule/c.jsp";;
    	}
    %>
    <%--파라미터는 브라우저에서 주는 것, 요청할 때 자동으로 셋팅이 됨.
   		attribute는 요청이 유지되는 동안 남겨둬야 하는 값,
    	잠시 저장해두는 값, 추가로 저장을 해두는 값이라고 생각하자--%>
    <jsp:forward page = "<%= viewPageURI %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forwarding을 사용하는 페이지 작성</title>
</head>
<body>

</body>
</html>