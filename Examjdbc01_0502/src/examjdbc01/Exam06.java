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
		ResultSet rs = null; // 자료형이 달라서 변환
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234");
			System.out.println("오라클 데이터베이스 접속 성공!");
			stmt = conn.createStatement();
			// 컬럼 선택
			String sql = "select \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\"";
			System.out.println(sql);
			rs = stmt.executeQuery(sql); // 쿼리 전송!, resultset을 반환
			while (rs.next()) { // 커서를 하나씩 요소가 있는 곳까지 이동. 움직이는 커서는 행으로 반복, rs는 현재 커서
				// 어떤 컬럼을 가져올건지 번호로(1이 number, 2가 name, 3 birth, 4 bloodtype)
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
		} finally { // rs 먼저 close
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