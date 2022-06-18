package Examclass01;
// 클래스 : 객체를 정의해 놓은 것(자료형)
// 관련 있는 속성과 행위를 묶음(멤버)으로 관리
//클래스: 객체를 정의해 놓은 것
	public class Ex04 {
		public static void main(String[] args) {
			//여러 명의 이름과 나이를 저장
			Info[] infos = new Info[3];
			
			infos[0] = new Info();
			infos[0].name = "홍길동";
			infos[0].age = 20;
			
			infos[1] = new Info();
			infos[1].name = "이순신";
			infos[1].age = 25;
			
			infos[2] = new Info();
			infos[2].name = "강감찬";
			infos[2].age = 15;
			
			for(int i = 0; i < infos.length; i++) {
				System.out.println(infos[i].name + "," + infos[i].age);
			}
		}
}