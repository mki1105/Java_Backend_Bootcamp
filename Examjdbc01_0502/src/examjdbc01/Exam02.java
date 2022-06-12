package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam02 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// 드라이버 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234");
			System.out.println("오라클 데이터베이스 접속 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 접속을 했으면 끝내야 한다.
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
