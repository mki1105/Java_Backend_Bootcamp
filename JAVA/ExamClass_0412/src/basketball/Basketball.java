package basketball;
// 농구점수 계산기 만들기
/* 메뉴 이용하여 작성 골 입력(0 :종료) :
 * while문으로 만들고 종료만들기
 * 생성자를 이용해서 count값 초기화(0 또는 임의 값으로 초기화)
 * Getter, Setter 사용하여 사용자 임의로 초기화가 가능하도록
 * 필요한 클래스는? basketball, 골의수 누적계산기, 득점입력메뉴
 */ 
import java.util.Scanner;
public class Basketball { //메인 함수 출력하는 곳
	public static void main(String[] args) {
		// 프로그램 종료시 총점과 총 골 수 출력
		Scanner scan = new Scanner(System.in);
		// 디폴트 생성자 호출
		Scorecalculator shoot1 = new Scorecalculator();
		System.out.println(shoot1.getCountShoot1());
		// while문 만들기
		while(true) {
			System.out.print("(골 입력 :(0:종료): "); //뭘로 입력 받을 것인지?
			int g = scan.nextInt();

			if(g == 0) { //g 골
				System.out.println("프로그램 종료!");
				break;
			}else if(g == 1) { // 골이 1이면
				shoot1.Countplus1();
			}else if(g == 2) { // 골이 2이면
				shoot1.Countplus2();
			}else if(g == 3) { // 골이 3이면
				shoot1.Countplus3();
			}else {
				System.out.println("잘못입력 하셨습니다!");
			}
			// 결과 반환 하는
		}
		System.out.println("골점수 \t골 개수 \t 점수"); //왜 get인지 다시 이해하기
		System.out.println("===================");
		System.out.println(" 1점 : " + "\t" + shoot1.getCountShoot1() +"\t" +  shoot1.countShoot1score());
		System.out.println(" 2점 : " + "\t" + shoot1.getCountShoot2() + "\t" + shoot1.countShoot2score());
		System.out.println(" 3점 : " + "\t" + shoot1.getCountShoot3() + "\t" + shoot1.countShoot3score());
		System.out.println("Total : " + shoot1.getCountShootSum() + "\t" + shoot1.getScoreShootSum());
	}
}