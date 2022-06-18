package examjava3;
	import java.util.Scanner;
public class if_java3 {
	public static void main(String[] args) {
		/* 디스켓 1통에 5000원, 한번에 10통 이상 사면 전체금액의 10%를 할인해준다.
		 * 100통 이상을 사면 전체 금액의 12% 할인해준다.X통의 디스켓을 사려면 얼마가 있어야 하는가?
		 */
		Scanner key = new Scanner(System.in);
		// 1. 필요한 디스켓 출력문 작성하기
		System.out.println("디스켓 몇 통을 구매하시겠습니까?");
		// 2. 변수 설정하기, x가 통이니까 
		int x = key.nextInt(); //int 입력받을 때 nextInt 메서드사용
		double money=0;
		// 3. 조건문 작성하기
		if(x >= 100) { //100통 이상 사면 12%의 조건식
			money = x * 5000 * 0.88;
		} else if (x >=10) { //그렇지 않고 10통 이상 사면 10%의 조건식
			money = x* 5000 * 0.9;
		}
		// 4. 출력문 작성하기
		System.out.println(x + "통 디스켓의 구매금액은 "+ (int)money + "원 입니다");
		
		key.close();
		
	}
}
