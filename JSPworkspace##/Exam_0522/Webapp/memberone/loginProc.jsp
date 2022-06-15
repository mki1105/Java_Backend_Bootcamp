<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "memberone.*" %>
<% MemberDao dao = MemberDao.getInstance(); %>
<%
 	String id = request.getParameter("id");
 	String pass = request.getParameter("pass");
 	int check = dao.loginCheck(id, pass);
 %>
 <%--로그인 동작 처리할 페이지 (1:로그인 성공, 0:비밀번호 오류, -1:ID없음 )--%>
 
 <%
 	if(check == 1){ // 로그인 성공했을 경우
 		// String name, Object value 각 영역에 속성 저장
 		// 첫 번째 인수는 속성명, 두번째 인수는 저장할 값 모든 타입의 객체 저장 가능
 		session.setAttribute("loginID", id);
 		response.sendRedirect("main.jsp"); // 로그인 성공하면 main.jsp 호출
 	}
 	else if(check == 0) {
 %>
<script>
 		alert("비밀번호가 틀렸습니다.");
 		history.go(-1); // 이전페이지
</script>
 <%
 	}else { // 아이디 없는 경우
 %>
<script>
 		alert("존재하지 않는 아이디입니다.");
 		history.go(-1);
</script>
<%
	}
%>

