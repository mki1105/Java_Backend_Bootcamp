package examjava4_for;
 import java.util.Scanner;
public class for_06 {
	//두수를 입력받아 두 수 사이의 합을 구하세요
	//초기값, 조건식, 증감식
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = 0;
		int b =0;
		int sum =0;
		
		System.out.println("첫 번째 수를 입력하시오.");
		a = sc.nextInt(); //시작숫자
		System.out.println("두 번째 수를 입력하시오.");
		b = sc.nextInt(); //마지막 숫자
		
			for(int i =1; i <= b; i++) { 
				sum += i;
	}
			System.out.printf("%d~%d의 수 합은 %d입니다.", a,b,sum);
	}

}
