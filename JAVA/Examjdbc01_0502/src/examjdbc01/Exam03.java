package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Exam03 {
	//insert into "INFO" values ("SEQ_INFO".nextval, '홍길동', '1929/01/01', 'A');
	public static void main(String[] args) {
		Connection conn = null; // 접속만 하는 것. 커넥션 준비
		Statement stmt = null; // 쿼리 전송 결과 가져와
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234"); // db 접속
			System.out.println("오라클 데이터베이스 접속 성공!");
			stmt = conn.createStatement(); // SQL> 만들어주는 역할, 접속으로부터 전송할 수 있는 준비
			String name = "홍길동";
			String bloodtype = "A";
			LocalDate birth = LocalDate.parse("2020-12-23");
			
			String sql = "insert into \"INFO\" values (\"SEQ_INFO\".nextval, '"+ name +"', '"+birth+" , '"+ bloodtype +"')";
			System.out.println(sql);
			int result = stmt.executeUpdate(sql); // 쿼리 전송!
			System.out.println(result + "행이 삽입 되었습니다.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 접속을 했으면 끝내야 한다.
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