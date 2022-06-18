package ExamClass_0419;
/* 	Object 클래스
 *  - 자바의 모든 클래스는 object를 상속
 *  어떤 타입의 객체이든지 오브젝트로 관리가 가능함(업캐스팅)
 *  # Object의 메서드를 자식에서 재정의
 *   - equals : 객체 내부의 값 비교
 *   - hashCode : 객체 내부 값으로 객체 식별
 *   - toString : 객체의 설명
 */
public class Class2 {
		public static void main(String[] args) {
			Object ob1 = new Info("홍길동", 20);
			System.out.println(ob1.hashCode());
			System.out.println(ob1.toString());
			System.out.println(ob1); //toString() 호출
			Object ob2 = new Info("홍길동", 20);
			Object ob3 = ob1;
			System.out.println(ob2.hashCode());
			System.out.println(ob1 == ob2);
			System.out.println(ob1 == ob3);
			System.out.println(ob1.equals(ob2));
			System.out.println(ob1.equals(ob3));
		}
	}