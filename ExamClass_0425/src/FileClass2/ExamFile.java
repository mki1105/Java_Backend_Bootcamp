package FileClass2;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ExamFile {
	public static void main(String[] args) {
		// ���� ��� �Ǵ� ���� �̸� �Է� �ޱ�
		Scanner scan = new Scanner(System.in);

		System.out.println("���� ��θ� �Է��Ͻÿ�.");
		String path = scan.nextLine();
		File file1 = new File(path);

		// ���� ���� ���� üũ�ϱ�
		if (!file1.exists()) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		// ������ ���
		else if (file1.isFile()) {
			System.out.println("������ ũ��� ? " + file1.length());

			// ������ ������ �����ð�, ���� ���� �� Ȯ���ϱ�
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� mm�� dd��  HH�� :mm�� :ss��");
			System.out.println("���� ������ ���� �ð���?\n" + sdf.format(file1.lastModified()));
			System.out.println("���������ΰ� ? " + file1.canExecute());
			System.out.println("���������ΰ� ? " + file1.isHidden());
			System.out.println("�б����������ΰ� ? " + file1.canRead());
		}
		// directory���
		else if (file1.isDirectory()) {
			System.out.println("���� �� ������ ������? " + file1.list().length);
			System.out.println("==���� ����Ʈ ���== ");
			for (String f : file1.list()) {
				System.out.println(f);
			}
		}
	}
}
