package ExamClass;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * 1바이트 입력
 */
public class Exam05 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(FileDescriptor.in); //표준 입력
			System.out.print("입력:");
			int n = fis.read();
			System.out.println(n);
			
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