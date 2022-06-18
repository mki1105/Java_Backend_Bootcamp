package ExamHashSet;

import java.util.HashSet;

/* 내부의 원하는 값을 검색하는 경우는 contains(value)
 * Iterator는 반복자, 요소 접근, 클래스 객체로부터 메서드 가져옴
 * 해쉬코드는 그 객체가 갖고 있는 값을 이용.
 */
public class CustomClass {

	public static void main(String[] args) {

		HashSet<Info> infos = new HashSet<>();
//		Info[] infoArr = new Info[]
//				{ new Info("홍길동", 20), new Info("이순신", 20), new Info("홍길동", 21),
//				new Info("홍길동", 20) };

//		for (int i = 0; i < infoArr.length; i++) {
//			System.out.println(infoArr[i].hashCode());

		// 배열 생성 없이 add에 저장해주기
		infos.add(new Info("홍길동", 20));
		infos.add(new Info("김민경", 20));
		infos.add(new Info("홍길동", 20));
// infos의 값을 tmp에 하나씩 저장해서 출력하기 - 순서대로 출력할거면 사용하면 안됨.
		for (Info tmp : infos) { // foreach
			System.out.println(tmp);
		}
	}
}
