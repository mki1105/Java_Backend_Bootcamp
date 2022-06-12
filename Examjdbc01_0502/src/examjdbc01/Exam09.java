package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//update "INFO" set "NAME"='�ٲ�1' where "NUMBER"=1;
public class Exam09 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null; //���� ���� ��� ��������
	
		String name = "�Źξ�";
		long number = 10;
		
		
		String sql = "update \"INFO\" set \"NAME\"=? where \"NUMBER\"=?";
		//String sql = "update \"INFO\" set \"NUMBER\"= ?, \"NAME\"=?, where \"NUMBER\" =?";
		//String sql = "update \"INFO\" set \"NUMBER\"= ? where \"NAME\" =? ";
 		System.out.println(sql);
		
		try {
			conn = jdbcTemplate.getConnection();
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setLong(2, number);
			
			
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