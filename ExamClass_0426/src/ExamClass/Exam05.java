package ExamClass;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * 1����Ʈ �Է�
 */
public class Exam05 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(FileDescriptor.in); //ǥ�� �Է�
			System.out.print("�Է�:");
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