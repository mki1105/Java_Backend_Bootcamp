package Examclass02;
// Ŭ���� : ��ü�� ������ ���� ��(�ڷ���)
// ���� �ִ� �Ӽ��� ������ ����(���)���� ����
// 
public class Ex02 {
	public static void main(String[] args) {
		//���� ���� �̸��� ���̸� ����
		Info[] infos = new Info[3];
		
		infos[0] = new Info();
		infos[0].name = "ȫ�浿";
		infos[0].age = 20;
		
		infos[1] = new Info();
		infos[1].name = "�̼���";
		infos[1].age = 25;
		
		infos[2] = new Info();
		infos[2].name = "������";
		infos[2].age = 15;
		
		for(int i = 0; i < infos.length; i++) {
			//infos[i].printInfo();
			System.out.println(infos[i].infoToString());
		}
	}
}

