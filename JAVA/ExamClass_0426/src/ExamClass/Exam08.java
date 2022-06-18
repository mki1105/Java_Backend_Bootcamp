package ExamClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 1바이트 입력
 */
public class Exam08 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(new File("data.txt")); //표준 입력
			byte[] buffer = new byte[512];
//			int n = fis.read(buffer);
//			System.out.println(n);
//			n = fis.read(buffer);
//			System.out.println(n);
//			n = fis.read(buffer);
//			System.out.println(n);
			
			int readCount = 0;
			while((readCount = fis.read(buffer)) != -1) {
				for(int i = 0; i < readCount; i++) {
					System.out.print((char)buffer[i]);
				}
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}