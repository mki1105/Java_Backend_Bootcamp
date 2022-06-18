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
	// or �ٸ� ������� ��� ��.
	public boolean insertSub(SubjectVo svo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // ���� ���� ��� ��������
		String sql = "insert into  \"SUBJECT\" values" + "(\"SEQ_SUBJECT\".nextval, ?)"; // ��ȣ, �̸�(?)
		// String sql = "INSERT INTO SUBJECT VALUES (?, ?)";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // ���� ���ø� �غ�
			// pstmt.setInt(1, svo.getNumber()); // ��ȣ
			// pstmt.setInt(1, svo.getNumber());
			pstmt.setString(1, svo.getName());

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

	public List<SubjectVo> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<SubjectVo> ls = new ArrayList<>();

		String sql = "SELECT * FROM SUBJECT ORDER BY \"SUB_CODE\" ASC";
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); // ���� ����!
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
		// SubjectVo�� ����� 0�̸� null���� ��ȯ, �ƴϸ� ls.
	}
}
