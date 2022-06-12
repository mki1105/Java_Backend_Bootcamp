package examjava4_for2;

public class for_homework2 {
	/* 쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 쥐 한마리가 하루에
	 * 20g씩 쌀을 먹고 10일마다 쥐의 수가 2배씩 증가한다. 며칠만에 창고의
	 * 쌀이 모두 쥐의 먹이가 될까, 그리고 쥐는 총 몇마리인가? 한통은 80kg
	 */
	public static void main(String[] args) {
		// 변수 설정하기
		int rice = 8000000; //한통 80kg*100x통=8000000g
		int mouse =2; // 1쌍 2마리
		int day = 1; // 10일마다 20g씩이니까 200일
			
		for(day=1;day<=200;day++) {
			rice = rice-(mouse*20);	//총 쌀g에서 20g씩 2마리가 먹는걸 계산	
			
			if(day %10 == 0) { //10일당 2배씩 늘어나는거 계산
				mouse *=2;
			}
			if(rice <=0) {
				System.out.printf("쥐는 %d 마리이고,"
						+ "총 %d일 소요됩니다.", mouse, day);
				break;
	}
			
	}

}
}