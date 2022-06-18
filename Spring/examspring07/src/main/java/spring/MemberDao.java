package spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	/*
	 * dao 클래스가 객체로 생성 될 때 jdbcTemplate 객체를 생성하는데, 이 때 DataSource 객체를 전달해야 하므로 의존 주입
	 * 설정이 필요함. JdbcTemplate 클래스 객체를 생성할 때 DataSource를 주입하도록 xml에 Bean 추가.
	 */
	private JdbcTemplate jdbcTemplate;

	public MemberDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// 이메일 하나만 검색하는 기능
	public Member selectByEmail(String email) {
		List<Member> results = jdbcTemplate.query(
				"select * from MEMBER where EMAIL=?", 
				new MemberRowMapper(), email);

		return results.isEmpty() ? null : results.get(0);
	}

	// 모든 member 정보를 출력하는 기능
	public Collection<Member> selectAll() {
		List<Member> results = jdbcTemplate.query(
				"select * from MEMBER", new MemberRowMapper());
		return results;
	}

	// queryForObject() 결과가 1행인 경우의 조회 메서드 - 결과가 하나의 행만 가진 경우
	public int count() {
		Integer count = jdbcTemplate.queryForObject(
				"select count(*) from MEMBER", Integer.class);
		return count;
	}

	// 쿼리 실행 결과로 변경된 행의 개수를 반환함.
	   public void update(Member member) {
		      jdbcTemplate.update("UPDATE member SET name=?, password=? WHERE email=?",
		            member.getName(), member.getPassword(), member.getEmail());
		   }
//	public void update(Member member) {
//		
//	}
////		jdbcTemplate.update(
////				"update MEMBER set NAME=?, PASSWORD=? where EMAIL=?",
////				member.getName(), member.getPassword(), member.getEmail());
//	
//		jdbcTemplate.update(new PreparedStatementCreator() {			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				
//				// 파라미터로 전달받은 connection을 이용해서 preparedStatement 생성
//				PreparedStatement pstmt = con.prepareStatement(
//						"insert into MEMBER (ID, EMAIL, PASSWORD, NAME, REGDATE)"
//						+ "values (MEMBER_SEQ.nextval,?,?,?,?)");
//				
//				//인덱스 파라미터 값 설정
//				pstmt.setString(1, member.getEmail());
//				pstmt.setString(2, member.getPassword());
//				pstmt.setString(3, member.getName());
//				pstmt.setTimestamp(4, new Timestamp(member.getRegisterDate().getTime()
//				) );		
//		// 생성한 PreparedStatement 객체 반환
//		return pstmt;
//		}
//	});//update(new preparedStatementCreator)
//}

	public void insert(final Member member) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// 파라미터로 전달받은 connection을 이용해서 preparedStatement 생성
				PreparedStatement pstmt = con.prepareStatement(
						"insert into MEMBER (ID, EMAIL, PASSWORD, NAME, REGDATE)"
						+ "values (MEMBER_SEQ.nextval,?,?,?,?)",
						new String[] {"ID"});
				
				//인덱스 파라미터 값 설정
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setTimestamp(4, new Timestamp(member.getRegisterDate().getTime()
				)
			);
				// 생성한 PreparedStatement 객체 반환
				return pstmt;
			}
		}, keyHolder);
		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.longValue());
}

}
