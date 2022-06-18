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
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기
		String sql = "delete from \"INFO\" where \"NUMBER\" = ?";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			pstmt.setLong(1, vo.getNumber()); // 바인딩 파라미터에 값 설정
			
			System.out.println(sql);
			int result = pstmt.executeUpdate(); // 쿼리 전송!
			System.out.println(result + "행이 삭제 되었습니다.");
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
/* 값 삭제하기(select에서 사용하는 where조건 형태 활용) /where 필수
 *	delete from "INFO"; - where절이 없는 경우 모든 행 삭제 
 * 	delete from "INFO" where "NUMBER"=100; 
 */	
	public boolean insertInfo(InfoVO vo) {
		boolean ret = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기
		String sql = "insert into \"INFO\" values" + "(\"SEQ_INFO\".nextval, ?, ?, ?)";
		try {
			conn = jdbcTemplate.getConnection();

			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			pstmt.setString(1, vo.getName()); // 바인딩 파라미터에 값 설정
			pstmt.setObject(2, vo.getBirth());
			pstmt.setString(3, vo.getBloodType());

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

			rs = pstmt.executeQuery(); // 쿼리 전송!
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
		// InfoVo의 사이즈가 0이면 null값을 반환, 아니면
	}

	
}

