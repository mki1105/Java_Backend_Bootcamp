package ExamHashSet;
/* 내부의 원하는 값을 검색하는 경우는 contains(value)
 * Iterator는 요소 접근, 클래스 객체로부터 메서드 가져옴
 * 해쉬코드는 그 객체가 갖고 있는 값을 이용.
 */
public class ExamHashSet3 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = new String("hellp");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = new Integer(2);

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());

	}
}
