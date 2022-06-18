package IoExam;

import java.io.Serializable;

public class Info implements Serializable{
	/*
	 * ��Ϲ�ȣ(����) �̸� ���� ��������, ������, getter, setter.
	 */
	// ��������
	private int id; // ��Ϲ�ȣ(������ȣ)
	private String name; // �̸�
	private int age; // ����
	// ������
	Info() {

	}
	
	Info(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// �ʵ� �� �����ϴ� setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	// �ʵ� �� ��ȯ�ϴ� getter
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

//		public String getInfo() { // �������
//			return this.id + "\t" + this.name + "\t" + this.age;
//		}
}
