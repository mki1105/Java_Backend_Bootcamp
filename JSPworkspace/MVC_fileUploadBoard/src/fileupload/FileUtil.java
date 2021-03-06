package fileupload;
//파일을 업로드 해주는 유틸리티 클래스이다. 서블릿에서 이 클래스를 사용해 업로드를 처리할 예정
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class FileUtil {
	// 파일 업로드(multipart/form-data 요청) 처리
	// request객체, 디렉터리의 물리적 경로, 업로드 제한 용량을 매개변수로 객체 생성해 반환
	public static MultipartRequest uploadFile(HttpServletRequest req,
			String saveDirectory, int maxPostSize) {
		try {
			// 파일 업로드
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8");
		} catch (Exception e) {
			// 업로드 실패
			e.printStackTrace();
			return null;
		}
	}
	
	// 명시한 파일을 찾아 다운로드 - request, response  내장 객체와  디렉터리명, 저장된 파일명, 원본파일명을 매개변수로
	public static void download(HttpServletRequest req, HttpServletResponse resp, String directory, String sfileName, String ofileName ) {
		String sDirectory = req.getServletContext().getRealPath(directory); //서블릿에서 디렉터리에 물리적 경로를 받아오는 방법
		try {
			// 파일을 찾아 입력 스트림 생성하기
			File file = new File(sDirectory, sfileName);
			InputStream iStream = new FileInputStream(file);
			
			// 한글 파일명 깨짐 방지
			String client = req.getHeader("User-Agent");
			if(client.indexOf("WOW64") == -1 ) { // 웹 브라우저가 iE가 아닌 경우
				ofileName = new String(ofileName.getBytes("UTF-8"), "ISO-8859-1");
			}
			else {// 웹 브라우저가 iE인 경우
				ofileName = new String(ofileName.getBytes("KSC5601"), "ISO-8859-1");
			}
			
			//파일 다운로드용 응답 헤더 설정
			resp.reset(); // 응답 헤더를 초기화한 후
			resp.setContentType("application/octet-stram"); // 파일 다운로드 창을 띄우기 위한 콘텐츠 타입 지정, 옥텟은 8비트 단위의 바이너리 데이터를 뜻함
			resp.setHeader("Content-Disposition", "attachment; filename =\"" + ofileName + "\"");
			// 웹 브라우저에서 파일 다운로드 창이 뜰 때 워본 파일명이 기본으로 입력외어 있도록 설정
			resp.setHeader("Content-Length", "" + file.length());
			
			//새로운 출력 스트림 생성하기 위해 출력 스트림 초기화
			//out.clear();
			
			// response 내장 객체로부터 새로운 출력 스트림 생성
			OutputStream oStream = resp.getOutputStream();
			// 읽어온 내용을 파일로 출력한 다음
			byte b[] = new byte[(int)file.length()];
			int readBuffer = 0;
			while ((readBuffer = iStream.read(b)) > 0 ) {
				oStream.write(b, 0, readBuffer);
			}
			
			// 입 출력 스트림 닫음
			iStream.close();
			oStream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}
		catch  (Exception e) {
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	//지정한 위치의 파일을 삭제하기
	public static void deleteFile(HttpServletRequest req, String directory, String filename) {
		String sDirectory = req.getServletContext().getRealPath(directory);// 파일이 저장된 디렉터리의 물리적 경로를 얻어온 다음
		File file = new File(sDirectory + File.separator + filename); // 경로와 파일명을 결합하여 파일 객체 생성
		if(file.exists()) {
			file.delete(); // 경로에 파일이 존재하면 삭제하기
		}
	}
}
		

