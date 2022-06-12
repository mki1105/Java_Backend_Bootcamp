package Examclass03;
public class Exdoll_02 { //완성본
	public static void main(String[] args) {
	//건전지, 인형 객체 생성
	//말하는 인형을 사용하는 개념
	Doll doll1 = new Doll(); // 객체를 생성하는 것(메모리에 실체를 만들어내는 것)
	/* heap(동적(자유)메모리)- 실행중에 만들어지는 것을 생성할 수 있는 곳.
	 * 내부기능을 사용하고 싶으면 참조를 하기 위해서는 참조변수가 필요함
	 * 말하는 인형을 참조할 수 있는 doll1이다.
	 * 참조변수(doll1)에 말하는 인형을 생성하고, 생성된 객체를 참조하는 정보를 넣겠다.
	 */
	// doll1.voicein(); // 정의되어 있는 출력이라는 코드가 동작한다. message 반환해줌
	String m = doll1.voiceout(); // 리턴되는 메시지를 받아서 무슨 메시지가 출력되는지 볼 수 있다.
	System.out.println(doll1 + " 인형 왈 : " + m);
	
	Battery b1 = new Battery();
	b1.cap = 100;
	b1.type = "AA";
			
	doll1.setBatt(b1); // 셋베터리에 b1에 넣어보기, 객체를 참조할 수 있게 연결해준다.
	//인형안에 메시지가 저장이 되어야 하는건 인형이 해야한다.
	doll1.voicein("객체지향 안녕"); //인형한테 메시지가 넘어가는 것.
	m = doll1.voiceout(); // 다시 출력해보기
	System.out.println(doll1 + " 인형 왈 :" + m); //doll1 참조값 출력해보기
	
	b1 = doll1.removebatt(); //1에 배터리 제거한걸 b1에 다시 담기
	Doll doll2 = new Doll(); //인형 2 생성하기
	doll2.setBatt(b1);//2에 b1을 다시 넣어주기, 건전지를 1에 삽입했다가 2에다시 삽입
	
	doll2.voicein("난 두번째 객체야");
	m = doll2.voiceout();
	System.out.println(doll2  + " 인형 왈 : " + m);

	Battery b2 = new Battery(); //b2건전지 사옴
	b2.cap = 50;
	b2.type = "AA";
	
	//Battery
	
	doll1.setBatt(b2); //,,
	m = doll1.voiceout(); //객체는 다르기 때문에 2는 2, 1은 1로 영향 주지 않는다.
	System.out.println(doll1 + " 인형 왈 :" + m);
	
	m = doll1.voiceout(); // 또 출력
	System.out.println(doll1 + " 인형 왈 :" + m);

	}
}
