package examjava6;
	 import java.util.Scanner;
	 
public class While_exam_1a {
  //국어, 영어, 수학 과목 점수를 입력받아 총점, 평균 , 학점을 출력하세요.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// scanner 선언
		// 변수 선언
		int count = 3;
		int sum = 0;
		float avg; int score; char grade;
		
		System.out.println("국어, 영어, 수학 점수를 차래대로 입력하세요.");
		// while을 통해 점수 입력 받음
		while (count > 0) {
			System.out.print("점수: ");
			score = sc.nextInt();
			// 입력받은 점수가 정상 범위가 아닐 경우
			if (score < 0 || score > 100) {
				System.out.println(score + "점은 정상적인 점수가 아닙니다. 다시 입력하세요.");
			} else {
				sum += score;
				count--;
			}
		}
		
		// 평균 구하기
		avg = sum / 3f;
		
		// switch 조건문에는 정수만 가능해서 int로 형변환
		switch ((int) avg / 10) {
		case 10:
		case 9: grade = 'A';
		case 8: grade = 'B';
		case 7: grade = 'C';
		case 6: grade = 'D';
		default: grade = 'F';
		}
		
		System.out.printf("총점: %d점, 평균: %.2f점, 학점 = %s\n", sum, avg, grade);
	}
}