package ExamClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ����Ʈ ��Ʈ��
 * 1����Ʈ ������ ���
 */
public class Exam02 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("data.txt")); //����� ��� ���� ����
			fos.write(65); // �ƽ�Ű�ڵ�
			fos.write(66);
			fos.write(67);

			byte[] arr = new byte[] { 97, 98, 99, 100, 101, 102, 103 };
			fos.write(arr); //�迭 ���

			fos.write(arr, 3, 2);//�迭���� 3��°�ڸ� 2��(int off, int len)

			System.in.read(); // ��� �Է��� ��ٸ��� ���� ���

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close(); //��Ʈ�� �ݱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
