package Student2;

public class StudentManager {
	private Student[] students;
	private int index;
	private int sequence;
	public static int DEFAULT_SIZE = 5;
	public static int START = 1;
	
	private void init(int size, int start) {
		students = new Student[size];
		sequence = START;
		index = 0;
	}
	
	private boolean isIndexAvailable(int index) {
		return index < this.index && students[index] != null;
	}
	
	public StudentManager() {
		this.init(DEFAULT_SIZE, START);
	}
	
	public StudentManager(int size, int start) {
		this.init(size, start);
	}
	
	//등록
	public boolean insertStudent(Student info) {
		boolean result = false;
		if(!(index == students.length)) {
			students[index++] = new Student(sequence++, info.getName(), info.getAge(), info.getKor(), info.getEng(), info.getMat());
			result = true;
		}
		return result;
	}
	
	public boolean insertStudent(String name, int age) {
		return this.insertStudent(new Student(-1, name, age));
	}
	
	public Student[] selectAll() {
		Student[] result = new Student[index];
		for(int i = 0; i < index; i++) {
			result[i] = new Student(students[i]);
		}
		return result;
	}
	
	//검색
	public int indexOfSearchStudentName(int start, String name) {
		int result = -1;
		if(!isIndexAvailable(start)) {
			return result;
		}
		for(int i = start; i < index; i++) {
			if(students[i].getName().equals(name)) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public int indexOfSearchStudentName(String name) {
		return indexOfSearchStudentName(0, name);
	}
	
	public Student searchStudent(int index) {
		Student result = null;
		if(isIndexAvailable(index)) {
			result = new Student(students[index]);
		}
		return result;
	}
	
	//수정
	public boolean editStudent(Student info) {
		boolean result = false;
		int searchIdx = indexOfSearchStudentName(info.getName());
		if(searchIdx != -1) {
			students[searchIdx] = new Student(students[searchIdx].getNumber(), info.getName(), info.getAge(), info.getKor(), info.getEng(), info.getMat());
			result = true;
		}
		return result;
	}
	
	//삭제
	public boolean removeInfo(String name) {
		int removeIdx = indexOfSearchStudentName(name);
		if(removeIdx == -1) 
			return false;
		students[removeIdx] = null;
		trim();
		students[--index] = null;
		return true;
	}
	
	private void trim() {
		for(int i = 0; i < index; i++) {
			if(students[i] == null) {
				for(int j = i+1; j < index; j++) {
					students[j-1] = students[j];
				}
				break;
			}
		}
	}
	
	public void removeAll() {
		//1. 배열을 초기화
		//this.init(DEFAULT_SIZE, START);
		
		//2. 배열에 Info객체를 참조하는 값을 모두 null로 변경
		for(int i = 0; i < students.length; i++) {
			students[i] = null;
		}
		index = 0;
	}
	
	//성적관련 기능///////////////////////////////////////////////////
	public static final int KOR = 0;
	public static final int ENG = 1;
	public static final int MAT = 2;
	/*
	 * 위와 같은 상수 대신 enum을 이용하는 방법을 공부해보기
	 */

	public void setScore(int index, int kor, int eng, int mat) {
		if(!isIndexAvailable(index)) {
			return;
		}
		setScore(index, KOR, kor);
		setScore(index, ENG, eng);
		setScore(index, MAT, mat);
	}
	
	public void setScore(int index, int[] scores) {
		if(!isIndexAvailable(index)) {
			return;
		}
		setScore(index, scores[KOR], scores[ENG], scores[MAT]);
	}
	
	public void setScore(int index, int sub, int score) {
		if(!isIndexAvailable(index)) {
			return;
		}
		Student tmp = students[index];
		switch(sub) {
		case KOR: tmp.setKor(score); break;
		case ENG: tmp.setEng(score); break;
		case MAT: tmp.setMat(score); break;
		}
	}
	
}