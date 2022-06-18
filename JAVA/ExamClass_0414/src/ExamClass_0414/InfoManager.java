package ExamClass_0414;

/* 배열 사용하여 회원의 5명의 정보를 저장하는 프로그램
 * 등록, 목록보기, 검색하기, 수정하기, 삭제하기 구현
 */
public class InfoManager {
	public static final int DEFAULT_SIZE = 5; // 상수값 변수 5
	// 메모리에 new로 Info클래스를 담을 객체를 변수 infos로 생성.
	private Info[] infos = new Info[DEFAULT_SIZE];//

	// 등록하기 5명 설정, 초기화하기 new로 //인자 3개 등록 받을 것이 3개니까
	void setInfo(int id, String name, int age) { // 1명찍을 때
		// infos변수 id자리에 참조해주기 id,name,age는 한 묶음
		// id가 0번째이면 3개가 한번에 들어간다고 생각하자.
		infos[id] = new Info(id, name, age);
	}
	// 목록보기 - 5명 목록이 다 나와야지, 인자? 값 받을 것이 없으니 get으로
	void getInfoList() { // 객체에 접근하려면 for반복문으로
		for (int i = 0; i < infos.length; i++) {
			if (infos[i] != null) {// 만약 i라는 자리에 값이 없으면? 노출력
				// System.out.println("값이 존재하지 않습니다.");
			} else { // 값이 있으면 ? 다 출력
				System.out.println(infos[i].getId() + "\t" + infos[i].getName() + "\t" + infos[i].getAge());
			}
		}
	}
	// 검색하기 - 이름을 검색했을 때 나오도록, 인자를 name으로 받을 것.
	void getSerch(String name) { // 객체에 접근하려면 for반복분으로 그 안에 다 돌기
		for (int i = 0; i < infos.length; i++) {
			// 만약 이름 검색을 했는데 값이 나오면? 출력? 객체가 존재하면! 그 자리와 같다면
			if (infos[i] != null) { // null을 활용하자
				if (infos[i].getName() == name) {// infos배열 자리에 이름이 같다면
					System.out.println(infos[i].getId() + "\t" + infos[i].getName() + "\t" + infos[i].getAge());
					return; //출력하고 메서드 종료
				}
			}
		}
		// 만약 이름 검색을 했는데 값이 안나오면 값이 없다.
		System.out.println("값이 존재하지 않습니다.");
	}
	// 수정하기 오버로딩- 수정은 setname으로 설정해서 변경해주기
	// 1. 고유번호 받아서  age수정, id가 기준이니까
	void editInfo(int id, int age) { //
		if (infos[id] != null) { // 나이를 수정하고자 하는 회원이 있다면
			infos[id].setAge(age);
			;
		} else {
			System.out.println("해당 데이터가 존재하지 않습니다.");
		}

	}
	// 2. 고유번호 받아서   id가 기준이니까
	void editInfo(int id, String name) { // id를 수정하고자 하는 사람이 있다면
		if (infos[id] != null) {
			infos[id].setName(name);
		} else {
			System.out.println("해당 데이터가 존재하지 않습니다.");

		}
	}
	// 3. 고유번호받아서 이름, 나이 바꾸기
	void editInfo(int id, String name,int age) {
		if (infos[id] != null) {
			infos[id].setName(name);
			infos[id].setId(id);
		} else {
			System.out.println("해당 데이터가 존재하지 않습니다.");

		}
	}
	// 삭제하기 - 삭제 하고자 하는 것을 인자값으로 받기
	void deleteInfo(int id) {
		if (infos[id] != null) { // 만약 값이 있다면 삭제해주기
			infos[id] = null;// null 활용하기(비운다)
			System.out.println(id + "번 값이 삭제 되었습니다.");
		} else // 인덱스에 객체가 존재하지 않으면
			System.out.println("해당 데이터가 존재하지 않습니다.");
	}
}
