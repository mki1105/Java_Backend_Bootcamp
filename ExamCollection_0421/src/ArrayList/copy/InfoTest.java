package ArrayList.copy;
import java.time.LocalDate;

public class InfoTest {
	public static void main(String[] args) {
		Info info1 = new Info();
		info1.setNumber(1L);
		info1.setName("홍길동");
		info1.setBloodType("B");
		info1.setBirth(LocalDate.now());
		
		Info info2 = new Info(2L, "이순신", LocalDate.of(2009, 12, 25), "AB");
		
		System.out.println(info1);
		System.out.println(info2);
		
		Info info3 = new Info(2L, "이순신", LocalDate.of(2009, 12, 25), "AB");
		System.out.println(info1 == info2);
		System.out.println(info2 == info3);
		System.out.println(info1.equals(info2));
		System.out.println(info2.equals(info3));
		
		LocalDate ld = info1.getBirth();
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.lengthOfYear());
		System.out.println(ld.lengthOfMonth());
		System.out.println(ld.toEpochDay());
	}
}