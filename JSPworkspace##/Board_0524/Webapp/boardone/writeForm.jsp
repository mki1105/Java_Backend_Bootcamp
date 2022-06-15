<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--글쓰기 화면 구현 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Board</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/writeFormstyle.css" rel="stylesheet" type="text/css" />
<script src="script.js"></script>
</head>
<%-- 뒤에서 새글, 답변글 구분하는 코드 추가할 부분 1 --%>
<%
    int num = 0;
    int ref = 1; // 참조하는 글
    int step = 0;
    int depth = 0;
    try{
        if(request.getParameter("num") != null){
        	//새 글일 경우에는 num=0이라는 값이 넘어가고
       		//답글일 경우에는 원본 글의 num 값을 받아와서 넘기도록 함.
            num = Integer.parseInt(request.getParameter("num"));
            ref = Integer.parseInt(request.getParameter("ref"));
            step = Integer.parseInt(request.getParameter("step"));
            depth = Integer.parseInt(request.getParameter("depth"));
        }
%>
<body>
	<section>
		<b>글쓰기</b> <%-- 글쓰기 버튼을 클릭했을 때 페이지 이동(액션) --%>
		<article>
			<form method="post" name="writeForm" action="writeProc.jsp"
				onsubmit="return writeSave()">
				<!-- writeProc.jsp 페이지로 이동할 때 넘어가야 하므로 hidden 형태로 넘기기 -->
				<input type="hidden" name="num" value="<%= num %>"/>
				<input type="hidden" name="ref" value="<%= ref %>"/>
				<input type="hidden" name="step" value="<%= step %>"/>
				<input type="hidden" name="depth" value="<%= depth %>"/>
				

				<table class="board">
					<tr>
						<td class="attr">이름</td>
						<td><input type="text" name="writer" /></td>
					</tr>
					<tr>
						<td class="attr">이메일</td>
						<td><input type="email" name="email" /></td>
					</tr>
					<tr>
						<td class="attr">제목</td>
						<td>
						<%
						if (request.getParameter("num")==null){ %>
						<input class="input" type="text" name="subject" />						
						<%} else { %>
						<input class="input" type="text" name="subject" value="[답변]" />
						<%} %>
						</td>
					</tr>
					<tr>
						<td class="attr">내용</td>
						<td><textarea name="content" rows="13" cols="50"></textarea>
						</td>
					</tr>
					<tr>
						<td class="attr">비밀번호</td>
						<td><input type="password" name="pass" /></td>
					</tr>
					<tr>
						<td colspan="2" class="attr"><input type="submit" value="글쓰기" />
							<input type="reset" value="다시작성" /> <input type="button"
							value="목록 " onClick="window.location = 'list.jsp'"></td>
					</tr>
				</table>
			</form>
		</article>
	</section>
<% }catch(Exception e) {
    e.printStackTrace();
} %>
	<!-- 예외처리 들어갈 부분 2 -->
</body>
</html>