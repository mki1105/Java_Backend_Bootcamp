package Student2;

public class MainClass2 {
	public static void main(String[] args) {
		// Manager객체 준비
		StudentManager im = new StudentManager();
		Student[] infos = im.selectAll();
		// 전체 목록 가져오기
		printStudent(infos);
		System.out.println();

		// 등록 기능 확인
		System.out.println("등록기능 확인");
		System.out.println(im.insertStudent(new Student(-1, "홍길동", 20, 11, 11, 11)));
		System.out.println(im.insertStudent("이순신", 24));
		System.out.println(im.insertStudent("강감찬", 65));
		System.out.println(im.insertStudent("신사임당", 54));
		System.out.println(im.insertStudent("홍길동", 23));
		System.out.println(im.insertStudent("임꺽정", 19));
		im.setScore(1, new int[] { 22, 22, 22 });
		im.setScore(2, new int[] { 33, 33, 33 });
		im.setScore(3, 44, 44, 44);
		im.setScore(4, 55, 55, 55);
		im.setScore(4, StudentManager.KOR, 77);
		im.setScore(4, StudentManager.ENG, 77);
		im.setScore(4, StudentManager.MAT, 77);

		printStudent(im.selectAll());
		System.out.println();

		// 검색하기(번호로 검색하여 Info를 가져옴)
		System.out.println("검색기능 확인");
		int idx = im.indexOfSearchStudentName("홍길동");
		System.out.println(idx);
		System.out.println(im.indexOfSearchStudentName(idx + 1, "홍길동"));
		System.out.println(im.indexOfSearchStudentName("강감찬"));
		System.out.println(im.indexOfSearchStudentName("장보고"));
		System.out.println(im.indexOfSearchStudentName("임꺽정"));

		System.out.println("인덱스로 정보 검색");
		Student tmp = im.searchStudent(4);
		printStudent(tmp);
		printStudent(im.searchStudent(0));
		printStudent(im.searchStudent(7));
		System.out.println();

		// 수정하기(수정할 객체를 전달)
		System.out.println("수정기능 확인");
		System.out.println(im.editStudent(new Student(0, "홍길동", 200, 100, 100, 100)));
		printStudent(im.searchStudent(0));
		System.out.println(im.editStudent(new Student(10, "고길동", 200, 9, 9, 9)));
		printStudent(im.selectAll());
		System.out.println();
		printStudent(im.searchStudent(3));
		System.out.println();

		// 삭제하기(번호로 삭제)
		System.out.println("삭제기능 확인");
		System.out.println(im.removeInfo("신사임당"));
		printStudent(im.selectAll());
		System.out.println();
		im.removeInfo("홍길동");
		printStudent(im.selectAll());
		System.out.println();
		System.out.println(im.insertStudent(new Student(-1, "홍길동", 20, 88, 88, 88)));
		System.out.println(im.insertStudent("장보고", 23));
		im.setScore(im.indexOfSearchStudentName("장보고"), new int[] { 99, 99, 99 });
		System.out.println(im.insertStudent("장영실", 21));
		idx = im.indexOfSearchStudentName("장영실");
		if (idx != -1) {
			im.setScore(idx, new int[] { 10, 10, 10 });
		}
		printStudent(im.selectAll());
		System.out.println();
		System.out.println(im.removeInfo("장영실"));
		printStudent(im.selectAll());
		System.out.println();
		printStudent(im.searchStudent(3));
		System.out.println();

		int i = -1;
		// 홍길동의 점수 가져오기(값을 하나씩 사용하고 싶을 때)
		i = im.indexOfSearchStudentName("홍길동");
		if (i != -1) {
			Student stud = im.searchStudent(i);
			float avg = stud.getAvg();
			System.out.println("홍길동 학생의 평균 점수:" + avg + "점");
		}
		i = im.indexOfSearchStudentName("이순신");
		if (i != -1) {
			Student stud = im.searchStudent(i);
			int kor = stud.getKor();
			System.out.println("이순신 학생의 국어 점수:" + kor + "점");
		}
		i = im.indexOfSearchStudentName("홍길동");
		if (i != -1) {
			Student stud = im.searchStudent(i);
			int age = stud.getAge();
			System.out.println("홍길동 학생의 나이:" + age + "세");
		}

		// 전체 삭제
		System.out.println("전체 삭제 기능");
		im.removeAll();
		printStudent(im.selectAll());

	}

	private static void printStudent(Student[] infos) {
		if (infos == null || infos.length == 0) {
			System.out.println("목록이 없음");
		}
		for (int i = 0; i < infos.length; i++) {
			printStudent(infos[i]);
		}
	}

	private static void printStudent(Student info) {
		if (info == null)
			System.out.println("정보가 없음");
		else {
			System.out.printf("%d번 이름:%s, 나이:%d\n", info.getNumber(), info.getName(), info.getAge());
			System.out.printf("국어점수:%d, 영어점수:%d, 수학점수:%d, 총점:%d, 평균점수: %.2f\n", info.getKor(), info.getEng(),
					info.getMat(), info.getTotal(), info.getAvg());
		}
	}

}