package examjava3;
	import java.util.Scanner;
public class if_0329_4 {

	public static void main(String[] args) {
		// 세 수를 입력받아 큰 순서대로 출력하시오.
		// 변수는 의미파악이 가능한 것으로 만들기(헷갈릴 수 있음)
		// main 영역 안에 있는 것을 지역변수
		Scanner key = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자는?");
		int n1 = key.nextInt();//key는 in 사용 안됨. key로!
		System.out.println("두 번째 숫자는?");
		int n2 = key.nextInt();
		System.out.println("세 번째 숫자는?");
		int n3 = key.nextInt();
		/* 2개의 변수를 갖고 있을 때 값을 교환하려면 임시로 tmp라는 변수를 사용한다.
		 * swap 스와핑으로 값을 옮겨준다.자주 사용되는 기법
		 * 조건 2개로 n1이 가장 크다는 조건도 나오게 됨.
		 * 코드는 최대한 중복되지 않게 작성하기
		 */
		if(n2 >= n1 && n2 >= n3 ) {
				int tmp = n1; //n1에 저장된 값을 tmp에 저장
				n1 = n2; //n2에 저장된 값을 n1에 저장
				n2 = tmp; //tmp에 저장된 값을 n2에 저장
		} else if (n3 >= n1 && n3 >= n2) {
				int tmp =n1; //n1에 저장된 값을 tmp에 저장
				n1 = n3; //n3에 저장된 값을 n1에 저장
				n3 = tmp;//tmp에 저장된 값을 n3에 저장
		} // n1이 가장 크다
		if(n3 >= n2) {
				int tmp =n2;
				n2 = n3;
				n3 = tmp;
		}
		System.out.printf("%d>%d>%d\n", n1, n2, n3);

	}
}

