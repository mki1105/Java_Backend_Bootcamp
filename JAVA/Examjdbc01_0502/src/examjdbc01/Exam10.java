package examjdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//delete from "INFO" where "NUMBER"=1;
public class Exam10 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null; //쿼리 전송 결과 가져오기
		String sql = "delete from \"INFO\" where \"NUMBER\"=?";
		long number = 4;
		try {
			conn = jdbcTemplate.getConnection();
			System.out.println("오라클 데이터베이스 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, number);
			
			int result = pstmt.executeUpdate(); //쿼리 전송!
			System.out.println(result + "행이 삭제 되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}