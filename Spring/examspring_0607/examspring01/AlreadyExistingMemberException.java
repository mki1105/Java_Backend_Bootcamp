package examspring_0607.examspring01;
// 가입을 처리할 때 이미 존재하는 이메일 정보가 있을 경우 예외를 처리할 클래스 작성 
public class AlreadyExistingMemberException extends RuntimeException{
	public AlreadyExistingMemberException(String message) {
		super(message);
	}
	

