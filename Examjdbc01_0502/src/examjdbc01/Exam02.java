package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam02 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234");
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // ������ ������ ������ �Ѵ�.
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
