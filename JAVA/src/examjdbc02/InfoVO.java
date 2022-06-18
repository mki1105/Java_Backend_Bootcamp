package examjdbc02;
import java.time.LocalDate;

//InfoVO 데이터를 저장하는 용도로 쓰임.
//InfoDTO는 클래스의 의미 부여(값을 저장하는 용도) 

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