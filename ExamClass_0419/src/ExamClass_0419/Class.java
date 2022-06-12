package ExamClass_0419;
/* 	Object 클래스
 *  - 자바의 모든 클래스는 object를 상속
 *  어떤 타입의 객체이든지 오브젝트로 관리가 가능함(업캐스팅)
 *  # Object의 메서드를 자식에서 재정의
 *   - equals : 객체 내부의 값 비교
 *   - hashCode : 객체 내부 값으로 객체 식별
 *   - toString : 객체의 설명
 */
public class Class {
	public static void main(String[]args) {
		// 이 객체에 대한 설명 - toString
		// 객체마다 관리되는 식별하는 값. hashcode(고유) - 그 객체가 뭔지 비교
		// 객체가 같은지 아닌지 equals - 참조변수를 비교(내부값비교) 
		// 업케스팅은 참조 범위가 바뀔 뿐이다.
		// 무조건 사용하는 것은 아니고 값을 비교할 때
	
		Object ob1 = new Object();
		System.out.println(ob1.hashCode());
		System.out.println(ob1.toString());
		System.out.println(ob1); //toString() 호출
		Object ob2 = new Object();
		Object ob3 = ob1;
		System.out.println(ob1 == ob2);
		System.out.println(ob1 == ob3);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}
}