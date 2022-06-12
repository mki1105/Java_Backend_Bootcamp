package Exception8;

//사용자 정의 예외 클래스
public class ScopeException extends Exception { /* checked */
	public ScopeException() {
		// checked exception이기 떄문에 무조건 체크해야 한다.
		// 반드시 예외처리가 필요하다.

	}

	public ScopeException(String msg) {
		super(msg);
	}
}