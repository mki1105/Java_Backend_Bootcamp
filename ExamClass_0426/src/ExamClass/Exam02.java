package ExamClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 바이트 스트림
 * 1바이트 단위로 출력
 */
public class Exam02 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("data.txt")); //출력할 대상 파일 지정
			fos.write(65); // 아스키코드
			fos.write(66);
			fos.write(67);

			byte[] arr = new byte[] { 97, 98, 99, 100, 101, 102, 103 };
			fos.write(arr); //배열 출력

			fos.write(arr, 3, 2);//배열에서 3번째자리 2개(int off, int len)

			System.in.read(); // 잠시 입력을 기다리기 위해 사용

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close(); //스트림 닫기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
