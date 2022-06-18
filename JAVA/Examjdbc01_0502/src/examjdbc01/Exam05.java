package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam05 {
	//delete from "INFO" where "NUMBER"=1;
	public static void main(String[] args) {
		Connection conn = null; // ���Ӹ� �ϴ� ��. Ŀ�ؼ� �غ�
		Statement stmt = null; // ���� ���� ��� ������
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234"); // db ����
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
			stmt = conn.createStatement(); // SQL> ������ִ� ����, �������κ��� ������ �� �ִ� �غ�
			int number = 11;
			String sql = "delete from \"INFO\" where \"NUMBER\"=" + number;
			System.out.println(sql);
			int result = stmt.executeUpdate(sql); // ���� ����
			System.out.println(result + "���� ���� �Ǿ����ϴ�.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // ������ ������ ������ �Ѵ�.
			if (stmt != null) {
				try {
					stmt.close();
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