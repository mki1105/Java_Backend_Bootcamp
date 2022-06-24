<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전송 결과</title>
</head>
<body>
	<%
request.setCharacterEncoding("UTF-8");
String savePath = "/fileUpload/upload";
int uploadFileSizeLimit = 5 * 1024 * 1024;
String encType = "UTF-8";
ServletContext context = getServletContext();
String uploadFilePath = context.getRealPath(savePath);
try {
    MultipartRequest multi = new MultipartRequest(
                    request, uploadFilePath,
                    uploadFileSizeLimit, encType,
                    new DefaultFileRenamePolicy());
    Enumeration files = multi.getFileNames();
    while (files.hasMoreElements()){
    	String file =(String) files.nextElement();
    	// Enumeration 으로 얻어온 파일 이름을 getFilesystemName()의 매개변수로
    	//전달하여 업로드된 파일 이름 가져오기
    	String file_name = multi.getFilesystemName(file);
    	// 중복된 파일을 업로드 할 경우 파일명 뒤에 번호를 자동으로 붙어 새로운 파일이름을 제공.
    	String ori_file_name = multi.getOriginalFileName(file);
    	out.print("<br> 업로드된 파일명 : " + file_name);
    	out.print("<br> 원본 파일명 : " + ori_file_name);
    	out.print("<hr> ");
    }
}// try 닫
	catch (Exception e){System.out.print("예외 발생 :" + e);} //catch
%>
</body>
</html>