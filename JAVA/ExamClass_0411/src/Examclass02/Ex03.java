package Examclass02;
// Ŭ���� : ��ü�� ������ ���� ��(�ڷ���)
// ���� �ִ� �Ӽ��� ������ ����(���)���� ����
// �迭 ��ü �����ϴ°� ���� - String [] name = new String[5]; //���ڿ� 5�� �迭 ����
// int[] arr =null; - arr�� �迭�� �̸�, �迭 �������� ����, ���߿� ������� ĭ���� �����.
public class Ex03 {
	public static void main(String[] args) {
		InfoGroup ig = new InfoGroup();
		ig.infos = new Info[3]; //
		
		ig.infos[0] = new Info();
		ig.infos[0].name = "ȫ�浿";
		ig.infos[0].age = 20;
		
		ig.infos[1] = new Info();
		ig.infos[1].name = "�̼���";
		ig.infos[1].age = 25;
		
		ig.infos[2] = new Info();
		ig.infos[2].name = "������";
		ig.infos[2].age = 15;
		
		for(int i = 0; i < ig.infos.length; i++) {
			ig.infos[i].printInfo();
		}
	}
}
