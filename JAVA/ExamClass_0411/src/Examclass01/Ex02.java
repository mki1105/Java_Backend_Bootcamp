package Examclass01;
// Ŭ���� : ��ü�� ������ ���� ��(�ڷ���)
// ���� �ִ� �Ӽ��� ������ ����(���)���� ����
// 
public class Ex02 {

		public static void main(String[] args) {
			//���� ���� �̸��� ���̸� ����
			String[] name = new String[3];
			int[] age = new int[3];
			
			name[0] = "ȫ�浿";
			age[0] = 20;
			
			name[1] = "�̼���";
			age[1] = 22;
			
			name[2] = "������";
			age[2] = 23;
			
			for(int i = 0; i < 3; i++) {
				System.out.println(name[i] + "," + age[i]);
			}
			
			//�̸��� ���̴� ���� index�� ����
			//�Ǽ� ���ɼ�
			name[0] = "ȫ��";
			age[1] = 34;

	}

}
