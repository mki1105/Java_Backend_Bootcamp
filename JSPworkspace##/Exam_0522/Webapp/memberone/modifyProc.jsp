<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%-- memberUpdate 메서드를 사용하여 정보수정을 처리할 jsp페이지 --%>
<%@ page import = "memberone.*" %>
  <% MemberDao dao = MemberDao.getInstance(); %>
<% request.setCharacterEncoding("UTF-8");%>
<%--<jsp:useBean id="dao" class="memberone.MemberDao"/>--%> 
<jsp:useBean id="dto" class="memberone.MemberDto"/>
<jsp:setProperty property = "*" name ="dto"/>

<% 
	String loginID = (String)session.getAttribute("loginID");
	dto.setId(loginID);
	dao.memberUpdate(dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Process</title>
<meta http-equiv="Refresh" content="3;url=main.jsp">
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<article>
<font size ="3" face= "바탕체">
<b> 회원정보가 수정 되었습니다.</b><br/><br/>
3초 후에 로그인 페이지로 이동합니다.
</font>
</article>
</body>
</html>