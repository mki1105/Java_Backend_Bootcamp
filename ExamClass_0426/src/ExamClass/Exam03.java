package ExamClass;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 바이트 스트림
 * 1바이트 단위로 출력
 * BufferedOutputStream은 일정량을 모아 두었다가(버퍼)
 * 한번에 출력할 수 있도록 효율을 향상시킬 수 있는 클래스
 */
public class Exam03 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(new File("data.txt")); // 파일
			bos = new BufferedOutputStream(fos); 
			bos.write(65);
			bos.write(66);
			bos.write(67);

			byte[] arr = new byte[] { 97, 98, 99, 100, 101, 102, 103 };
			bos.write(arr);

			bos.write(arr, 3, 2);
			System.in.read(); // 잠시 입력을 기다리기 위해 사용

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
