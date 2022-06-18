package spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
// 중복 코드 줄이기 위한 클래스
public class MemberRowMapper implements RowMapper<Member>{
	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		Member member = new Member(
				rs.getString("EMAIL"),
				rs.getString("PASSWORD"),
				rs.getNString("NAME"),
				rs.getTimestamp("REGDATE"));
		member.setId(rs.getLong("ID"));
		return member;
	}
}
