package basketball;
//농구점수 계산기 만들기
/* 메뉴 이용하여 작성 골 입력(0 :종료) :
* while문으로 만들고 종료만들기
* 생성자를 이용해서 count값 초기화(0 또는 임의 값으로 초기화)
* Getter, Setter 사용하여 사용자 임의로 초기화가 가능하도록
* 필요한 클래스는? basketball, 골의수 누적계산기,득점입력메뉴
*/ 
public class Scorecalculator {
	//득점 메뉴 입력(1,2,3점메뉴 입력 시 해당 골과 득점 입력)
	private int countShoot1; //슛 횟수 
	private int countShoot2;
	private int countShoot3;
	
	private int scoreShoot1; //슛 득점
	private int scoreShoot2;
	private int scoreShoot3;
	
	private int countShootSum;// 슛 횟수 합
	private int scoreShootSum;// 득점 합
	
	//생성자, 슛횟수 0으로 초기화
	Scorecalculator () {
		countShoot1 =0;
		countShoot2 =0;
		countShoot3 =0;
	}
	//사용자가 각 슛 횟수 초기화하는 메서드 //this 다시 이해하기
	public void setCountShoot1(int countShoot1) {
		this.countShoot1 = countShoot1;
	}
	public void setCountShoot2(int countShoot2) {
		this.countShoot2 = countShoot2;
	}
	public void setCountShoot3(int countShoot3) {
		this.countShoot3 = countShoot3;
	}
	//슛 횟수 반환하는 메서드
	public int getCountShoot1() {
		return countShoot1;
	}
	public int getCountShoot2() {
		return countShoot2;
	}
	public int getCountShoot3() {
		return countShoot3;
	}
	
	// 슛을 횟수 추가하는 메서드
	public void Countplus1() {
		this.countShoot1++;
	}
	public void Countplus2() {
		this.countShoot2++;
	}
	public void Countplus3() {
		this.countShoot3++;
	}
	// 슛의 합산 점수 메서드
	public int countShoot1score() {
		scoreShoot1 = countShoot1 * 1; //1회슛을 스코어 1에 담기
		return scoreShoot1;
	}
	public int countShoot2score() {
		scoreShoot2 = countShoot2 * 2; //2회슛을 스코어 2에 담기
		return scoreShoot2;
	}
	public int countShoot3score() {
		scoreShoot3 = countShoot3 * 3; //3회슛을 스코어 3에 담기
		return scoreShoot3;
	}
	// 슛 횟수 합 반환하기
	public int getCountShootSum() {
		countShootSum = countShoot1 + countShoot2 + countShoot3;
		return countShootSum;
	}
	// 슛 득점 합 반환하기
	public int getScoreShootSum() {
	scoreShootSum = scoreShoot1 + scoreShoot2 + scoreShoot3;
	return scoreShootSum;
	}
}


