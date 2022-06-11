package examjdbc02;
import java.time.LocalDate;

//InfoVO �����͸� �����ϴ� �뵵�� ����.
//InfoDTO�� Ŭ������ �ǹ� �ο�(���� �����ϴ� �뵵) 

public class InfoVO {
	private long number;
	private String name;
	private LocalDate birth;
	private String bloodType;
	
	public InfoVO() {
		
	}
	
	public InfoVO(long number, String name, LocalDate birth, String bloodType) {
		super();
		this.number = number;
		this.name = name;
		this.birth = birth;
		this.bloodType = bloodType;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	@Override
	public String toString() {
		return "InfoVo [number=" + number + ", name=" + name + ", birth=" + birth + ", bloodType=" + bloodType + "]";
	}
	
	
}