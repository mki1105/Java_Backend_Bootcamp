<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>파일 정보</title>
<style>
body {
	text-align: center;
}
section{
	width: 700px;
	margin: auto;
}
table{
	border: 1px solid #333;
	width: 500px;
	margin: auto;
}
th{
	border: 1px solid #333;
	background-color: yellow;
}
td{
	border: 1px solid #333;
}
.no{
	background-color: yellow;
	border: 1px solid #333;
	width: 50px;
}
.desc{
	border: 1px solid #333;
	width: 50px;
	height: 100px;
}
.descth{
	border: 1px solid #333;
	width: 50px;
}
.writer{
	border: 1px solid #333;
	width: 100px;
}
.count{
	border: 1px solid #333;
	width: 50px;
}
</style>
</head>
<body>
<h1>업로드 파일 정보</h1>
<section>
	<article>
		<table>
			<tr>
			<th class="no">No.</th>
			<th class="writer" colspan="3">Uploader</th>
			<th class="count">Count</th>
			</tr>
			<tr>
				<td>31</td>
				<td colspan="3">q</td>
				<td>68</td>
			</tr>
			<tr>
			<th class="descth">설명</th>
			<td class="desc" colspan="4">qq</td>
			</tr>
			<tr>
			<th>File</th>
			<td colspan="4"><a href="/filelibrary/libraryboard\upload\1644798467623.png">머리말2.png</a></td>
			</tr>
			<tr><td colspan="5">
				<input type="button" value="수정" onclick="javascrlipt:location.href='modify.jsp?num=31&writer=q'">
				<input type="button" value="삭제" onclick="javascrlipt:location.href='delete.jsp?num=31'">
				<input type="button" value="목록" onclick="javascrlipt:location.href='list.jsp'">
			</td></tr>
		</table>
	</article>
</section>
</body>
</html>