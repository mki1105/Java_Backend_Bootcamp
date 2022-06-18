package examjdbc03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InfoDao {
	private JdbcTemplate jdbcTemplate;

	public InfoDao() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	
	public boolean delete(InfoVO vo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // ���� ���� ��� ��������
		String sql = "delete from \"INFO\" where \"NUMBER\" = ?";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // ���� ���ø� �غ�
			pstmt.setLong(1, vo.getNumber()); // ���ε� �Ķ���Ϳ� �� ����
			
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
/* �� �����ϱ�(select���� ����ϴ� where���� ���� Ȱ��) /where �ʼ�
 *	delete from "INFO"; - where���� ���� ��� ��� �� ���� 
 * 	delete from "INFO" where "NUMBER"=100; 
 */	
	public boolean insertInfo(InfoVO vo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // ���� ���� ��� ��������
		String sql = "insert into \"INFO\" values" + "(\"SEQ_INFO\".nextval, ?, ?, ?)";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // ���� ���ø� �غ�
			pstmt.setString(1, vo.getName()); // ���ε� �Ķ���Ϳ� �� ����
			pstmt.setObject(2, vo.getBirth());
			pstmt.setString(3, vo.getBloodType());

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

	public List<InfoVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<InfoVO> ls = new ArrayList<>();

		//String sql = "select \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\"";
		String sql = "SELECT * FROM INFO ORDER BY \"NUMBER\" ASC";
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); // ���� ����!
			while (rs.next()) {
				InfoVO tmp = new InfoVO(rs.getLong(1), rs.getString("NAME"),
						LocalDate.parse(rs.getDate("BIRTH").toString()), rs.getString(4));
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
		} // List<InfoVO> ls = new ArrayList<>();
		return (ls.size() == 0) ? null : ls;
		// InfoVo�� ����� 0�̸� null���� ��ȯ, �ƴϸ�
	}

	
}

