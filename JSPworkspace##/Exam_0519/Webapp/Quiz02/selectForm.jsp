<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력양식 페이지</title>
</head>
<body>
<form action = "selectResult.jsp" method = 'post'>

 학력 :  <select name="grade">
 <option value = "재학생">재학생</option>
 <option value = "학사">학사</option>
 <option value = "전문학사">전문학사</option>
 <option value = "고졸">고졸</option>
 <option value = "자퇴">자퇴</option>
 
 </select><br>
<br>
소속국가 :
<select name="country" size ="3">
<%-- <input type = "text" name= "country" list ="countries"
style="width:150px; height:50px; font-size:10px;"><br>
<datalist id="countries">--%>

	<option value = "대한민국">대한민국</option>
	<option value = "미국" >미국</option>
	<option value = "일본" >일본</option>
</select>
<br><br>
관심분야 :
<select name="category" size ="4" multiple >
<%--<input type = "text" name= "관심분야" list ="관심분야"
style="width:150px; height:50px; font-size:10px;"><br>--%>

	<option value = "컨설팅" >컨설팅</option>
	<option value = "프로듀서" >프로듀서</option>
	<option value = "프로그래머" >프로그래머</option>
	<option value = "서버관리자" >서버관리자</option>
</select>
<br><br>
	
<input type ="submit" value ="전송">
<input type ="submit" value ="초기화">
</form>
</body>
</html>