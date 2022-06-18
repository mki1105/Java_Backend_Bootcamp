package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*	Singleton pattern(싱글톤패턴)
 * 메모리 상에 객체를 반드시 하나만 생성되도록 하는 디자인 패턴
 * 클래스 접속 반복하기 때문에 클래스로
 * 생성자가 private
 * static이기 때문에 로딩되면 메모리에 한번 존재
 * 
 */
public class JdbcTemplate {
	private static JdbcTemplate instance;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "c##tester";
	private String password = "1234";
	
	private JdbcTemplate() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static JdbcTemplate getInstance() {// 정의되어 있는 getinstance를 호출해서
		// 동기화 처리
		// synchronized (JdbcTemplate.class) { // 동기화 처리로 무조건 하나의 스레드만 들어가게끔 해주기.
		if (instance == null) { // null일 때만 한번 생성
			instance = new JdbcTemplate(); // 자기 자신이 생성하라는 뜻.
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
}
