package ExamClass;

/*	����� Ŭ������ 2���� �޼���(write, read)
 *  ����Ʈ ��Ʈ��(�����)_�ƽ�Ű�ڵ� ����� �����͸� ������� ����.
 * 	1����Ʈ ������ ���
 *	��Ʈ���� �ܹ���
 * 	flush�� ���۸� ���ٴ� ��.
 *	close�� �ڵ����� flush�� ���ִ� ��.
 */
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(FileDescriptor.out); // ǥ�� ��� ����
			fos.write(65); //�ƽ�Ű�ڵ� A
			fos.write(66);
			fos.write(67);

			byte[] arr = new byte[] { 97, 98, 99, 100, 101, 102, 103 };
			fos.write(arr);//�迭 ���

			fos.write(arr, 3, 2);//�迭���� 3��°�ڸ����� 2��(int off, int len)
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