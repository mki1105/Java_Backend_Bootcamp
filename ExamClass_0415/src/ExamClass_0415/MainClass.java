package ExamClass_0415;

public class MainClass {
	public static void main(String[] args) {
		//Manager객체 준비
		InfoManager im = new InfoManager();
		Info[] infos = im.selectAll();
		//전체 목록 가져오기
		printInfo(infos);
		System.out.println();
		
		//등록 기능 확인
		System.out.println("등록기능 확인");
		System.out.println(im.insertInfo(new Info("홍길동", 20)));
		System.out.println(im.insertInfo("이순신", 24));
		System.out.println(im.insertInfo("강감찬", 65));
		System.out.println(im.insertInfo("신사임당", 54));
		System.out.println(im.insertInfo("홍길동", 23));
		System.out.println(im.insertInfo("임꺽정", 19));
		printInfo(im.selectAll());
		System.out.println();
		
		//검색하기(번호로 검색하여 Info를 가져옴)
		System.out.println("검색기능 확인");
		int idx = im.indexOfSearchInfoName("홍길동");
		System.out.println(idx);
		System.out.println(im.indexOfSearchInfoName(idx+1, "홍길동"));
		System.out.println(im.indexOfSearchInfoName("강감찬"));
		System.out.println(im.indexOfSearchInfoName("장보고"));
		System.out.println(im.indexOfSearchInfoName("임꺽정"));
		
		System.out.println("인덱스로 정보 검색");
		Info tmp = im.searchInfo(4);
		printInfo(tmp);
		printInfo(im.searchInfo(0));
		printInfo(im.searchInfo(7));
		System.out.println();
		
		//수정하기(수정할 객체를 전달)
		System.out.println("수정기능 확인");
		System.out.println(im.editInfo(new Info(0, "홍길동", 200)));
		printInfo(im.searchInfo(0));
		System.out.println(im.editInfo(new Info(10, "고길동", 200)));
		printInfo(im.selectAll());
		printInfo(im.searchInfo(3));
		System.out.println();
		
		//삭제하기(번호로 삭제)
		System.out.println("삭제기능 확인");
		System.out.println(im.removeInfo("신사임당"));
		printInfo(im.selectAll());
		System.out.println();
		im.removeInfo("홍길동");
		printInfo(im.selectAll());
		System.out.println();
		System.out.println(im.insertInfo(new Info("홍길동", 20)));
		System.out.println(im.insertInfo("장보고", 23));
		System.out.println(im.insertInfo("장영실", 21));
		printInfo(im.selectAll());
		System.out.println();
		System.out.println(im.removeInfo("장영실"));
		printInfo(im.selectAll());
		System.out.println();
		printInfo(im.searchInfo(3));
		System.out.println();
		
		//전체 삭제
		System.out.println("전체 삭제 기능");
		im.removeAll();
		printInfo(im.selectAll());

	}
	private static void printInfo(Info[] infos) {
		if(infos == null || infos.length == 0) {
			System.out.println("목록이 없음");
		}
		for(int i = 0; i < infos.length; i++) {
			printInfo(infos[i]);
		}
	}
	private static void printInfo(Info info) {
		if (info == null)
			System.out.println("정보가 없음");
		else {
			System.out.printf("%d번 이름:%s, 나이:%d\n", info.getNumber(), info.getName(), info.getAge());
		}
	}
	
}