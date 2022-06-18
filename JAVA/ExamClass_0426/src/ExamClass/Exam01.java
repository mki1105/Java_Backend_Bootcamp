package ExamClass;

/*	입출력 클래스는 2가지 메서드(write, read)
 *  바이트 스트림(입출력)_아스키코드 기반의 데이터만 입출력이 가능.
 * 	1바이트 단위로 출력
 *	스트림은 단방향
 * 	flush는 버퍼를 비운다는 것.
 *	close는 자동으로 flush를 해주는 것.
 */
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(FileDescriptor.out); // 표준 출력 방향
			fos.write(65); //아스키코드 A
			fos.write(66);
			fos.write(67);

			byte[] arr = new byte[] { 97, 98, 99, 100, 101, 102, 103 };
			fos.write(arr);//배열 출력

			fos.write(arr, 3, 2);//배열에서 3번째자리부터 2개(int off, int len)
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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