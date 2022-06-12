package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Exam08 {
	//insert into "INFO" values ("SEQ_INFO".nextval, 'ȫ�浿', '1929/01/01', 'A');
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
		Connection conn = null; // ���Ӹ� �ϴ� ��. Ŀ�ؼ� �غ�
		PreparedStatement pstmt = null; // ���� ���� ��� ��������
		//stmt = conn.createStatement(); // SQL > ������ִ� ����, �������κ��� ������ �� �ִ� �غ�
		
			String name = "�Źξ�";
			String bloodtype = "B";
			// LocalDate birth = LocalDate.parse("2020-12-23");
			
			String sql = "insert into \"INFO\" values (\"SEQ_INFO\".nextval, ?, sysdate ,?)"; //���ڵ� ���ڵ� �������.
			// binding����, �ε��� 1�� ���� ����, �������ִ� ��, ù��° ?�� 1�� name, 2�� bloodtype, ���ʴ�� ���� �� .
			
		try {
			conn = jdbcTemplate.getConnection();
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
			
			pstmt = conn.prepareStatement(sql);//���� ���ø� �غ�(������ ������
			pstmt.setString(1, name);// ���ε� �Ķ���Ϳ� �� ����
			pstmt.setString(2, bloodtype);
			
			System.out.println(sql);
			int result = pstmt.executeUpdate(); // ���� ����! - ��ȣ�� prepare�� (sql)�ۼ� ���ص� ��.
			System.out.println(result + "���� ���� �Ǿ����ϴ�.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //������ ������ ������ �Ѵ�.
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
	}
}