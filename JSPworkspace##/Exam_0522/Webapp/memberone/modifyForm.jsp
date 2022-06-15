<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 정보수정 폼 --%>
  <%@ page import = "memberone.*" %>
  <% MemberDao dao = MemberDao.getInstance(); %>
 <%-- <jsp:useBean id= "dao" class = "memberone.MemberDao"/> --%> 
 <%
 	String loginID = (String)session.getAttribute("loginID");
 	MemberDto dto = dao.getMember(loginID);
 	
 %>
<!DOCTYPE html>
<html>
<head>
<%-- script 태그의 src 속성은 외부 스크립트 파일의 url을 명시함 --%>
<script src= "script.js"></script>
<meta charset="UTF-8">
<title>Modify Form</title>
<link href ="css/style.css?after"	rel ="stylesheet" type ="text/css"/>
<link href ="css/regFormstyle.css?after" rel ="stylesheet" type ="text/css"/>
</head>
<body>
<section>
<form method="post" action="modifyProc.jsp" name="regForm">
<table class="regtable">
    <tr>
        <th colspan="2">회원 수정 정보 입력</th>
    </tr>
    <tr>
        <td>아이디 : </td>
     	<td><%= dto.getId() %></td>
    </tr>
    <tr>
        <td>패스워드 : </td>
        <td><input type="password" name="pass" value="<%= dto.getPass() %>"required/></td>
    </tr>
    <tr>
        <td> 패스워드 확인 : </td>
        <td><input type="password" name="repass" value="<%= dto.getPass() %>"required/></td>
    </tr>
    <tr>
        <td>이메일 : </td>
        <td><input type="email" name="email"value="<%= dto.getEmail() %>" required/></td>
    </tr>
    <tr>
        <td colspan="2" class="regsubmit">
        <input type="button" value="정보수정" onClick="updateCheck()"/>&nbsp;&nbsp;
        <input type="reset" value="취소" onClick ="javascript:window.location = 'main.jsp'"/>
       <!-- 로그인한 후 수정화면에서 취소를누르면 main login으로 다시 돌아감 -->
        </td>
    </tr>
</table>
</form>
</section>
</body>
</html>