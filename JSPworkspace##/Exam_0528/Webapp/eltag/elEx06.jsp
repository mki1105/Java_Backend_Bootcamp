<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "eltag.Thermometer" %>
 <%
 	Thermometer thermometer = new Thermometer();
 	request.setAttribute("t", thermometer);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>온도 변환 예제</title>
</head>
<body>
	${ t.setCelsius('서울', 27.3)}
	서울 온도 : 섭씨 ${ t.getCelsius('서울')} 도 /화씨 ${t.getFahrenheit('서울') }
	</br>
	정보 : ${t.getInfo()}
	<%-- 화씨는 celsius *1.8 + 32.0도 --%>
</body>
</html>