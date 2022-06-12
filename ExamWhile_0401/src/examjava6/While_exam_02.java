package examjava6;
	import java.util.Scanner;
public class While_exam_02 {
 /* 하나의 수를 입력 받아 n!을 구하라.(팩토리얼)
  * 규칙 1*2*3*4*5*6*...*n
  * ex: 입력 4 출력 : 4!은 24이다.
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("수를 입력해라");//정수입력
			int num = sc.nextInt();
			// 변수선언
			int fac = num; // 수를 fac값에 저장
			int total =1; // 곱하는 초기값이 1이니까(팩토리얼)
			
			while(fac!=0) {
				total = total*fac; // total 값에 fac숫자를 곱하면서 누적
				fac--;	// 입력받은 숫자를 1씩 감소시키며
			}
				
		System.out.println(num + "! = " + total); //출력하며 반복
	}
	}
