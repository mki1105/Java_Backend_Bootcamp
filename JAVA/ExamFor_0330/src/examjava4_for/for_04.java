package examjava4_for;

public class for_04 {
	//100부터 1까지의 수 중 3의 배수만 출력하세요.
	public static void main(String[] args) {
			for(int i=100; i >=1; i--) {
				if(i % 3==0)
				System.out.println(i);
			}
	}

}
