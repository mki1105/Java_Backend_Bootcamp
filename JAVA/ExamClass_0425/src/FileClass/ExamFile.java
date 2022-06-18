package FileClass;

import java.io.File;
import java.io.IOException;

public class ExamFile {
	public static void main(String[] args) {
		// 객체를 생성하는 것과 파일이 존재하는 것과는 상관이 없다.
		File file1 = new File("data.txt"); // 파일 정보를 관리(실제 파일 존재 여부 X)
		/*
		 * 파일 객체 생성 시 전달하는 문자열은 파일경로[이름]
		 * 절대경로 표현이 아닌 경우 상대경로로 표현(이 때 상대경로는 프로젝트 폴더 위치)
		 */
		System.out.println(file1.exists());
		if (!file1.exists()) { // 파일이 있는지 확인하는 것.
			try {
				file1.createNewFile();
				System.out.println("파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일이 존재함");
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
			System.out.println("파일이 지워짐");
			System.out.println(file1.delete());
		}

	}
}
