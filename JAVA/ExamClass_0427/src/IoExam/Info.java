package IoExam;

import java.io.Serializable;

public class Info implements Serializable{
	/*
	 * 등록번호(고유) 이름 나이 변수선언, 생성자, getter, setter.
	 */
	// 변수선언
	private int id; // 등록번호(고유번호)
	private String name; // 이름
	private int age; // 나이
	// 생성자
	Info() {

	}
	
	Info(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// 필드 값 설정하는 setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 필드 값 반환하는 getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + ", age=" + age + "]\n";
	}

//		public String getInfo() { // 출력위해
//			return this.id + "\t" + this.name + "\t" + this.age;
//		}
}
