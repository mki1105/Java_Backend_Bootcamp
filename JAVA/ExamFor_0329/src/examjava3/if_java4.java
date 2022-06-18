package examjava3;
	import java.util.Scanner;
public class if_java4 {
  /*
   * 
   */
	public static void main(String[] args) {
		// 세과목 성적 입력받아
		Scanner scan = new Scanner(System.in);		
		System.out.println("국어점수는 ?");
		int kor = scan.nextInt();
		System.out.println("수학점수는?" );
		int math = scan.nextInt();
		System.out.println("영어점수는?");
		int eng = scan.nextInt();
		// 성적 합계와 평균 구해
		int sum = kor + math + eng;
		double avg = (kor + math + eng)/3;
		System.out.println("세 과목의 성적합계는" + sum);
		System.out.println("세 과목의 성적평균은" + avg);
		//평균이 90점 이상이면 a, 80이상이면 b... if 조건 만들어
			if (avg >= 90) {
				System.out.println("A");
		}		else if (avg >= 80) {
				System.out.println("B");
		}		else if (avg >= 70) {
				System.out.println("C");
		}		else if (avg >= 60) {
				System.out.println("D");
		}		else if (avg < 60) 	{
				System.out.println("F");
		}
		
	}

}
