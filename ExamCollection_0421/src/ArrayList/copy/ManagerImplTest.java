package ArrayList.copy;
import java.time.LocalDate;
import java.util.List;

public class ManagerImplTest {
	public static void main(String[] args) {
		ManagerImpl mi = new ManagerImpl();
		Info info1 = new Info(0L, "ȫ�浿", LocalDate.now(), "A");
		Info info2 = new Info(0L, "�̼���", LocalDate.now(), "B");
		Info info3 = new Info(1L, "������", LocalDate.now(), "O");
		Info info4 = new Info(0L, "�Ӳ���", LocalDate.now(), "AB");
		
		System.out.println("���");
		System.out.println(mi.insert(info1));
		System.out.println(mi.insert(info2));
		System.out.println(mi.insert(info3));
		System.out.println(mi.insert(info4));
		System.out.println();
		
		System.out.println("��ü���");
		List<Info> ls = mi.selectAll();
		for(Info tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println();
		
		System.out.println("�ϳ��� �˻�");
		System.out.println(mi.selectOne(1L));
		System.out.println(mi.selectOne(10L)); //����
		System.out.println();
		
		System.out.println("����");		
		Info info5 = new Info(3L, "�Ӳ�����", LocalDate.of(1989, 10, 2), "AB");
		System.out.println(mi.update(info5));
		info5.setNumber(10L);
		System.out.println(mi.update(info5));
		System.out.println("���� Ȯ��");
		System.out.println(mi.selectOne(3L));
		System.out.println();
		
		System.out.println("����");
		System.out.println(mi.delete(1L));
		System.out.println(mi.delete(1L));
		
		System.out.println("���� Ȯ��");
		System.out.println(mi.selectOne(1L));
		System.out.println();
		
		System.out.println("��ü ���");
		System.out.println(mi.selectAll());
		
	}
}



