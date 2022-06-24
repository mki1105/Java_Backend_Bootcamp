<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<meta charset="UTF-8">
<%--선언문에 선언된 numOne은 객체멤버필드로 톰캣이 한번 메모리에 올리면 계속 유지 --%>
<%!
private int numOne = 0; 
public void jspInit(){//오버라이딩
System.out.println("jspInit()호출됨!");
}
public void jspDestory(){//오버라이딩
	System.out.println("jspDestoty()호출됨!");
}
%>
<html>
<head>
<title>Life Cycle</title>
</head>
<body>
<%--numTwo는 service()메서드로 요청 시 마다 초기화--%>
<%
	int numTwo = 0;
	numOne++;
	numTwo++;
%>
<ul>
<li> Number One : <%= numOne %></li>
<li> Number Two : <%= numTwo %></li>
</ul>
</body>
</html>