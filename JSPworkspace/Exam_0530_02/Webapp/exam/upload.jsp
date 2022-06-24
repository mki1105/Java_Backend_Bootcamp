
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>파일 올리기</title>
<style>
body {
	text-align: center;
}
section{
	margin: auto;
}
table{
	border: 1px solid #333;
	width: 300px;
	margin: auto;
}
.input{
	width: 300px;
}
.bt{
	width: 100px;
}
</style>
</head>
<body>
<h1>파일 올리기</h1>
<section>
	<article>
	<form method="post" enctype="multipart/form-data" action="uploadProc.jsp">
		<table>
			<tr>
			<td><input class="input" type="file" name="uploadFile" required/></td>
			</tr>
			<tr>
			<td><input class="input" type="text" name="writer" placeholder="게시자 이름" required/></td>
			</tr>
			<tr>
			<td><input class="input" type="password" name="pass" placeholder="비밀번호(10자이내)" maxlength="10" required /></td>
			</tr>
			<tr>
			<td><textarea rows="5" class="input" name="description" placeholder="파일설명(100자이내)" maxlength="100" required></textarea></td>
			</tr>
		</table>
		<input class="bt" type="submit" value="올리기"/><input class="bt" type="button" value="목록" onclick='javascript:location.href="list.jsp"'>
	</form>
	</article>
	
</section>
</body>
</html>