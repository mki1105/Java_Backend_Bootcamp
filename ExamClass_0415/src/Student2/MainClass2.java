package Student2;

public class MainClass2 {
	public static void main(String[] args) {
		// Manager��ü �غ�
		StudentManager im = new StudentManager();
		Student[] infos = im.selectAll();
		// ��ü ��� ��������
		printStudent(infos);
		System.out.println();

		// ��� ��� Ȯ��
		System.out.println("��ϱ�� Ȯ��");
		System.out.println(im.insertStudent(new Student(-1, "ȫ�浿", 20, 11, 11, 11)));
		System.out.println(im.insertStudent("�̼���", 24));
		System.out.println(im.insertStudent("������", 65));
		System.out.println(im.insertStudent("�Ż��Ӵ�", 54));
		System.out.println(im.insertStudent("ȫ�浿", 23));
		System.out.println(im.insertStudent("�Ӳ���", 19));
		im.setScore(1, new int[] { 22, 22, 22 });
		im.setScore(2, new int[] { 33, 33, 33 });
		im.setScore(3, 44, 44, 44);
		im.setScore(4, 55, 55, 55);
		im.setScore(4, StudentManager.KOR, 77);
		im.setScore(4, StudentManager.ENG, 77);
		im.setScore(4, StudentManager.MAT, 77);

		printStudent(im.selectAll());
		System.out.println();

		// �˻��ϱ�(��ȣ�� �˻��Ͽ� Info�� ������)
		System.out.println("�˻���� Ȯ��");
		int idx = im.indexOfSearchStudentName("ȫ�浿");
		System.out.println(idx);
		System.out.println(im.indexOfSearchStudentName(idx + 1, "ȫ�浿"));
		System.out.println(im.indexOfSearchStudentName("������"));
		System.out.println(im.indexOfSearchStudentName("�庸��"));
		System.out.println(im.indexOfSearchStudentName("�Ӳ���"));

		System.out.println("�ε����� ���� �˻�");
		Student tmp = im.searchStudent(4);
		printStudent(tmp);
		printStudent(im.searchStudent(0));
		printStudent(im.searchStudent(7));
		System.out.println();

		// �����ϱ�(������ ��ü�� ����)
		System.out.println("������� Ȯ��");
		System.out.println(im.editStudent(new Student(0, "ȫ�浿", 200, 100, 100, 100)));
		printStudent(im.searchStudent(0));
		System.out.println(im.editStudent(new Student(10, "��浿", 200, 9, 9, 9)));
		printStudent(im.selectAll());
		System.out.println();
		printStudent(im.searchStudent(3));
		System.out.println();

		// �����ϱ�(��ȣ�� ����)
		System.out.println("������� Ȯ��");
		System.out.println(im.removeInfo("�Ż��Ӵ�"));
		printStudent(im.selectAll());
		System.out.println();
		im.removeInfo("ȫ�浿");
		printStudent(im.selectAll());
		System.out.println();
		System.out.println(im.insertStudent(new Student(-1, "ȫ�浿", 20, 88, 88, 88)));
		System.out.println(im.insertStudent("�庸��", 23));
		im.setScore(im.indexOfSearchStudentName("�庸��"), new int[] { 99, 99, 99 });
		System.out.println(im.insertStudent("�念��", 21));
		idx = im.indexOfSearchStudentName("�念��");
		if (idx != -1) {
			im.setScore(idx, new int[] { 10, 10, 10 });
		}
		printStudent(im.selectAll());
		System.out.println();
		System.out.println(im.removeInfo("�念��"));
		printStudent(im.selectAll());
		System.out.println();
		printStudent(im.searchStudent(3));
		System.out.println();

		int i = -1;
		// ȫ�浿�� ���� ��������(���� �ϳ��� ����ϰ� ���� ��)
		i = im.indexOfSearchStudentName("ȫ�浿");
		if (i != -1) {
			Student stud = im.searchStudent(i);
			float avg = stud.getAvg();
			System.out.println("ȫ�浿 �л��� ��� ����:" + avg + "��");
		}
		i = im.indexOfSearchStudentName("�̼���");
		if (i != -1) {
			Student stud = im.searchStudent(i);
			int kor = stud.getKor();
			System.out.println("�̼��� �л��� ���� ����:" + kor + "��");
		}
		i = im.indexOfSearchStudentName("ȫ�浿");
		if (i != -1) {
			Student stud = im.searchStudent(i);
			int age = stud.getAge();
			System.out.println("ȫ�浿 �л��� ����:" + age + "��");
		}

		// ��ü ����
		System.out.println("��ü ���� ���");
		im.removeAll();
		printStudent(im.selectAll());

	}

	private static void printStudent(Student[] infos) {
		if (infos == null || infos.length == 0) {
			System.out.println("����� ����");
		}
		for (int i = 0; i < infos.length; i++) {
			printStudent(infos[i]);
		}
	}

	private static void printStudent(Student info) {
		if (info == null)
			System.out.println("������ ����");
		else {
			System.out.printf("%d�� �̸�:%s, ����:%d\n", info.getNumber(), info.getName(), info.getAge());
			System.out.printf("��������:%d, ��������:%d, ��������:%d, ����:%d, �������: %.2f\n", info.getKor(), info.getEng(),
					info.getMat(), info.getTotal(), info.getAvg());
		}
	}

}