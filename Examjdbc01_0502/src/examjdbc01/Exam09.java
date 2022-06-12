package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//update "INFO" set "NAME"='바꿈1' where "NUMBER"=1;
public class Exam09 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null; //쿼리 전송 결과 가져오기
	
		String name = "신민아";
		long number = 10;
		
		
		String sql = "update \"INFO\" set \"NAME\"=? where \"NUMBER\"=?";
		//String sql = "update \"INFO\" set \"NUMBER\"= ?, \"NAME\"=?, where \"NUMBER\" =?";
		//String sql = "update \"INFO\" set \"NUMBER\"= ? where \"NAME\" =? ";
 		System.out.println(sql);
		
		try {
			conn = jdbcTemplate.getConnection();
			System.out.println("오라클 데이터베이스 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setLong(2, number);
			
			
			int result = pstmt.executeUpdate(); //쿼리 전송!
			System.out.println(result + "행이 수정 되었습니다.");
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