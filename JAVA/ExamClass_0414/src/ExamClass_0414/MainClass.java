package ExamClass_0414;
/* �������α׷� �����
 * �迭 ����Ͽ� ȸ���� 5���� ������ �����ϴ� ���α׷�
 * ���, ��Ϻ���, �˻��ϱ�, �����ϱ�, �����ϱ� ���� * 
 */
public class MainClass {

	public static void main(String[] args) {
		InfoManager ifm = new InfoManager(); //Ŭ���� ȣ��
		ifm.setInfo(0, "�达", 10); // ������ȣ�� ���ٲٳ�? 
		ifm.setInfo(1, "����", 20);
		ifm.setInfo(2, "�־�", 30);
		ifm.setInfo(3, "�Ѿ�", 40);
		ifm.setInfo(4, "�羾", 50);
		
		System.out.println("(ȸ�� 5�� ���)");
		System.out.println("id" + "\t" + "�̸�" + "\t" + "����");
		
		System.out.println();
		
		System.out.println("==================");
		System.out.println("(ȸ�� �˻��ϱ�)");
		System.out.println("id" + "\t" + "�̸�" + "\t" + "����");
		ifm.getSerch("����");
		ifm.getSerch("��");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("(ȸ�� �����ϱ�)");
		ifm.editInfo(1, 22);
		ifm.getInfoList(); //������
		
		System.out.println("==================");
		System.out.println("(ȸ�� �����ϱ�)");
		ifm.deleteInfo(3);
		
	}

}
