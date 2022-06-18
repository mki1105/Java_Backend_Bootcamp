package examspring01;

public class ChangePasswordService {
	private MemberDao memberDao;

	public ChangePasswordService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			throw new MemberNotFoundException();
		}
		// 정보가 있으면 비번 변경하기
		member.changePassword(oldPwd, newPwd);
		memberDao.update(member); // 예외가 발생하지 않으면 update
	}
}
