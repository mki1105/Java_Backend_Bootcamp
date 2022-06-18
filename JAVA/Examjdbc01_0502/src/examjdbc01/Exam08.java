package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Exam08 {
	//insert into "INFO" values ("SEQ_INFO".nextval, '홍길동', '1929/01/01', 'A');
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
		Connection conn = null; // 접속만 하는 것. 커넥션 준비
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기
		//stmt = conn.createStatement(); // SQL > 만들어주는 역할, 접속으로부터 전송할 수 있는 준비
		
			String name = "신민아";
			String bloodtype = "B";
			// LocalDate birth = LocalDate.parse("2020-12-23");
			
			String sql = "insert into \"INFO\" values (\"SEQ_INFO\".nextval, ?, sysdate ,?)"; //문자든 숫자든 상관없음.
			// binding문자, 인덱스 1번 부터 시작, 연결해주는 것, 첫번째 ?는 1번 name, 2번 bloodtype, 차례대로 보면 됨 .
			
		try {
			conn = jdbcTemplate.getConnection();
			System.out.println("오라클 데이터베이스 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);//쿼리 템플릿 준비(쿼리를 전송할
			pstmt.setString(1, name);// 바인딩 파라미터에 값 설정
			pstmt.setString(2, bloodtype);
			
			System.out.println(sql);
			int result = pstmt.executeUpdate(); // 쿼리 전송! - 괄호안 prepare는 (sql)작성 안해도 됨.
			System.out.println(result + "행이 삽입 되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //접속을 했으면 끝내야 한다.
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