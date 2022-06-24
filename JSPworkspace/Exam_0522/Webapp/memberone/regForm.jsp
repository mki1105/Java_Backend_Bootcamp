<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 회원가입 폼 --%>
<!DOCTYPE html>
<html>
<head>
<%-- script 태그의 src 속성은 외부 스크립트 파일의 url을 명시함 --%>
<script src= "script.js"></script>
<meta charset="UTF-8">
<title>Register Form</title>
<link href ="css/style.css?after"	rel ="stylesheet" type ="text/css"/>
<link href ="css/regFormstyle.css?after" rel ="stylesheet" type ="text/css"/>
</head>
<%-- idCheck 함수를 알아야 하므로 코드 삽입해주기 --%>

<body>
<section>
<form method="post" action="regProc.jsp" name="regForm">
<table class="regtable">
    <tr>
        <th colspan="2">회원 가입 정보 입력</th>
    </tr>
    <tr><%--중복확인 버튼을 구현하고 있는 부분에서 #에서 변경해줌--%>
        <td>아이디 : </td><td><input type="text" name="id" required/>
        <input type="button" value="중복확인" onClick="idCheck(this.form.id.value)"></td>
    </tr>
    <tr>
        <td>패스워드 : </td>
        <td><input type="password" name="pass" required/></td>
    </tr>
    <tr>
        <td> 패스워드 확인 : </td>
        <td><input type="password" name="repass" required/></td>
    </tr>
    <tr>
        <td>이메일 : </td>
        <td><input type="email" name="email" required/></td>
    </tr>
    <tr>
        <td colspan="2" class="regsubmit">
        <input type="button" value="회원가입" onClick="inputCheck()">
        <input type="reset" value="다시 입력"/>
        </td>
    </tr>
</table>
</form>
</section>
</body>
</html>