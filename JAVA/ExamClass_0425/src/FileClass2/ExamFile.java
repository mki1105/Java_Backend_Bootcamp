package FileClass2;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ExamFile {
	public static void main(String[] args) {
		// 파일 경로 또는 파일 이름 입력 받기
		Scanner scan = new Scanner(System.in);

		System.out.println("파일 경로를 입력하시오.");
		String path = scan.nextLine();
		File file1 = new File(path);

		// 파일 존재 여부 체크하기
		if (!file1.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		// 파일일 경우
		else if (file1.isFile()) {
			System.out.println("파일의 크기는 ? " + file1.length());

			// 파일의 마지막 수정시간, 직접 수정 후 확인하기
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일  HH시 :mm분 :ss초");
			System.out.println("파일 마지막 수정 시간은?\n" + sdf.format(file1.lastModified()));
			System.out.println("실행파일인가 ? " + file1.canExecute());
			System.out.println("숨김파일인가 ? " + file1.isHidden());
			System.out.println("읽기전용파일인가 ? " + file1.canRead());
		}
		// directory라면
		else if (file1.isDirectory()) {
			System.out.println("파일 및 폴더의 개수는? " + file1.list().length);
			System.out.println("==파일 리스트 출력== ");
			for (String f : file1.list()) {
				System.out.println(f);
			}
		}
	}
}
