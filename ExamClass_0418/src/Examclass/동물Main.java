package Examclass;

public class ����Main {
	public static void main(String[] args) {
		�� d1 = new ��();
		�� w1 = new ��();
		�����ʱ��� o1 = new �����ʱ���();
		
		������ e1 = new ������();
		�� c1 = new ��();
		��� p1 = new ���();
		
		��� s1 = new ���();
		���� k1 = new ����();
		
		//���� �迭 ����
		����[] animals = new ����[] {
				d1, w1, o1, e1, c1, p1, s1, k1
		};
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getClass().getName());
			animals[i].ȣ��();
			animals[i].�����δ�();
			animals[i].�ܴ�();
			System.out.println();
		}
		//������ �迭 ����
		������[] arr = new ������[] {
				d1, w1, o1// s1 �ٸ� ���� �Ұ�
		};
		for(int i = 0; i < arr.length; i++) {
			arr[i].������Ư¡();
		}
		//������ ��� ���� �迭 ����
		System.out.println("===============");
		��������»���[] warr = new ��������»���[] {
				w1, o1, s1, p1, k1
		};
		for(int i = 0; i < warr.length; i++) {
			warr[i].����Ȱ();
		}
		
		
	}
}