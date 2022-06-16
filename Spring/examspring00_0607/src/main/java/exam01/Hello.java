package exam01;

public class Hello {
	private String name;
	
	public Hello(){
		System.out.println("Hello 생성됨");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String greet() {
		return String.format("%s님. 안녕하세요. 스프링입니다.", name);
	}
}
