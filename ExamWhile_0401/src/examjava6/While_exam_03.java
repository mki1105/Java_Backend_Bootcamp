package examjava6;
	import java.util.Scanner;
public class While_exam_03 {
	//입력받은 수를 거꾸로 출력하라. ex) 입력 :123 출력 :321
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num = sc.nextInt();
		// 변수선언
		// 원본 입력받을 숫자 123
		int numN = 0; // 거꾸로 나오는 결과값
		int x = 10; // 자릿수 나눠주는 값, 나머지값을 나오기 위해 나누는 값
		
		// 입력받을 정수의 첫번째 자리에 넣어주기 위해 변수값변경
		numN = num % x; // 123%10 의 나머지를 자릿수에 넣기 : newN은 나머지 3
		num = num / x; //123/10으로 몫을 num에 넣기 : num은 몫으로 12
		
		while(num > 0) {
			numN = numN * x + num % x; 
			num = num/10;
	}
		System.out.println("거꾸로 입력하면 "+ numN + "입니다.");
	}
/* 참고용
 * public static void main(String[] args) {
		String number; 
		System.out.print(" n = ");
		Scanner scan = new Scanner(System.in); number=scan.nextLine();
		
		int flag=number.length();   
		while(flag >= 0) {
			--flag;
			System.out.print(number.charAt(flag)+" ");
			if (flag == 0)
				break;
		}
 */
}
