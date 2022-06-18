package IoExam;

import java.io.Serializable;
//등록 ,검색, 수정, 삭제, 목록
import java.util.ArrayList;

public class InfoManager implements Serializable {
	// ArrayList 객체 생성. <> 자료형, 객체 넣어도 됨.
	ArrayList<Info> list = new ArrayList<>();

//	InfoManager() {
//	}
//
//	InfoManager(int id, String name, int age) {
//		super(id, name, age);
//	}

	// 등록하기
	public void listadd(int id, String name, int age) {
		list.add(new Info(id, name, age));
	}

	// 목록보기 (list의 값을 tmp에 하나씩 저장해서 출력하기)
	public String printList() {
		String result = "";
		for (Info tmp : list) {
			result += tmp.toString(); // tmp만 하면 주소값만 출력이 되니까 toString
		}
		return result;
	}

	// 수정하기 번호id 받아서 이름 수정
	public boolean edit(int id, String name) {
		return edit(id, name, -1);
	}// -1로 해버리면 고정이 되어버리니 아래 조건문.

//		for (Info tmp : list) {
//			if (tmp.getId() == id) {
//				tmp.setName(name);
//				return true;
//				}

	// 번호id 받아서 이름과 나이 수정
	public boolean edit(int id, String name, int age) {
		for (Info tmp : list) { // 목록을 tmp에 하나씩 담고 객체 접근 데이터 찾기 위해
			if (tmp.getId() == id) { // 내가 찾고자 하는 id가 입력한 id와 같다면
				// tmp.setAge(age); // 나이는 입력한 나이로 수정
				tmp.setName(name); // 이름은 입력한 이름으로 수정
				if (age != -1) // -1과 같지 않다면,
					tmp.setAge(age); // 나이 그대로 출력
				return true;
			}
		}
		return false;
	}

	// 검색하기
	public Info serch(String name) { // 이름으로 검색할 것.
		for (Info tmp : list) { // 클래스 자료형 Info
			if (tmp.getName().equals(name)) {//
				return tmp; // 그 값그대로 출력
//			if (tmp.getName() == name) {
//				result += tmp.toString();
			}
		}
		return null;
	}

	// 삭제하기
	/*
	 * remove(int로 할거면 인덱스 위치로 접근)
	 * remove(Object로 할거면 값이 똑같은 것으로 접근)
	 * 
	 */
	public boolean delete(int id) { // 값을 지울거임
		for (Info tmp : list) { // 객체 접근했는데
			if (tmp.getId() == id) { // 찾고자 하는 id와 같으면
				list.remove(tmp);// 삭제
				return true;
			}
		}
		return false;
	}
}
