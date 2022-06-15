package memberone;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//ID중복체크 기능을 포함하여 DAO 작성
public class MemberDao {
//	public static String ID = "c##tester"; //사용 db계정
//	public static String PASSWORD = "1234"; // 위 계정 비번
//	public static String IP = "localhost";
//
//	static {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:oracle:thin:@" + IP + ":1521:xe", ID, PASSWORD);
//	}
	
	private static MemberDao instance = null;
	private MemberDao() {
	} //생성자//생성자를 private 으로 선언했으므로 useBean으로 생성 불가
	
	public static MemberDao getInstance() {
		if (instance == null) {
			synchronized (MemberDao.class) {
				instance = new MemberDao();				
			}
		}
		return instance;
	}
	
	private static DataSource ds = null;        
    {
        try{
            Context init = new InitialContext();
            ds = (DataSource)init.lookup("java:comp/env/jdbc/myOracle");
        }catch(Exception e){
            System.err.println("Connection 실패");
        }
    }
    public Connection getConnection() throws SQLException{
        return ds.getConnection();
    }


	public boolean idCheck(String id) {
		boolean result = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from MEMBER where id = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 쿼리전송
			if (!rs.next()) // id가 없으면 false
				result = false;
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException sqle1) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle2) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException sqle3) {
				}
		}
		return result;
	}

	// 실제 회원의 데이터를 데이터베이스에 넣기 위해 다음 memberInsert메서드
	public boolean memberInsert(MemberDto dto) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "insert into MEMBER values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getEmail());
			pstmt.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));

			int count = pstmt.executeUpdate(); // ?
			if (count > 0)
				flag = true;
		} catch (Exception e) {
			System.out.println("Exception " + e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException sqle1) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle2) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException sqle3) {
				}
		}
		return flag;
	}

	// 로그인 동작 구현
	// DB에서 IP/PASSWORD를 비교하여 결과를 정수값으로 반환하는 메서드(1:로그인 성공 0: 비밀번호 오류 -1: ID없음)
	public int loginCheck(String id, String pass) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int check = -1; // 아이디 없음
		try {
			conn = getConnection();
			String sql = "select PASS from MEMBER where ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();	
				if(rs.next()){
		            String dbPass = rs.getString("pass");
		            if(pass.equals(dbPass))      check = 1;
		            else                   check = 0;
		        }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception :  " + e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException sqle1) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle2) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException sqle3) {
				}
		}
		return check;
	}

	// 정보수정 구현 - 정보수정을 클릭하면 먼저 기존의 정보를 보여줘야 함.
	// 세션에 저장된 id를 가지고 회원정보를 얻어올 메서드
	public MemberDto getMember(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto dto = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from MEMBER where ID = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) { // id에 해당하는 회원이 존재하면
				dto = new MemberDto();
				dto.setId(rs.getString("id")); // 안되면 다시 수정하기
				dto.setPass(rs.getString("pass"));
				dto.setEmail(rs.getString("email"));
				dto.setRegdate(rs.getTimestamp("regdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception :  " + e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException sqle1) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle2) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException sqle3) {
				}
		}
		return dto;
	}

// 정보수정을 처리할 기능 구현, DB에 업데이트를 수행하도록 메서드 추가
	public void memberUpdate(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("update MEMBER set PASS=?, EMAIL =? where ID =?");
			pstmt.setString(1, dto.getPass());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getId());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle2) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException sqle3) {
				}
		}
	}

// 회원삭제 작업을 처리할 메서드 
	public int deleteMember(String id, String pass) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbPass = ""; // DB에 실제 저장된 비밀번호
		int result = -1; // ?
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select PASS from MEMBER WHERE ID =?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dbPass = rs.getString("pass");
				if (dbPass.equals(pass)) { // true면 본인 확인 성공
					pstmt.close();
					pstmt = conn.prepareStatement("delete from MEMBER WHERE ID =?");
					pstmt.setString(1, id);
					pstmt.executeUpdate();
					result = 1; // 회원 탈퇴 삭제 성공이면 1 반환.
				} else { // 본인 확인 실패할 경우 - 비밀번호 오류
					result = 0; // 회원탈퇴 실패면 0 반환.
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception :  " + e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException sqle1) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle2) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException sqle3) {
				}
		}
		return result;
	}
}
