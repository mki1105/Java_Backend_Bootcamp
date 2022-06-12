package ExamClass_0415;

public class Info {
	private int number;
	private String name;
	private int age;
	public static final int UNKNOWN = -1; // »ó¼ö

	public Info() {

	}

	public Info(Info info) {
		this(info.number, info.name, info.age);
//		this.number = info.number;
//		this.name = info.name;
//		this.age = info.age;
	}

	public Info(String name, int age) {
		this(UNKNOWN, name, age);
//		this.name = name;
//		this.age = age;
	}

	public Info(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
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

	public boolean sameInfo(Info info) {
		if (this.name.equals(info.name) && this.age == info.age) {
			return true;
		}
		return false;
	}
}