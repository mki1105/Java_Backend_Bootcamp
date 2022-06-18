package Exception9;

//사용자 정의 예외 클래스
public class ScopeException extends Exception { /* checked */
	public ScopeException() {

	}

	public ScopeException(String msg) {
		super(msg);
	}
}