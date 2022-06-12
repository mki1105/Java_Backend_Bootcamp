package examjava3;
import java.util.Scanner;

public class if_java2 {
	
	public static void main(String[] args) {
		/*배달 도시락을 주문하는데 10개까지는 개당 2500원이고 10개를 초과하는 
		 * 양에 대해서는 개당 2400원이다. 배달 도시락의 개수를 입력 받아서
		 * 금액을 계산하는 프로그램을 작성해라.
		 */
		//입력에는 기본작성(key 또는 scan)
		Scanner scan = new Scanner(System.in);
		// 1. 도시락 개수 입력할 출력문만들기
		System.out.println("도시락 개수 입력:");
		// 2. 변수 설정하기 도시락 개수a, 도시락 비용변수 설정(금액은 얼마얼마로 0; 지정하기)
		int a =scan.nextInt(); //int 입력받을 때 nextInt 메서드사용
		int money = 0;
		
		// 3. 조건문 만들기, 10개까지는 개당 2500원이 참이면 실행, 조건이 2개이기 때문에 if와 else만 사용
		if( a <= 10 ) {
			money = a*2500;
	}	else { /* 그렇지 않으면 10개를 초과하는 양에 대한 조건식
			    * 변수에서 10 뺀 값이 10개를 초과하는 개수
				*/
				money = 10*2500 + (a-10)*2400;
	}
		// 4. 출력문 만들기
		System.out.printf("도시락 %d개의 금액은 %,d원 입니다", a, money);
		scan.close();
	}

}
