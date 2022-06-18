package Student1;

public class Student {
	//등록번호(고유), 이름 ,나이
	//국어, 영어, 수학, 총점, 평균
	private int idnumber;
	private String name;
	private int age;
	private int kor, eng, math;
	private final int SUB = 3; //상수선언 
	private double sum, avg;
	
	//생성자 - 객체 초기화 목적
	public Student(Student info) {
		this(info.idnumber, info.name, info.age, info.kor, info.eng, info.math);
	}
	
	//필드 갑 설정하는 setter
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//필드 값 반환하는 getter
	public int getIdnumber() {
		return this.idnumber;
	}
	public int getKor() { //this
		return this.kor;
	}
	public int getMath() {
		return this.math;
	}
	public int getEng() {
		return this.eng;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public int getSUB() {
		return SUB;
	}
	public double getSum() {
		return this.sum = getMath() + getKor() + getEng();
	}
	public double getAvg() {
		return this.avg = getSum() / SUB; // 총점/과목수
	}
}