package examjava3;
	import java.util.Scanner;	
public class if_0329_5 {

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수가 짝수이면 출력하시오.
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("정수 2개 입력하시오.");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a>b && a%2==0) {
			System.out.println(a + "는 짝수 입니다");
		} else if(a>b && a%2==1) {
			System.out.println(a + "는 홀수 입니다");
		} else if(b>a && b%2==0) {
			System.out.println(b + "는 짝수 입니다");
		} else if(b>a && b%2==1) {
			System.out.println(b + "는 홀수 입니다");
		}	
		

	}

}
