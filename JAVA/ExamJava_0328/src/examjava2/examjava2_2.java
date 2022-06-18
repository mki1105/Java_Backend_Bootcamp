package examjava2;

import java.util.Scanner;
public class examjava2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//3과목의 합계와 평균을 입력하고 출력
				System.out.println("첫 번째 과목 점수:");
				double sub1 = in.nextDouble();
				System.out.println("두 번째 과목 점수:");
				double sub2 = in.nextDouble();
				System.out.println("세 번째 과목 점수:");
				double sub3 = in.nextDouble();
		
				double sum = sub1 + sub2 + sub3;
				double avg = sum/3;
				System.out.println("합계 :" + sum + "점");
				System.out.println("평균 :" + avg + "점");

	}

}
