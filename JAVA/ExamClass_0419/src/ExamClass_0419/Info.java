package ExamClass_0419;
public class Info /* extends Object */{
	String name;
	int age;
	
	Info(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
//	@Override
//	public boolean equals(Object o) {
//		System.out.println("Info에서 재정의한 equals");
//		if(o == null) {
//			return false;
//		}else if(!o.getClass().equals(Info.class)) {
//			return false;
//		}
//		Info info = (Info)o;
//		if(!this.name.equals(info.name)) {
//			return false;
//		}else if(!(this.age == info.age)) {
//			return false;
//		}
//		return true;
//	}
//	
//	@Override
//	public String toString() {
//		return "Info[name=" + name + ",age=" + age + "]";
//	}
}


