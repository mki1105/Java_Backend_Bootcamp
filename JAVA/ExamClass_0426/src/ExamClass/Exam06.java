package ExamClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 1����Ʈ �Է�
 */
public class Exam06 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(new File("data.txt")); //ǥ�� �Է�
			int n = fis.read();
			System.out.println((char)n);
			n = fis.read();
			System.out.println((char)n);
			n = fis.read();
			System.out.println((char)n);
			
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

