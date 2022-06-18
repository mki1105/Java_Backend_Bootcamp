package ExamClass_0415;

public class MainClass {
	public static void main(String[] args) {
		//Manager��ü �غ�
		InfoManager im = new InfoManager();
		Info[] infos = im.selectAll();
		//��ü ��� ��������
		printInfo(infos);
		System.out.println();
		
		//��� ��� Ȯ��
		System.out.println("��ϱ�� Ȯ��");
		System.out.println(im.insertInfo(new Info("ȫ�浿", 20)));
		System.out.println(im.insertInfo("�̼���", 24));
		System.out.println(im.insertInfo("������", 65));
		System.out.println(im.insertInfo("�Ż��Ӵ�", 54));
		System.out.println(im.insertInfo("ȫ�浿", 23));
		System.out.println(im.insertInfo("�Ӳ���", 19));
		printInfo(im.selectAll());
		System.out.println();
		
		//�˻��ϱ�(��ȣ�� �˻��Ͽ� Info�� ������)
		System.out.println("�˻���� Ȯ��");
		int idx = im.indexOfSearchInfoName("ȫ�浿");
		System.out.println(idx);
		System.out.println(im.indexOfSearchInfoName(idx+1, "ȫ�浿"));
		System.out.println(im.indexOfSearchInfoName("������"));
		System.out.println(im.indexOfSearchInfoName("�庸��"));
		System.out.println(im.indexOfSearchInfoName("�Ӳ���"));
		
		System.out.println("�ε����� ���� �˻�");
		Info tmp = im.searchInfo(4);
		printInfo(tmp);
		printInfo(im.searchInfo(0));
		printInfo(im.searchInfo(7));
		System.out.println();
		
		//�����ϱ�(������ ��ü�� ����)
		System.out.println("������� Ȯ��");
		System.out.println(im.editInfo(new Info(0, "ȫ�浿", 200)));
		printInfo(im.searchInfo(0));
		System.out.println(im.editInfo(new Info(10, "��浿", 200)));
		printInfo(im.selectAll());
		printInfo(im.searchInfo(3));
		System.out.println();
		
		//�����ϱ�(��ȣ�� ����)
		System.out.println("������� Ȯ��");
		System.out.println(im.removeInfo("�Ż��Ӵ�"));
		printInfo(im.selectAll());
		System.out.println();
		im.removeInfo("ȫ�浿");
		printInfo(im.selectAll());
		System.out.println();
		System.out.println(im.insertInfo(new Info("ȫ�浿", 20)));
		System.out.println(im.insertInfo("�庸��", 23));
		System.out.println(im.insertInfo("�念��", 21));
		printInfo(im.selectAll());
		System.out.println();
		System.out.println(im.removeInfo("�念��"));
		printInfo(im.selectAll());
		System.out.println();
		printInfo(im.searchInfo(3));
		System.out.println();
		
		//��ü ����
		System.out.println("��ü ���� ���");
		im.removeAll();
		printInfo(im.selectAll());

	}
	private static void printInfo(Info[] infos) {
		if(infos == null || infos.length == 0) {
			System.out.println("����� ����");
		}
		for(int i = 0; i < infos.length; i++) {
			printInfo(infos[i]);
		}
	}
	private static void printInfo(Info info) {
		if (info == null)
			System.out.println("������ ����");
		else {
			System.out.printf("%d�� �̸�:%s, ����:%d\n", info.getNumber(), info.getName(), info.getAge());
		}
	}
	
}