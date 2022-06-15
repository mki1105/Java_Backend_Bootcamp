<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	pageContext.setAttribute("name", "page man");
 	request.setAttribute("name", "request man");
 	session.setAttribute("name", "session man");
 	application.setAttribute("name", "application man");
 	System.out.println("firstPage.jsp : ");
 	System.out.println("하나의 페이지 속성 :" + pageContext.getAttribute("name"));
 	System.out.println("하나의 요청 속성 : " + request.getAttribute("name"));
 	System.out.println("하나의 세션 속성 : " + session.getAttribute("name"));
 	System.out.println("하나의 애플리케이션 속성 : " + application.getAttribute("name"));
 	request.getRequestDispatcher("exam10_02.jsp").forward(request, response);
 	// 지정한 페이지로 foward드 하는 것.
 	// 브라우저에 주는 html코드가 없는데 콘솔에 표시가 되고, 브라우저에도 나옴.
 	// foward했기 때문에 나옴. 그대로 2번재 페이지로 전달이 되어서 2번째 페이지가 처리가 되어서 그 결과가 돌아옴.
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
</body>
</html>