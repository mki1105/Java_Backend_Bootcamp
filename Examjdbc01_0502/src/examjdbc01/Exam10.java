package examjdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//delete from "INFO" where "NUMBER"=1;
public class Exam10 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null; //���� ���� ��� ��������
		String sql = "delete from \"INFO\" where \"NUMBER\"=?";
		long number = 4;
		try {
			conn = jdbcTemplate.getConnection();
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, number);
			
			int result = pstmt.executeUpdate(); //���� ����!
			System.out.println(result + "���� ���� �Ǿ����ϴ�.");
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