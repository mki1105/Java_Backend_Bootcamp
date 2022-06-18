package Examclass01;
// 클래스 : 객체를 정의해 놓은 것(자료형)
// 관련 있는 속성과 행위를 묶음(멤버)으로 관리
// 
public class Ex02 {

		public static void main(String[] args) {
			//여러 명의 이름과 나이를 저장
			String[] name = new String[3];
			int[] age = new int[3];
			
			name[0] = "홍길동";
			age[0] = 20;
			
			name[1] = "이순신";
			age[1] = 22;
			
			name[2] = "강감찬";
			age[2] = 23;
			
			for(int i = 0; i < 3; i++) {
				System.out.println(name[i] + "," + age[i]);
			}
			
			//이름과 나이는 같은 index로 관리
			//실수 가능성
			name[0] = "홍길";
			age[1] = 34;

	}

}
