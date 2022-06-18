package ExamHashSet;
/* contains(value) : 내부의 원하는 값을 검색하는 경우.
 * Iterator는 반복자, 요소 접근 /클래스 객체로부터 메서드 가져옴(print와 비슷한 개념)
 * equals : 중복처리를 위해 비교하기 위한 메서드
 * hashcode 그 객체가 갖고 있는 값
 */
import java.util.Scanner;
import java.util.HashSet;

public class ExamHashSet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();

		// 할필요 없음 boolean flag;
		while (true) {
			System.out.print("입력(현재길이:" + hs.size() + ") :");
			String s = scan.nextLine();
			if (hs.add(s)) {// s에 값이 있으면- 데이터 저장하는 메서드 add
			//모든 클래스가 오브젝트를 상속하니까 업캐스팅해서 오브젝트로 관리하게 됨.
				System.out.println(hs);
			} else {
				System.out.println("중복!");
				break;
			}
		}

	}
}
