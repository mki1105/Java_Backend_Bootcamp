package Student1;

// 5���� ������ ���, ��Ϻ���, �˻��ϱ�, �����ϱ�, �����ϱ� ��� ����
public class StudentManager {

	private Student[] stu; //
	private int index;
	private int sequence;
	public static int DEFAULT_SIZE = 5;
	public static int START = 1;
	private int size;

	private void init(int size, int start) { // Student�迭 �ʱ�ȭ
		stu = new Student[size];
		sequence = START;
		index = 0;
	}

	// ������-��ü�ʱ�ȭ
	public StudentManager() {
		this.init(DEFAULT_SIZE, START);
	}

	public StudentManager(int size, int start) {
		this.size = size;
		this.init(size, start);
	}

	// 5�� ����ϱ� - ���� �޾Ƽ� ���� ()- ��ȣ �ȿ��� �ϰ��� �ϴ� ���ڰ� �ޱ�
	public boolean setStudent(String name, int age, int kor, int eng, int math) {
		return stu[?] = (new Student(name, age, kor, eng, math));
	} // return this.setStudent(~~

	// 5�� ��Ϻ���(�̸�, ������ ���� ����)
	public Student[] selectAll() {
		// result��� Student�迭�� index�� ����
		Student[] result = new Student[index];
		for (int i = 0; i < index; i++) {
			result[i] = new Student(stu[i]);
		}
		return result;
	}
	//�˻��ϱ�
	public Student search()
	
	
	
}