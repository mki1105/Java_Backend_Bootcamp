package examjdbc03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScoreDao {
	private JdbcTemplate jdbcTemplate;

	public ScoreDao() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}

	public boolean insertScore(ScoreVo sdo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기
		String sql = "insert into \"SCORE\" values" + "(\"SEQ_SCORE\".nextval, ?, ?, ?)";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			// pstmt.setObject(1, sdo.getNumber()); //바인딩 파라미터에 값 설정
			pstmt.setObject(1, sdo.getInfonumber());
			pstmt.setObject(2, sdo.getSubcode());
			pstmt.setObject(3, sdo.getSubscore());

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

	/*
	 * 서브 쿼리(하위쿼리) select "NUMBER", "INFO_NUMBER", "SUBJECT_CODE", "SUBJECT_SCORE"
	 * from "SCORE" where "SUBJECT_CODE"=1 and "SUBJECT_SCORE" = 100;
	 */
	public List<ScoreVo> scoreview() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<ScoreVo> ls = new ArrayList<>();
		//서브쿼리(하위쿼리)
		String sql = "select \"NUMBER\" ,\"INFO_NUMBER\", \"SUBJECT_CODE\",	\"SUBJECT_SCORE\" from \"SCORE\" where \"INFO_NUMBER\" = 4 ";
		//String sql = "update \"SCORE\" set \"SUBJECT_SCORE\" = ? where \"NUMBER\" = ?";
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);

			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreVo tmp = new ScoreVo(rs.getLong(1),
						rs.getString(2), rs.getString(3),
						rs.getLong(4));

				ls.add(tmp);
			}
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
		}// 삼항연산자 뜻 다시 해석하기
		return (ls.size() == 0) ? null : ls;

	}

//	public List<ScoreVo> selectAll() {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		List<ScoreVo> ls = new ArrayList<>();
//
//		String sql = "SELECT * FROM SCORE ORDER BY \"NUMBER\" ASC";
//		try {
//			conn = jdbcTemplate.getConnection();
//			pstmt = conn.prepareStatement(sql);
//
//			rs = pstmt.executeQuery(); // 쿼리 전송!
//			while (rs.next()) {
//				ScoreVo tmp = new ScoreVo(rs.getLong(1), rs.getLong(2),
//						rs.getLong(3), rs.getLong(4));
//				ls.add(tmp);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		} // List<ScoreVo> ls = new ArrayList<>();
//		return (ls.size() == 0) ? null : ls;
//		// InfoVo의 사이즈가 0이면 null값을 반환, 아니면 ls.
//	}

	/*
	 * 값 수정하기(select에서 사용하는 where조건 형태 활용) - set 뒤에 바꿀 값/ where 필수 update "INFO" set
	 * "NUMBER"=10 where "NUMBER"=1;
	 */
	public boolean updateScore(ScoreVo sdo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기
		// String sql = "insert into \"SCORE\" values" + "(\"SEQ_SCORE\".nextval, ?, ?,
		// ?)";
		String sql = "update \"SCORE\" set \"SUBJECT_SCORE\" = ? where \"NUMBER\" = ?";
		
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			// pstmt.setObject(1, sdo.getNumber()); //바인딩 파라미터에 값 설정
			pstmt.setObject(1, sdo.getSubscore()); // subscore
			pstmt.setObject(2, sdo.getNumber()); // number

			System.out.println(sql);
			int result = pstmt.executeUpdate(); // 쿼리 전송!
			System.out.println(result + "행이  수정되었습니다.");
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
}
