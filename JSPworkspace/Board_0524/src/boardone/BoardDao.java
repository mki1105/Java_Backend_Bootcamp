package boardone;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//ConnUtil 에서 실제 데이터베이스에 쿼리 작업을 해줄 Dao
public class BoardDao {

	private static BoardDao instance = null;

	private BoardDao() {
	}

	public static BoardDao getInstance() {
		if (instance == null) {
			synchronized (BoardDao.class) {
				instance = new BoardDao();
			}
		}
		return instance;
	}

	public void insertArticle(BoardDto article) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int ref = article.getRef();
		int step = article.getStep();
		int depth = article.getDepth();
		int number = 0;
		String sql = "";
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement("select max(NUM) from BOARD");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				number = rs.getInt(1) + 1; // 뜻?
			} else {
				number = 1;
			}
			if (num != 0) { // 답 글일 경우
				sql = "update BOARD SET STEP = STEP +1 WHERE REF =? AND STEP > ?";
				pstmt.close();
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, step);
				pstmt.executeQuery();
				step++;
				depth++;
			} else { //새 글일 경우
				ref = number;
				step = 0;
				depth = 0;
			}
			// 쿼리문 작성
			sql = "insert into BOARD" + "(NUM, WRITER, EMAIL, SUBJECT, PASS,"
					+ "REGDATE, REF, STEP, DEPTH, CONTENT, IP)"
					+ "values(BOARD_SEQ.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt.close();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2, article.getEmail());
			pstmt.setString(3, article.getSubject());
			pstmt.setString(4, article.getPass());
			pstmt.setTimestamp(5, article.getRegdate());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, step);
			pstmt.setInt(8, depth);
			pstmt.setString(9, article.getContent());
			pstmt.setString(10, article.getIp());
			pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}
	}
	// 글 목록을 확인할 수 있는 페이지
	public int getArticleCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement("select count(*) from BOARD");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				x = rs.getInt(1); //?
			}
		 } catch(Exception e){
		        e.printStackTrace();
		 } finally{
		        if(rs != null) try { rs.close(); } catch (SQLException e){}
		        if(pstmt != null) try { pstmt.close(); } catch (SQLException e){}
		        if(conn != null) try { conn.close(); } catch (SQLException e){}
		    }
		    return x;
	}
	
	// DB의 BOARD TABLE에서 데이터를 가져오는 메서드
	public List<BoardDto> getArticles(/* 수정 1 */int start, int end){
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<BoardDto> articleList = null;
        try {
        	conn = ConnUtil.getConnection();
        	/* 수정 2 */
        	//pstmt = conn.prepareStatement("select * from BOARD ORDER BY NUM DESC");
        	pstmt = conn.prepareStatement(
        			"select * from(select rownum rnum, num, writer, email, subject,pass,"
        			+ "regdate, readcount, ref, step, depth, content, ip from ("
        			+ "select * from board order by ref desc, step asc)) where rnum >=? and rnum<=?");
        	/* 수정 3 */
        	pstmt.setInt(1, start);
        	pstmt.setInt(2, end);
        	rs = pstmt.executeQuery(); // 쿼리 전송
        	if (rs.next()) {
        		articleList = new ArrayList<BoardDto>(10);// 수정 4
        		 do {
                     BoardDto article = new BoardDto();
                     //쿼리 결과로 얻은 정보 article 객체에 저장
                     article.setNum(rs.getInt("num"));
                     article.setWriter(rs.getString("writer"));
                     article.setEmail(rs.getString("email"));
                     article.setSubject(rs.getString("subject"));
                     article.setPass(rs.getString("pass"));
                     article.setRegdate(rs.getTimestamp("regdate"));
                     article.setReadcount(rs.getInt("readcount"));
                     article.setRef(rs.getInt("ref"));
                     article.setStep(rs.getInt("step"));
                     article.setDepth(rs.getInt("depth"));
                     article.setContent(rs.getString("content"));
                     article.setIp(rs.getString("ip"));
                     articleList.add(article);
                 } while(rs.next());
        	}
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            if(rs != null) try { rs.close(); } catch (SQLException e){}
            if(pstmt != null) try { pstmt.close(); } catch (SQLException e){}
            if(conn != null) try { conn.close(); } catch (SQLException e){}
        }
        return articleList;
        
	}
	
	// 글 내용을 학인하는 페이지 - num을 매개변수로 DB에서 세부정보를 가져오기.
	public BoardDto getArticle(int num) {
		 Connection conn = null;
		 PreparedStatement pstmt = null;
	     ResultSet rs = null;
	     BoardDto article = null;
	     try {
	    	 	conn = ConnUtil.getConnection();
	    	 	pstmt = conn.prepareStatement(
	    	 	"update BOARD set READCOUNT=READCOUNT+1 where NUM = ?");
	    	 	pstmt.setInt(1, num);
	    	 	pstmt.executeQuery();
	    	 	pstmt.close();
	    	 	pstmt = conn.prepareStatement("select * from BOARD where NUM = ?");
	    	 	pstmt.setInt(1, num);
	    	 	rs = pstmt.executeQuery();
	   
	    	 	if(rs.next()) {
	    	 		article = new BoardDto();
	                article.setNum(rs.getInt("num"));
	                article.setWriter(rs.getString("writer"));
	                article.setEmail(rs.getString("email"));
	                article.setSubject(rs.getString("subject"));
	                article.setPass(rs.getString("pass"));
	                article.setRegdate(rs.getTimestamp("regdate"));
	                article.setReadcount(rs.getInt("readcount"));
	                article.setRef(rs.getInt("ref"));
	                article.setStep(rs.getInt("step"));
	                article.setDepth(rs.getInt("depth"));
	                article.setContent(rs.getString("content"));
	                article.setIp(rs.getString("ip"));
	            }
	        } catch(Exception e){
	            e.printStackTrace();
	        } finally{
	            if(rs != null) try { rs.close(); } catch (SQLException e){}
	            if(pstmt != null) try { pstmt.close(); } catch (SQLException e){}
	            if(conn != null) try { conn.close(); } catch (SQLException e){}
	        }
	        return article;
	}
	
	// 글 수정 메서드 - 조회수를 증가시킬 필요 없음, num에 해당하는 게시물 가져오기
	public BoardDto updateGetArticle(int num){
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    BoardDto article = null;
	    try{
	        conn = ConnUtil.getConnection();
	        pstmt = conn.prepareStatement("select * from BOARD where NUM = ?");
	        pstmt.setInt(1, num);
	        rs = pstmt.executeQuery();
	        if(rs.next()){
	            article = new BoardDto();
	            article.setNum(rs.getInt("num"));
	            article.setWriter(rs.getString("writer"));
	            article.setEmail(rs.getString("email"));
	            article.setSubject(rs.getString("subject"));
	            article.setPass(rs.getString("pass"));
	            article.setRegdate(rs.getTimestamp("regdate"));
	            article.setReadcount(rs.getInt("readcount"));
	            article.setRef(rs.getInt("ref"));
	            article.setStep(rs.getInt("step"));
	            article.setDepth(rs.getInt("depth"));
	            article.setContent(rs.getString("content"));
	            article.setIp(rs.getString("ip"));
	        }
	    } catch(Exception e){
	        e.printStackTrace();
	    } finally{
	        if(rs != null) try { rs.close(); } catch (SQLException e){}
	        if(pstmt != null) try { pstmt.close(); } catch (SQLException e){}
	        if(conn != null) try { conn.close(); } catch (SQLException e){}
	    }
	    return article;
	}
	
	
	// updateForm.jsp 에서 비밀번호를 입력한 후 글 수정을 클릭하면 게시물 수정을 처리하는 메서드
	public int updateArticle(BoardDto article){
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    String dbpassword = "";
	    String sql = "";
	    int result = -1; // 결과 값
	    try{
	        conn = ConnUtil.getConnection();
	        pstmt = conn.prepareStatement("select PASS from BOARD where NUM = ?");
	        pstmt.setInt(1, article.getNum());
	        rs = pstmt.executeQuery();
	        if(rs.next()){
	            dbpassword = rs.getString("pass");// 비밀번호 비교
	            if(dbpassword.equals(article.getPass())){
	                sql = "update BOARD set WRITER=?,EMAIL=?,"
	                    + "SUBJECT=?,CONTENT=? where NUM=?";
	                pstmt.close();
	                pstmt = conn.prepareStatement(sql);
	                pstmt.setString(1, article.getWriter());
	                pstmt.setString(2, article.getEmail());
	                pstmt.setString(3, article.getSubject());
	                pstmt.setString(4, article.getContent());
	                pstmt.setInt(5, article.getNum());
	                pstmt.executeQuery();
	                result = 1; // 수정 성공
	            } else {
	                result = 0; // 수정 실패
	            }
	        }
	    } catch(Exception e){
	        e.printStackTrace();
	    } finally{
	        if(rs != null) try { rs.close(); } catch (SQLException e){}
	        if(pstmt != null) try { pstmt.close(); } catch (SQLException e){}
	        if(conn != null) try { conn.close(); } catch (SQLException e){}
	    }
	    return result;
	}
	
	// 글 삭제를 눌렀을 때 비밀번호를 입력하도록 하고 비번을 입력하면
	//DB와 비교한 후 삭제할 처리 메서드
	
	public int deleteArticle(int num, String pass){
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    String dbpasswd = "";
	    int result = -1; //결과 값
	    try{
	        conn = ConnUtil.getConnection();
	        pstmt = conn.prepareStatement(
	                "select PASS from BOARD where NUM=?");
	        pstmt.setInt(1, num);
	        rs = pstmt.executeQuery();
	        if(rs.next()){
	            dbpasswd = rs.getString("pass");
	            if(dbpasswd.equals(pass)){
	                pstmt.close();
	                pstmt = conn.prepareStatement("delete from BOARD where NUM=?");
	                pstmt.setInt(1, num);
	                pstmt.executeQuery();
	                result = 1; //글삭제 성공
	            } else {
	                result = 0; //비밀번호 틀림
	            }
	        }
	    }catch(Exception e){
	        e.printStackTrace();
	    } finally{
	        if(rs != null) try { rs.close(); } catch (SQLException e){}
	        if(pstmt != null) try { pstmt.close(); } catch (SQLException e){}
	        if(conn != null) try { conn.close(); } catch (SQLException e){}
	    }
	    return result;
	}

	

}