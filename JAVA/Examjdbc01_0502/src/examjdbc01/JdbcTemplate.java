package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*	Singleton pattern(�̱�������)
 * �޸� �� ��ü�� �ݵ�� �ϳ��� �����ǵ��� �ϴ� ������ ����
 * Ŭ���� ���� �ݺ��ϱ� ������ Ŭ������
 * �����ڰ� private
 * static�̱� ������ �ε��Ǹ� �޸𸮿� �ѹ� ����
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
	
	public static JdbcTemplate getInstance() {// ���ǵǾ� �ִ� getinstance�� ȣ���ؼ�
		// ����ȭ ó��
		// synchronized (JdbcTemplate.class) { // ����ȭ ó���� ������ �ϳ��� �����常 ���Բ� ���ֱ�.
		if (instance == null) { // null�� ���� �ѹ� ����
			instance = new JdbcTemplate(); // �ڱ� �ڽ��� �����϶�� ��.
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
}
