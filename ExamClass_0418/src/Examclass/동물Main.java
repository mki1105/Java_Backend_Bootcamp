package Examclass;

public class 동물Main {
	public static void main(String[] args) {
		개 d1 = new 개();
		고래 w1 = new 고래();
		오리너구리 o1 = new 오리너구리();
		
		독수리 e1 = new 독수리();
		닭 c1 = new 닭();
		펭귄 p1 = new 펭귄();
		
		상어 s1 = new 상어();
		광어 k1 = new 광어();
		
		//동물 배열 생성
		동물[] animals = new 동물[] {
				d1, w1, o1, e1, c1, p1, s1, k1
		};
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getClass().getName());
			animals[i].호흡();
			animals[i].움직인다();
			animals[i].잔다();
			System.out.println();
		}
		//포유류 배열 생성
		포유류[] arr = new 포유류[] {
				d1, w1, o1// s1 다른 류는 불가
		};
		for(int i = 0; i < arr.length; i++) {
			arr[i].포유류특징();
		}
		//물에서 사는 생물 배열 생성
		System.out.println("===============");
		물에서사는생물[] warr = new 물에서사는생물[] {
				w1, o1, s1, p1, k1
		};
		for(int i = 0; i < warr.length; i++) {
			warr[i].물생활();
		}
		
		
	}
}