package ExamClass_0414;
/* 관리프로그램 만들기
 * 배열 사용하여 회원의 5명의 정보를 저장하는 프로그램
 * 등록, 목록보기, 검색하기, 수정하기, 삭제하기 구현 * 
 */
public class MainClass2 {

	public static void main(String[] args) {
		InfoManager2 ifm2 = new InfoManager2(); //클래스 호출
		// 5명 등록
		ifm2.setInfo(0, "김씨", 10); // 고유번호는 못바꾸나? 
		ifm2.setInfo(1, "윤씨", 20);
		ifm2.setInfo(2, "최씨", 30);
		ifm2.setInfo(3, "한씨", 40);
		ifm2.setInfo(4, "양씨", 50);
		
		// 5명 목록
		System.out.println("(회원 5명 목록)");
		System.out.println("id" + "\t" + "이름" + "\t" + "나이");
		System.out.println(ifm2.printList());
		
		System.out.println("==================");
		System.out.println("(회원 검색하기)");
		System.out.println("id" + "\t" + "이름" + "\t" + "나이");
		ifm2.getSerch("윤씨");
		ifm2.getSerch("밍");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("(회원 수정하기)");
		ifm2.editInfo(1, 22);
		
		System.out.println("==================");
		System.out.println("(회원 삭제하기)");
		ifm2.deleteInfo(3);
		
	}

}
