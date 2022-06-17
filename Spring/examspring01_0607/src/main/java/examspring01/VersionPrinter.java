package examspring01;
// 기본 데이터 타입 값 설정하기
// 자바의 기본 자료형을 스프링에서 모두 사용 가능
// 이때 string 클래스는 객체형이지만 스프링 설정에서 기본 자료형으로 취급
//사용 하는 xml태그는 <property>태그임
public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	public void print() {
		System.out.printf("프로그램 버전 %d.%d\n\n",
				majorVersion, minorVersion);
	}
}
