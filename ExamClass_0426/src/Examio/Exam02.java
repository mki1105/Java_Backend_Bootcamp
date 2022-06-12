package Examio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam02 {
	public static void main(String[] args) {
		FileInputStream fis = null; // ������ ����
		FileOutputStream fos = null; // ����� ������ ��� �� ����

		try {
			fis = new FileInputStream(new File("C:\\javastudy\\workspace\\ExamClass_0426\\data.txt"));
			File newfile = new File("C:\\javastudy\\workspace\\ExamClass_0426\\data2.txt"); // ����� ���� ����
			fos = new FileOutputStream(newfile);
			if (!newfile.exists()) {
				newfile.createNewFile();
			}
			// ����
			while (true) {
				int readData = fis.read();
				if (readData == -1) {
					break;
				}
				fos.write(readData);
			}
			for (int i = 0; i < 10; i++) {
				System.out.print("!");
			}
			if (newfile.exists()) {
				System.out.println("\n���� ����Ϸ�");
			} else
				System.out.println("���� ���� ����");
		}

		catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
