package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam04 {
	//update "INFO" set "NAME"='바꿈1' where "NUMBER"=1;
	//update "INFO" set "NUMBER" = 1 where "NAME" = '김민경';
	public static void main(String[] args) {
		Connection conn = null; // 접속만 하는 것. 커넥션 준비
		Statement stmt = null; // 쿼리 전송 결과 가져외
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234"); //db 접속
			System.out.println("오라클 데이터베이스 접속 성공!");
			stmt = conn.createStatement(); // SQL> 만들어주는 역할, 접속으로부터 전송할 수 있는 준비
			String name = "김민경";
			int number = 1;
			String sql = "update \"INFO\" set \"NUMBER\"= '"+number+"' where \"NAME\"= '"+ name +"'";
			System.out.println(sql);
			int result = stmt.executeUpdate(sql);// 쿼리 전송
			System.out.println(result + "행이 수정 되었습니다.");

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