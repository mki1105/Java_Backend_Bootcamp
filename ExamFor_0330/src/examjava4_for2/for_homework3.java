package examjava4_for2;

public class for_homework3 {
	/*  첫날에 10원을 예금하고, 다음날에는 전날의 2배를 예금하는
	 *  방식으로 한달동안 저축한 금액은?
	 */
	public static void main(String[] args) {
		 /* int가 4byte에서 비트가 돌기 때문에 21억까지만 저장이 된다.
		  * (long :메모리가 유한하기 때문에 공간을 정해놓고 써야한다.자료형 중요)
		  */
		long money= 10; //첫날 10원 예금 //cpu가 실행할거라는 위치
		long totalmoney =0; //한달 저축금액 bank
		int day=1; // 날짜
	
		//30일까지 입금한 금액을 예금하는 조건문
		for(day=1; day<=30;day++) { // 증가값은 실행한 후 증감됨.
			totalmoney += money; // 첫날 = 10원 이 토탈금액(10원 + 0원)
			System.out.println(day + "일차"+ money +"입금 => 잔액 = " + totalmoney + "원");
			money*=2;		// 다음날 10원의 2배를 
		} 		
		System.out.printf("30일째에는 %,d가 입금되었습니다.",totalmoney);
	}	// if( d <= day ){
		

}	
