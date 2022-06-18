package Student2;

public class Student {
	private int number;
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	public static final int UNKNOWN = -1;
	
	public Student() {
		
	}
	public Student(Student info) {
		this(info.number, info.name, info.age, info.kor, info.eng, info.mat);
//		this.number = info.number;
//		this.name = info.name;
//		this.age = info.age;
	}
	public Student(String name, int age) {
		this(UNKNOWN, name, age);
//		this.name = name;
//		this.age = age;
	}
	public Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public Student(int number, String name, int age, int kor, int eng, int mat) {
		this(number, name, age);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		calc();
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean sameInfo(Student info) {
		if(this.name.equals(info.name) && this.age == info.age) {
			return true;
		}
		return false;
	}
	
	private void calc() {
		total = kor + eng + mat;
		if(total <= 0)
			return;
		avg = total / 3.0f;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calc();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calc();
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		calc();
	}
	
	//총점과 평균은 직접 설정 불가
	public int getTotal() {
		return total;
	}
	public float getAvg() {
		return avg;
	}
}
	