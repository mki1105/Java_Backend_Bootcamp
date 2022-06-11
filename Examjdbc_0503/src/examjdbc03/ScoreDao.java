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
		PreparedStatement pstmt = null; // ���� ���� ��� ��������
		String sql = "insert into \"SCORE\" values" + "(\"SEQ_SCORE\".nextval, ?, ?, ?)";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // ���� ���ø� �غ�
			// pstmt.setObject(1, sdo.getNumber()); //���ε� �Ķ���Ϳ� �� ����
			pstmt.setObject(1, sdo.getInfonumber());
			pstmt.setObject(2, sdo.getSubcode());
			pstmt.setObject(3, sdo.getSubscore());

			System.out.println(sql);
			int result = pstmt.executeUpdate(); // ���� ����!
			System.out.println(result + "���� ���� �Ǿ����ϴ�.");
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
	 * ���� ����(��������) select "NUMBER", "INFO_NUMBER", "SUBJECT_CODE", "SUBJECT_SCORE"
	 * from "SCORE" where "SUBJECT_CODE"=1 and "SUBJECT_SCORE" = 100;
	 */
	public List<ScoreVo> scoreview() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<ScoreVo> ls = new ArrayList<>();
		//��������(��������)
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
		}// ���׿����� �� �ٽ� �ؼ��ϱ�
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
//			rs = pstmt.executeQuery(); // ���� ����!
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
//		// InfoVo�� ����� 0�̸� null���� ��ȯ, �ƴϸ� ls.
//	}

	/*
	 * �� �����ϱ�(select���� ����ϴ� where���� ���� Ȱ��) - set �ڿ� �ٲ� ��/ where �ʼ� update "INFO" set
	 * "NUMBER"=10 where "NUMBER"=1;
	 */
	public boolean updateScore(ScoreVo sdo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // ���� ���� ��� ��������
		// String sql = "insert into \"SCORE\" values" + "(\"SEQ_SCORE\".nextval, ?, ?,
		// ?)";
		String sql = "update \"SCORE\" set \"SUBJECT_SCORE\" = ? where \"NUMBER\" = ?";
		
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // ���� ���ø� �غ�
			// pstmt.setObject(1, sdo.getNumber()); //���ε� �Ķ���Ϳ� �� ����
			pstmt.setObject(1, sdo.getSubscore()); // subscore
			pstmt.setObject(2, sdo.getNumber()); // number

			System.out.println(sql);
			int result = pstmt.executeUpdate(); // ���� ����!
			System.out.println(result + "����  �����Ǿ����ϴ�.");
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
