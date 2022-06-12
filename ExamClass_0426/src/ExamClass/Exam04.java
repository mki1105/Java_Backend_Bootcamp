package ExamClass;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 바이트 스트림
 * 1바이트 단위로 출력
 * 버퍼 이해 예제
 */
public class Exam04 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(new File("data.txt")); // 파일
			bos = new BufferedOutputStream(fos, 10); // 512, 1024
			boolean state = true;
			int count = 0;
			while (state) {
				System.out.println();
				System.out.print("count:" + count++ + "입력(9:버퍼 비우기, 0: 종료):");
				int n = System.in.read(); // 1바이트 입력(아스키코드 한 글자)
				switch (n) {
				case '9':
					bos.flush();
					break; // 버퍼 비우기
				case '0':
					state = !state;
				}
				System.in.read();
				System.in.read();
				bos.write(n);
			}

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