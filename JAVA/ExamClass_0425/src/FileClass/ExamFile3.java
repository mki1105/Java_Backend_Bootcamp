package FileClass;

import java.io.File;

public class ExamFile3 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		File wf = new File(".\\dir01\\data.txt"); //윈도우즈에서 유효
		File ulf = new File("./di101/data/txt"); //유닉스/리눅스에서 유효
		// \\를 2개하는 이유는\의 의미와 겹치지 않게 하려고.
		// Os마다 파일 구분자는 서로 다름.
		
		StringBuffer path = new StringBuffer();
		path.append(".");
		path.append(File.separator);
		path.append("dir01");
		path.append(File.separator);
		path.append("data.txt");
		System.out.println(path.toString());
		File f = new File(path.toString()); //모든 OS에서 유효
		
				
	}
}