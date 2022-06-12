package ExamHashSet;

import java.util.Iterator;
import java.util.Random;
import java.util.HashSet;

/* contains(value) : 내부의 원하는 값을 검색하는 경우.
 * Iterator는 반복자, 요소 접근, 클래스 객체로부터 메서드 가져옴
 */
public class lotto {

	public static void main(String[] args) {

		Random ran = new Random();
		//< > 자료형을 명시하는 역할, 다이아몬드 연산자.
		HashSet<Integer> num = new HashSet<>();// HashSet생성, Generic선언

		while (num.size() < 6) {
			num.add(ran.nextInt(45));
		}
		//반복자 패턴으로 내부요소의 접근할 수 있는 정보를 가져올 수 있음. 순회할 수 있음.
		Iterator<Integer> a = num.iterator(); // num번호를 가져오겠다.
		while(a.hasNext()) { //has 메서드로 다음 요소를 검사하여 요소가 있을 경우
			System.out.print(a.next() + ",");//next메서드로 객체를 가져오자.
		}
	}
}

