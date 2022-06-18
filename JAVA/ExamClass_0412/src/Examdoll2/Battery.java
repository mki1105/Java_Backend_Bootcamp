package Examdoll2;

public class Battery {
	int 용량; // 배터리 용량
	String 종류; //배터리 종류 문자열
	
	void insertCap(int cap) { //배터리 삽입용량 정수형 cap 변수로 받기
		용량 = cap;
	}
	
	void insertType(String t) { // 배터리타입 문자열 t로 받기
		종류 = t;
	}
	
	int plus(int w) { // 배터리 사용용량 plus를 정수형 w로 받기
		if(용량 - w > 0) { //	만약 갖고 있는 용량에서 사용량을 뺀게 크면 
			용량 -= w; // 용량에서 사용량을 뺀걸 용량에 누적시키기
			return w; // w사용량 반환
		}else { // 그렇지 않으면
			int tmp = 용량; // 현 용량을 tmp에 보관하고
			용량 = 0; // 배터리 용량이 0이 되면
			return tmp; //tmp결과값 반환
		}
		//return은 결과값 반환

   }
}