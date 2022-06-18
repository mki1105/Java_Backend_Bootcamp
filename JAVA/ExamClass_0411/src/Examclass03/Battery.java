package Examclass03;
/* 배터리
 * 속성(필드) : 제조사, 사이즈, 용량, 전압
 * 기능(메서드) : 전기사용()
 */
public class Battery {
	// 속성(값)
	String type; //건전지 종류
	int cap; //용량
	
	// 기능(메서드) - 외부에 전기를 제공하는 기능, 갖고 있는 만큼
	int elec(int use) { //int값을 반환, (필요한 양 얼만큼이 필요한지)
		if(cap - use <= 0) {//갖고 있는 용량에서 얼만큼을 뺴주겠다의 조건
			return 0; // 건전기 용량이 없다.
		}else { // 그게 아니면
			cap -= use; // 용량에서 사용량을 빼준걸
			return use; // 사용량에 넣어주면 값 표현.
		}	//return은 결과값 반환
	}
}