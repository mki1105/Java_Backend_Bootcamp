package ExamClass;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ����Ʈ ��Ʈ��
 * 1����Ʈ ������ ���
 * ���� ���� ����
 */
public class Exam04 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(new File("data.txt")); // ����
			bos = new BufferedOutputStream(fos, 10); // 512, 1024
			boolean state = true;
			int count = 0;
			while (state) {
				System.out.println();
				System.out.print("count:" + count++ + "�Է�(9:���� ����, 0: ����):");
				int n = System.in.read(); // 1����Ʈ �Է�(�ƽ�Ű�ڵ� �� ����)
				switch (n) {
				case '9':
					bos.flush();
					break; // ���� ����
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