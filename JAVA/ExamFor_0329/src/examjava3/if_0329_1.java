package examjava3;
	import java.util.Scanner;
public class if_0329_1 {

	public static void main(String[] args) {
		// 입력한 데이터가 3의 배수인 경우 출력하시오.
		// scanner 없이도 if만 가지고도 가능
		Scanner scan = new Scanner(System.in);
		int abc;
		System.out.println("정수 입력하시오.");
		abc = scan.nextInt();
		
		if(abc%3 == 0) { //3의 배수 연산 작성할 수 있어야 함.
			System.out.println(abc + "는 3의 배수입니다.");
		}
			
			
	}
}
		
	