package examjdbc03;

//VO/DTO/DAO Ω«Ω¿πÆ¡¶ ø¨Ω¿
import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		InfoDao dao = new InfoDao();
//		dao.insertInfo(new InfoVO(0L, "√÷∂Ø∂Ø",
//				LocalDate.parse("1999-12-11"), "O"));
//		dao.delete(new InfoVO(33, "§∑§∑",
//				LocalDate.parse("1923-01-23"),"D"));	
//		List<InfoVO> ret = dao.selectAll();
//		for (InfoVO tmp : ret) {
//			System.out.println(tmp);
//		}
//		
//		System.out.println();
//		SubjectDao sdao = new SubjectDao();
//		SubjectVo vo = new SubjectVo(0, "QWERT");
//		System.out.println(sdao.insertSub(vo));
//
//		List<SubjectVo> ret1 = sdao.selectAll();
//		for (SubjectVo tmp : ret1) {
//			System.out.println(tmp);
//		}
//	
		ScoreDao sdo = new ScoreDao();
		ScoreVo svo = new ScoreVo(0L , "d", "d", 50 );
//		System.out.println(sdo.insertScore(svo));
//		System.out.println(sdo.updateScore(svo));

		List<ScoreVo> ret2 = sdo.scoreview();
		for (ScoreVo tmp : ret2) {
			System.out.println(tmp);
		}
	}
}
