<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, jsp_jdbc.*" %>
<% 
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	ConnectionPool pool = ConnectionPool.getInstance();
	String id = "",
		password = "",
		name = "",
		mem_num1 = "",
		mem_num2 = "",
		e_mail = "",
		phone = "",
		zipcode = "",
		address = "",
		job = "";
	int counter = 0;
	try{
		conn = pool.getConnection();
		stmt = conn.createStatement(); // sql만들어주는 역할, 접속으로부터 전송할 수 있는 준비
		rs = stmt.executeQuery("select * from TEMPMEMBER"); //쿼리 전송
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP에서 데이터베이스 연동하기</title>
</head>
<body bgcolor = "#FFFFCC">
<h2>JSP 스크립틀릿에서 데이터베이스를 연동하는 예제</h2><br><br>
<h3>회원정보</h3>
	<table bordercolor = "#0000FF" border="1">
		<tr>
			<td><strong> ID </strong></td>
			<td><strong> PASSWORD </strong></td>
			<td><strong> NAME </strong></td>
			<td><strong> MEM_NUM1 </strong></td>
			<td><strong> MEM_NUM2 </strong></td>
			<td><strong> E_MAIL </strong></td>
			<td><strong> PHONE </strong></td>
			<td><strong> ZIPCODE </strong></td>
			<td><strong> ADDRESS </strong></td>
			<td><strong> JOB </strong></td>
		</tr>
<%
	if(rs != null){
		while(rs.next()){
			id = rs.getString("id");
			password = rs.getString("password");
			name = rs.getString("name");
			mem_num1 = rs.getString("mem_num1");
			mem_num2 = rs.getString("mem_num2");
			e_mail = rs.getString("e_mail");
			phone = rs.getString("phone");
			zipcode = rs.getString("zipcode");
			address = rs.getString("address");
			job = rs.getString("job");
		
%>		
	<tr>
		<td><%= id %></td>
		<td><%= password %></td>
		<td><%= name %></td>
		<td><%= mem_num1 %></td>
		<td><%= mem_num2 %></td>
		<td><%= e_mail %></td>
		<td><%= phone %></td>
		<td><%= zipcode %></td>
		<td><%= address %></td>
		<td><%= job %></td>
<%
			counter++;
			} //while
		} //if
%>
		</tr>
	</table><br><br>
	total records : <%= counter %>
<%
	}catch(SQLException e){
		System.out.println("sql exception");
		e.printStackTrace();
	}catch(Exception e){
		System.out.println("exception");
		e.printStackTrace();
	}finally{
		if(rs != null) {
			try {
				rs.close();
				} catch (SQLException e) {}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {}
		}
		if(conn != null) {
			try {pool.releaseConnection(conn);
				} catch (SQLException e) {}
	}
}
%>
</body>
</html>