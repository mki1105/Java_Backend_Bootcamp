package ExamHashSet;

public class Info {
	private String name;
	private int age;

	public Info(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
// �������̵� �ϴ� ������ �ܼ� ��½� �⺻������ toString���� �����Ǿ� ����� �� @33~~
// ��½� 16������ ������ ���� ���ڿ��� �ٲ��ֱ� ����.
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}
//�ؽ��ڵ�� �� ��ü�� ���� �ִ� ��.
	@Override // ��ü�� �ٸ����� ���� ���� ������ �ؽ��ڵ带 �̿��ؼ� 
	public int hashCode() {
		//31�� Ȧ���̸鼭 �Ҽ�(prime)�̱� ������ ���.
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Info other = (Info) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
}
