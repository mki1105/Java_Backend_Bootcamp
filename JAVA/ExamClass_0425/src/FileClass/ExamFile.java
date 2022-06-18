package FileClass;

import java.io.File;
import java.io.IOException;

public class ExamFile {
	public static void main(String[] args) {
		// ��ü�� �����ϴ� �Ͱ� ������ �����ϴ� �Ͱ��� ����� ����.
		File file1 = new File("data.txt"); // ���� ������ ����(���� ���� ���� ���� X)
		/*
		 * ���� ��ü ���� �� �����ϴ� ���ڿ��� ���ϰ��[�̸�]
		 * ������ ǥ���� �ƴ� ��� ����η� ǥ��(�� �� ����δ� ������Ʈ ���� ��ġ)
		 */
		System.out.println(file1.exists());
		if (!file1.exists()) { // ������ �ִ��� Ȯ���ϴ� ��.
			try {
				file1.createNewFile();
				System.out.println("���� ����");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("������ ������");
		}

		System.out.println(file1.canExecute());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println(file1.getAbsolutePath());
		try {
			System.out.println(file1.getCanonicalPath());
			System.out.println(file1.getName());
			System.out.println(file1.getParent());
			System.out.println(file1.getPath());
			System.out.println(file1.isDirectory());
			System.out.println(file1.isFile());
			System.out.println(file1.isHidden());
			System.out.println(file1.length());
			// System.out.println(file1.setReadOnly());
			System.out.println(file1.canWrite());
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (!file1.canWrite()) {
			System.out.println("������ ������");
			System.out.println(file1.delete());
		}

	}
}
