package examjava4_for;

	import java.util.Scanner;
	//구구단을 출력해보세요.
public class for_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			// a는 결과값
			for(int i =2; i<=9;i++) { //i는 세로 출력값	
				for(int j=1; j<=9; j++) { //j는 가로 출력값 가로로 1씩 9까지 곱해준다
					int a = i*j; // 세로 가로 곱하기가 a 결과값
					System.out.println(i + "*"+j+"="+a); // 결과 출력
				}
			}
		

	}

}
