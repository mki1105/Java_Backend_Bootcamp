package ExamHashSet;

public class Info {
	private String name;
	private int age;

	public Info(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
// 오버라이드 하는 이유는 콘솔 출력시 기본적으로 toString으로 생성되어 출력이 됨 @33~~
// 출력시 16진수로 나오는 값을 문자열로 바꿔주기 위함.
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}
//해쉬코드는 그 객체가 갖고 있는 값.
	@Override // 객체는 다르지만 값이 같기 때문에 해시코드를 이용해서 
	public int hashCode() {
		//31이 홀수이면서 소수(prime)이기 때문에 사용.
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
