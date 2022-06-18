package examjava3;
	import java.util.Scanner;	
public class if_0329_6 {

	public static void main(String[] args) {
		// 두 수를 입력받아 합이 짝수이고 3의 배수면 출력하시오
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("두 숫자를 입력하시오");
		a = scan.nextInt();
		b = scan.nextInt();
		int sum = a+b;
		
		if (sum%2==0 && sum%3==0) {
			System.out.println(sum);
	}
	}

}
