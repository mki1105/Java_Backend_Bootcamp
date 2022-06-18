package Examclass02;
// 클래스 : 객체를 정의해 놓은 것(자료형)
// 관련 있는 속성과 행위를 묶음(멤버)으로 관리
// 배열 객체 생성하는거 참고 - String [] name = new String[5]; //문자열 5개 배열 생성
// int[] arr =null; - arr는 배열의 이름, 배열 참조변수 선언, 나중에 만들어질 칸들이 생긴다.
public class Ex03 {
	public static void main(String[] args) {
		InfoGroup ig = new InfoGroup();
		ig.infos = new Info[3]; //
		
		ig.infos[0] = new Info();
		ig.infos[0].name = "홍길동";
		ig.infos[0].age = 20;
		
		ig.infos[1] = new Info();
		ig.infos[1].name = "이순신";
		ig.infos[1].age = 25;
		
		ig.infos[2] = new Info();
		ig.infos[2].name = "강감찬";
		ig.infos[2].age = 15;
		
		for(int i = 0; i < ig.infos.length; i++) {
			ig.infos[i].printInfo();
		}
	}
}
