package ExamHashSet;

import java.util.Scanner;
import java.util.HashSet;

public class ExamHashSet2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>();
		// < > 자료형을 명시하는 역할, 다이아몬드 연산자.
		// hash가 중복값 체크해줌.
		// 할필요 없음? boolean flag;
		while (true) {
			System.out.println("입력(현재길이 : " + hs.size() + ") : ");
			int a = scan.nextInt();
			if (hs.add(a)) {
				System.out.println(hs);
			} else {
				System.out.println("중복!");
				break;
			}
		}

	}
}
