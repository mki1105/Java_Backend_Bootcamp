package FileClass;

import java.io.File;

public class ExamFile3 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		File wf = new File(".\\dir01\\data.txt"); //��������� ��ȿ
		File ulf = new File("./di101/data/txt"); //���н�/���������� ��ȿ
		// \\�� 2���ϴ� ������\�� �ǹ̿� ��ġ�� �ʰ� �Ϸ���.
		// Os���� ���� �����ڴ� ���� �ٸ�.
		
		StringBuffer path = new StringBuffer();
		path.append(".");
		path.append(File.separator);
		path.append("dir01");
		path.append(File.separator);
		path.append("data.txt");
		System.out.println(path.toString());
		File f = new File(path.toString()); //��� OS���� ��ȿ
		
				
	}
}