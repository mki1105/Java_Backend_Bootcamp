package ExamClass;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ����Ʈ ��Ʈ��
 * 1����Ʈ ������ ���
 * BufferedOutputStream�� �������� ��� �ξ��ٰ�(����)
 * �ѹ��� ����� �� �ֵ��� ȿ���� ����ų �� �ִ� Ŭ����
 */
public class Exam03 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(new File("data.txt")); // ����
			bos = new BufferedOutputStream(fos); 
			bos.write(65);
			bos.write(66);
			bos.write(67);

			byte[] arr = new byte[] { 97, 98, 99, 100, 101, 102, 103 };
			bos.write(arr);

			bos.write(arr, 3, 2);
			System.in.read(); // ��� �Է��� ��ٸ��� ���� ���

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
