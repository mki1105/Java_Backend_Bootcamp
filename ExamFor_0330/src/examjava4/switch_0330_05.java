package examjava4;

import java.util.Scanner;

public class switch_0330_05 {

	public static void main(String[] args) {
		// 메뉴를 만들어 관리프로그램 만들기
		/* 1. 학생이름등록
		 * 2. 국어, 영어, 수학 점수 입력
		 * 3. 학생이름 출력
		 * 4. 총점 출력
		 * 5. 평균 출력
		 * 6. 종료
		 */
		Scanner sc = new Scanner(System.in);
		//필요한 변수들 정하기
		int menu = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		float total = 0, avg = 0;
		String name = ""; // 문자열도 꼭 작성해주기
		
		System.out.println("1. 학생이름등록");
		System.out.println("2. 국어, 영어, 수학 점수 :");
		System.out.println("3. 학생이름출력");
		System.out.println("4. 총점");
		System.out.println("5. 평균");
		System.out.println("6. 프로그램 종료");
		System.out.println("메뉴를 선택하라 :");
		menu = sc.nextInt();
	
		switch(menu) {
		case 1:
			System.out.println("학생이름등록 :");
			name =sc.nextLine();
			System.out.println("학생 " + name + "이 등록되었습니다.");
			break;
		case 2:
			System.out.println("국어점수를 입력하시오.");
			kor=sc.nextInt();
			System.out.println("영어점수를 입력하시오.");
			eng=sc.nextInt();
			System.out.println("수학점수를 입력하시오.");
			math=sc.nextInt();
			System.out.println("국어점수는 " + kor + ", 영어점수는" + eng + ", 수학점수는 "+ math + "입니다.");
			break;
		case 3:
			System.out.println("학생이름 출력");
			name = sc.next();
			System.out.println("등록된 이름 :" + name);
			break;
		case 4:
			System.out.println("과목 총점:");
			total = kor + math + eng;
			System.out.println("총점 :" + total + "점");
			break;
		case 5:
			System.out.println("과목평균:");
			avg = total/3;
			System.out.println("평균 :" + avg + "점");
			break;
		case 6:
			System.out.println("프로그램 종료");
			System.exit(0); //프로그램을 종료하는 메서드
			break;
		}
		System.out.println("시스템을 종료합니다.");
		
	}

}
