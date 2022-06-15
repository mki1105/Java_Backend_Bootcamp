package exam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import template.ConnectionPoolTemplate;

public class Mdao {
   private ConnectionPoolTemplate pool;
   private Connection conn;
   PreparedStatement pstmt = null;
   public Mdao() {
      pool = ConnectionPoolTemplate.getInstance();
   }
   public List<Mvo> selectAll(){
      List<Mvo> ls = new ArrayList<>();
      ResultSet rs = null;
      PreparedStatement stmt = null;
      String sql = "SELECT * FROM \"USER\"";
      try {
         conn = pool.getConnection();
         pstmt = conn.prepareStatement(sql);
         String query = "select * from TEMPMEMBER";
         stmt = conn.prepareStatement(query);
         rs = stmt.executeQuery();
         
         while(rs.next()) {
        	 Mvo tmp = new Mvo();
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
     			ls.add(tmp);
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {      
         try {
            if(pstmt != null)pstmt.close();
            if(rs != null)rs.close();
            if(conn != null)conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return (ls.size() == 0) ? null : ls;
   }
}