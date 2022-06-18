package examjava3;
	import java.util.Scanner;
public class if_0329_3 {

	public static void main(String[] args) {
		// 두수를 입력받아 큰 수를 출력하시오.
		Scanner scan = new Scanner(System.in);
			System.out.println("첫 번째?");
			int a = scan.nextInt();
			System.out.println("두 번째?");
			int b = scan.nextInt();
		
			if (a>b) {
			System.out.println("큰수는 " + a);
	}		else {
			System.out.println("큰수는 " + b);
	}
				
	}

}
