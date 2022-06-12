package ExamClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 1����Ʈ �Է�
 */
public class Exam07 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileInputStream fis2 = null;
		try {
			
			fis = new FileInputStream(new File("data.txt")); //ǥ�� �Է�
			int n = fis.read();
			System.out.println((char)n);
			n = fis.read();
			System.out.println((char)n);
			n = fis.read();
			System.out.println(n);
			//�о���� �����Ͱ� ������(������ ������ �о�����) -1 (EOF)
			
			fis2 = new FileInputStream(new File("src\\examjava22\\io02\\Exam06.java"));
			//������ ������ �о����
			while(true) {
				int readData = fis2.read();
				if(readData == -1) {
					break;
				}
				System.out.print((char)readData);
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
			if(fis2 != null) {
				try {
					fis2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}