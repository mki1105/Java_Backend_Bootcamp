package Student1;

public class Student {
	//��Ϲ�ȣ(����), �̸� ,����
	//����, ����, ����, ����, ���
	private int idnumber;
	private String name;
	private int age;
	private int kor, eng, math;
	private final int SUB = 3; //������� 
	private double sum, avg;
	
	//������ - ��ü �ʱ�ȭ ����
	public Student(Student info) {
		this(info.idnumber, info.name, info.age, info.kor, info.eng, info.math);
	}
	
	//�ʵ� �� �����ϴ� setter
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
	//�ʵ� �� ��ȯ�ϴ� getter
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
		return this.avg = getSum() / SUB; // ����/�����
	}
}