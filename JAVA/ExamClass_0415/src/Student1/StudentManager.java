package Student1;

// 5명의 정보를 등록, 목록보기, 검색하기, 수정하기, 삭제하기 기능 구현
public class StudentManager {

	private Student[] stu; //
	private int index;
	private int sequence;
	public static int DEFAULT_SIZE = 5;
	public static int START = 1;
	private int size;

	private void init(int size, int start) { // Student배열 초기화
		stu = new Student[size];
		sequence = START;
		index = 0;
	}

	// 생성자-객체초기화
	public StudentManager() {
		this.init(DEFAULT_SIZE, START);
	}

	public StudentManager(int size, int start) {
		this.size = size;
		this.init(size, start);
	}

	// 5명 등록하기 - 정보 받아서 저장 ()- 괄호 안에는 하고자 하는 인자값 받기
	public boolean setStudent(String name, int age, int kor, int eng, int math) {
		return stu[?] = (new Student(name, age, kor, eng, math));
	} // return this.setStudent(~~

	// 5명 목록보기(이름, 점수도 같이 보기)
	public Student[] selectAll() {
		// result라는 Student배열에 index로 저장
		Student[] result = new Student[index];
		for (int i = 0; i < index; i++) {
			result[i] = new Student(stu[i]);
		}
		return result;
	}
	//검색하기
	public Student search()
	
	
	
}