package memberone;

import java.sql.Timestamp;
// 회원 정보를 담는 DTO 작성
public class MemberDto {
	private String id;
	private String pass;
	private String email;
	private Timestamp regdate;
	
	public MemberDto(String id, String pass, String email, Timestamp regdate) {
		super();
		this.id = id;
		this.pass = pass;
		this.email = email;
		this.regdate = regdate;
	}

	public MemberDto() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
}
