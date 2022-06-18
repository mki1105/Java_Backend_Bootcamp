<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="member.register" /></title>
</head>
<!-- 2번 예제 약관에 동의하면 post 방식으로 true 값을 전송하도록 되어 있음
헤당 값을 전달받은 step2에서는 agree값을 통해 약관의 동의 여부를 확인할 수 있음 -->
<body>
	<h2>
		<spring:message code="term" />
	</h2>
	<p>약관 내용</p>
	<form action="step2" method="post">
		<label> <input type="checkbox" name="agree" value="true">
			<spring:message code="term.agree" />
		</label><input type="submit" value=<spring:message code="next.btn"/>">
	</form>
</body>
</html>