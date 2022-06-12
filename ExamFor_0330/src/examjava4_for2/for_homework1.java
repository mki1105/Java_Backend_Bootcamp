package examjava4_for2;

public class for_homework1 {
	//구구단을 출력해보세요.
	public static void main(String[] args) {
		// 2단에서 9단까지 반복(세로/가로)
		 //i는 2단부터 9단까지 반복, j는 곱하는 수
		
		for(int i=2;i<=9;i++) {
			for(int j=1; j<=9;j++) {
				int a = i*j;// 결과
				System.out.println(i + "*" + j + "=" + a);
			}
			
		}//가로 세로로 바꾸려면 곱하는 수를 고정 시키고, 단을 반복시켜라

	}

}
