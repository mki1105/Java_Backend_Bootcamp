package ArrayList.copy;
import java.time.LocalDate;
import java.util.List;

public class ManagerImplTest {
	public static void main(String[] args) {
		ManagerImpl mi = new ManagerImpl();
		Info info1 = new Info(0L, "홍길동", LocalDate.now(), "A");
		Info info2 = new Info(0L, "이순신", LocalDate.now(), "B");
		Info info3 = new Info(1L, "강감찬", LocalDate.now(), "O");
		Info info4 = new Info(0L, "임꺽정", LocalDate.now(), "AB");
		
		System.out.println("등록");
		System.out.println(mi.insert(info1));
		System.out.println(mi.insert(info2));
		System.out.println(mi.insert(info3));
		System.out.println(mi.insert(info4));
		System.out.println();
		
		System.out.println("전체목록");
		List<Info> ls = mi.selectAll();
		for(Info tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println();
		
		System.out.println("하나만 검색");
		System.out.println(mi.selectOne(1L));
		System.out.println(mi.selectOne(10L)); //없음
		System.out.println();
		
		System.out.println("수정");		
		Info info5 = new Info(3L, "임꺽저엉", LocalDate.of(1989, 10, 2), "AB");
		System.out.println(mi.update(info5));
		info5.setNumber(10L);
		System.out.println(mi.update(info5));
		System.out.println("수정 확인");
		System.out.println(mi.selectOne(3L));
		System.out.println();
		
		System.out.println("삭제");
		System.out.println(mi.delete(1L));
		System.out.println(mi.delete(1L));
		
		System.out.println("삭제 확인");
		System.out.println(mi.selectOne(1L));
		System.out.println();
		
		System.out.println("전체 목록");
		System.out.println(mi.selectAll());
		
	}
}



