package Exception7;

//사용자 정의 예외 클래스
public class ScopeException extends RuntimeException /* unchecked */ { 
	public ScopeException() { 
		
	}
	public ScopeException(String msg) {
		super(msg);
	}
}