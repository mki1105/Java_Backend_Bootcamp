package ArrayList;

public class Main {

	public static void main(String[] args) {
		InfoManager info = new InfoManager();
		
		info.listadd(1, "ȫ�浿", 10);
		info.listadd(2, "������", 20);
		info.listadd(3, "��ΰ�", 30);
		info.listadd(4, "�̼���", 40);
		info.listadd(5, "�����", 50);
		
		System.out.println("ȸ�����");
		System.out.println(info.printList());
		
		System.out.println("ȸ�������ϱ�");
		info.edit(2, "����", 25);
		info.edit(3, "������", 37);
		info.edit(4, "�ļֶ�");
		System.out.println(info.printList());

		System.out.println("ȸ���˻�");
		System.out.println(info.serch("������"));
		
		System.out.println("ȸ������");
		info.delete(4); // 4�� id ����(������ �ٷ� ����)
	
		System.out.println(info.printList());
	}

}
