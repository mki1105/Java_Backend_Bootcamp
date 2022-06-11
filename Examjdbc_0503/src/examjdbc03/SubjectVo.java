package examjdbc03;

public class SubjectVo {
	private int SUB_CODE; // "SUB_CODE"
	private String name;

	public SubjectVo(int number, String name) {
		super();
		this.SUB_CODE = number;
		this.name = name;
	}

	public SubjectVo() {
		super();
	}

	public int getNumber() {
		return SUB_CODE;
	}

	public void setNumber(int number) {
		this.SUB_CODE = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SubjectVo [SUB_CODE=" + SUB_CODE + ", name=" + name + "]";
	}
}
