package jsp_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TempMemberDAO {
//	private final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
//	private final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	private final String ID = "c##tester"; // 사용할 DB계정 ID
//	private final String PW = "1234"; // 사용할 DB계정 password
//	private ConnectionPool pool = null;

//	public TempMemberDAO() {
//		try {
//			Class.forName(JDBC_DRIVER);
//		} catch (ClassNotFoundException e) {
//			System.out.println("드라이버 로딩 실패!");
//			e.printStackTrace();
//		}
//	}
	
	private DataSource ds;
	private Connection conn;
	
	public TempMemberDAO() {
		try{
	        Context init = (Context) new InitialContext();
	        ds = (DataSource)init.lookup("java:comp/env/jdbc/myOracle");
	     //conn =ds.getConnection();
	    } catch(Exception e){
	        System.out.println("Exception : " + e);
	    } finally{    
	        if(conn != null) try{conn.close();}catch(Exception e){}
	    }
		
	}
	public Connection getConnection() throws SQLException{
        return ds.getConnection();
    }	
	public List<TempMemberVO> getMemberList() {
	//	Connection conn = null;
		//Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		List<TempMemberVO> memList = new ArrayList<TempMemberVO>();
		try {
			//conn = DriverManager.getConnection(JDBC_URL, ID, PW);
//			conn = pool.getConnection();
			conn = getConnection();
			String query = "select * from TEMPMEMBER";
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				TempMemberVO tmp = new TempMemberVO();
				tmp.setId(rs.getString("id"));
				tmp.setPassword(rs.getString("password"));
				tmp.setName(rs.getString("name"));
				tmp.setMem_num1(rs.getString("mem_num1"));
				tmp.setMem_num2(rs.getString("mem_num2"));
				tmp.setE_mail(rs.getString("e_mail"));
				tmp.setPhone(rs.getString("phone"));
				tmp.setZipcode(rs.getString("zipcode"));
				tmp.setAddress(rs.getString("address"));
				tmp.setJob(rs.getString("job"));
				memList.add(tmp);
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
//			if (rs != null)
//				try {
//					rs.close();
//				} catch (Exception e) {
//					System.out.println("Exception2 : " + e);
//				}
//			if (stmt != null)
//				try {
//					stmt.close();
//				} catch (Exception e) {
//					System.out.println("Exception3 : " + e);
//				}
//			if (conn != null)
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					System.out.println("Exception4 : " + e);
//					e.printStackTrace();
//				}
//		}
		return memList;
	}
	}

	

