package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Exam03 {
	//insert into "INFO" values ("SEQ_INFO".nextval, 'ȫ�浿', '1929/01/01', 'A');
	public static void main(String[] args) {
		Connection conn = null; // ���Ӹ� �ϴ� ��. Ŀ�ؼ� �غ�
		Statement stmt = null; // ���� ���� ��� ������
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234"); // db ����
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
			stmt = conn.createStatement(); // SQL> ������ִ� ����, �������κ��� ������ �� �ִ� �غ�
			String name = "ȫ�浿";
			String bloodtype = "A";
			LocalDate birth = LocalDate.parse("2020-12-23");
			
			String sql = "insert into \"INFO\" values (\"SEQ_INFO\".nextval, '"+ name +"', '"+birth+" , '"+ bloodtype +"')";
			System.out.println(sql);
			int result = stmt.executeUpdate(sql); // ���� ����!
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