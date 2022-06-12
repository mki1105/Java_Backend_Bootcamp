package examjava6;
	 import java.util.Scanner;
	 
public class While_exam_01 {
  //국어, 영어, 수학 과목 점수를 입력받아 총점, 평균 , 학점을 출력하세요.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float sum, avg =0;
		int kor =0;
		int eng =0;
		int math =0;
		
		while(true) {
			System.out.println("국어점수는 몇점입니까?");
			kor = sc.nextInt();
			System.out.println("영어점수는 몇점입니까?");
			eng =sc.nextInt();
			System.out.println("수학점수는 몇점입니까?");
			math =sc.nextInt();
	
			sum = kor + math + eng;
			avg =(kor + math + eng)/3;
			System.out.println("세 과목의 성적합계는? " + sum + "점");
			System.out.println("세 과목의 성적평균은? " + avg + "점");
		
		 	if(avg > 90) {
		 		System.out.println("A");
		 		break;
		 	} else if(avg <= 89.9 && avg >= 80 ) {
		 		System.out.println("B");
		 		break;
		 	} else if(avg <= 79.9 && avg >= 70 ) {
		 		System.out.println("C");
		 		break;
		 	} else if(avg <=69.9 && avg >=60 ) {
		 		System.out.println("D");
		 		break;
		 	} else if(avg <= 59.9 && avg >=0) {
		 		System.out.println("F");
		 		break;
		 		
		 	}
		 	System.out.println("");
	}
	}
}
