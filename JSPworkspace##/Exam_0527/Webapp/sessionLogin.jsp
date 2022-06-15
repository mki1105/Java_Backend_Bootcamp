<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
  
  	String id = request.getParameter("id");
  	String password = request.getParameter("password");
  	
		 // String name, Object value 각 영역에 속성 저장
  		// 첫 번째 인수는 속성명, 두번째 인수는 저장할 값 모든 타입의 객체 저장 가능
  	if(id.equals(password)){
  		session.setAttribute("MEMBERID", id);
  	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
로그인 성공
</body>
</html>
<%
}else { //로그인 실패 했을 경우
%>
<script>
alert("로그인에 실패하였습니다.");
history.go(-1);
</script>
<%
}
%>
