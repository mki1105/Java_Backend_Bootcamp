package examjava4_for;

import java.util.Scanner;

public class for_07 {
	//사용자로부터 열 개의 정수를 입력받아 평균을 구하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0; //입력하는 정수값
		int sum =0; // 정수 총합
		float avg =0; //정수 평균
		
		System.out.println("열개의 정수를 입력하시오.");
		
		for(int i =1; i<=10; i++) {//i가 정수의 개수 10번이라고 지칭
			System.out.printf("%d번째 정수는 ?",i);//정수도 반복해서 입력
			a = sc.nextInt();
			sum += a+i;
	}
		avg = sum/10;
		System.out.println("평균은? " + avg);

	}

}
