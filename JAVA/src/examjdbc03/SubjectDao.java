package examjdbc03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import examjdbc03.SubjectVo;

public class SubjectDao {
	private JdbcTemplate jdbcTemplate;

	public SubjectDao() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	// insert into "SUBJECT" ("SUB_CODE", "NAME") values ('6', 'Math');
	// or 다른 방법으로 적어도 됨.
	public boolean insertSub(SubjectVo svo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기
		String sql = "insert into  \"SUBJECT\" values" + "(\"SEQ_SUBJECT\".nextval, ?)"; // 번호, 이름(?)
		// String sql = "INSERT INTO SUBJECT VALUES (?, ?)";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			// pstmt.setInt(1, svo.getNumber()); // 번호
			// pstmt.setInt(1, svo.getNumber());
			pstmt.setString(1, svo.getName());

			System.out.println(sql);
			int result = pstmt.executeUpdate(); // 쿼리 전송!
			System.out.println(result + "행이 삽입 되었습니다.");
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

	public List<SubjectVo> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<SubjectVo> ls = new ArrayList<>();

		String sql = "SELECT * FROM SUBJECT ORDER BY \"SUB_CODE\" ASC";
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				SubjectVo tmp = new SubjectVo(
						rs.getInt(1),
						rs.getString("NAME"));
				ls.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // List<SubjectVo> ls = new ArrayList<>();
		return (ls.size() == 0) ? null : ls;
		// SubjectVo의 사이즈가 0이면 null값을 반환, 아니면 ls.
	}
}
