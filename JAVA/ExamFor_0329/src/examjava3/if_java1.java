package examjava3;

	import java.util.Scanner;

public class if_java1 {
		/* 유원지에서 말을 태워주는데 처음 30분의 기본요금은 1인당 3000원이다.
		 * 이후에는 10분당 500원씩 추가 요금을 받는다. 말을 탄 시간을 입력받아서
		 * 전체 금액을 계산하는 프로그램을 작성하여라.
		 */
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); //입력이 필요하니까 있어야 한다.
		// 1.말을 탄 시간을 입력하라는걸 출력해라
		System.out.println("말을 탄 시간은?");
		// 2.변수 설정해주기, 필요한 값들을 미리 변수로 만들어 놓기(이름 상관없음, 헷갈리지만 않게)
		int pay = 3000;//기본요금
		int time = key.nextInt(); //출력받는 부분 작성하기  int 입력받을 때 nextInt 메서드사용
		// useTime = 0;(이용시간이 얼마), intusePrice =0;(이용금액 얼마)
		// 3. 조건문 작성하기
		if(time <= 30) { //30분 이하시간이면 3000원을 출력해라.
			pay = 3000;
			System.out.printf("금액은 %,d원 입니다.", pay);
		} else  // 4. 이후 10분당 500원씩 추가를 출력해라, 출력문이랑 동시 작성 가능
			pay = 3000 + ((time-30)/10) * 500;
			System.out.printf("금액은 %,d원 입니다.", pay);
			
		key.close();
		
	}
}
