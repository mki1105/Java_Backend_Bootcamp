package survey;
// 커맨드 객체 추가내용(중첩과 컬렉션 사용)
// 설문항목이 세개, 응답자의 지역, 나이를 입력받아야 한다고 했을 때
// 데이터를 담기 위한 Respondent 클래스
// 클래스의 응답자의 정보를 담기 위해 사용
public class Respondent {

	private int age;
	private String location;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
