package Examio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam02 {
	public static void main(String[] args) {
		FileInputStream fis = null; // 복사할 파일
		FileOutputStream fos = null; // 복사될 목적지 경로 및 파일

		try {
			fis = new FileInputStream(new File("C:\\javastudy\\workspace\\ExamClass_0426\\data.txt"));
			File newfile = new File("C:\\javastudy\\workspace\\ExamClass_0426\\data2.txt"); // 복사될 파일 생성
			fos = new FileOutputStream(newfile);
			if (!newfile.exists()) {
				newfile.createNewFile();
			}
			// 복사
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
				System.out.println("\n파일 복사완료");
			} else
				System.out.println("파일 복사 실패");
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
