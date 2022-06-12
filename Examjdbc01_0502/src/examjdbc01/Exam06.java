package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//select "NUMBER", "NAME", "BIRTH", "BLOOD_TYPE" from "INFO";
public class Exam06 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // �ڷ����� �޶� ��ȯ
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234");
			System.out.println("����Ŭ �����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
			// �÷� ����
			String sql = "select \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\"";
			System.out.println(sql);
			rs = stmt.executeQuery(sql); // ���� ����!, resultset�� ��ȯ
			while (rs.next()) { // Ŀ���� �ϳ��� ��Ұ� �ִ� ������ �̵�. �����̴� Ŀ���� ������ �ݺ�, rs�� ���� Ŀ��
				// � �÷��� �����ð��� ��ȣ��(1�� number, 2�� name, 3 birth, 4 bloodtype)
				System.out.print(rs.getLong(1) + ",");
				System.out.print(rs.getString(2) + ",");
				System.out.print(rs.getDate(3) + ",");
				System.out.println(rs.getString(4));
			//	System.out.print(rs.getString("NAME")+",");
			//	System.out.print(rs.getDate("BIRTH")+",");
			//	System.out.print(rs.getLong("NUMBER")+",");
			//	System.out.println(rs.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // rs ���� close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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