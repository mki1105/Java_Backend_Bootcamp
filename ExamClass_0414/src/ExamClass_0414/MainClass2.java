package ExamClass_0414;
/* �������α׷� �����
 * �迭 ����Ͽ� ȸ���� 5���� ������ �����ϴ� ���α׷�
 * ���, ��Ϻ���, �˻��ϱ�, �����ϱ�, �����ϱ� ���� * 
 */
public class MainClass2 {

	public static void main(String[] args) {
		InfoManager2 ifm2 = new InfoManager2(); //Ŭ���� ȣ��
		// 5�� ���
		ifm2.setInfo(0, "�达", 10); // ������ȣ�� ���ٲٳ�? 
		ifm2.setInfo(1, "����", 20);
		ifm2.setInfo(2, "�־�", 30);
		ifm2.setInfo(3, "�Ѿ�", 40);
		ifm2.setInfo(4, "�羾", 50);
		
		// 5�� ���
		System.out.println("(ȸ�� 5�� ���)");
		System.out.println("id" + "\t" + "�̸�" + "\t" + "����");
		System.out.println(ifm2.printList());
		
		System.out.println("==================");
		System.out.println("(ȸ�� �˻��ϱ�)");
		System.out.println("id" + "\t" + "�̸�" + "\t" + "����");
		ifm2.getSerch("����");
		ifm2.getSerch("��");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("(ȸ�� �����ϱ�)");
		ifm2.editInfo(1, 22);
		
		System.out.println("==================");
		System.out.println("(ȸ�� �����ϱ�)");
		ifm2.deleteInfo(3);
		
	}

}
