<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%-- 로그인 폼. 로그인 성공할 경우 리다이렉트 되는 페이지,
  	로그인 세션을 검사하여 session값이 존재하면 로그인한 상태로 간주하자 --%>
  	
<% String loginID = (String)session.getAttribute("loginID"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset="UTF-8">
<title>Login</title>
	<link href ="css/style.css" rel = "stylesheet" type ="text/css">
	<link href ="css/mainstyle.css" rel = "stylesheet" type ="text/css">
</head>
<body>
<section>
	<article class = "logininfo">
	<% if(loginID != null ){ %> <!--로그인 아이디가 존재하면  -->
	<table>
		<tr><td colspan ="3"><%= loginID %> 님 환영합니다.</td></tr>
		<tr>
			<td class ="infomenu"><a href ="modifyForm.jsp">정보수정</a></td>
			<td class ="infomenu"><a href ="deleteForm.jsp">회원탈퇴</a></td>
			<td class ="infomenu"><a href ="logoutForm.jsp">로그아웃</a></td>
		</tr>
		</table>			
	<% } else { %> <!-- 로그인 아이디가 없으면 -->
	<script>
		alert("정상적인 접근이 아닙니다. 로그인 해주세요!");
		location.href ="login.jsp"; <%-- 무슨 뜻? --%>
	</script>
	<% } %>	
	</article>
</section>
</body>
</html>