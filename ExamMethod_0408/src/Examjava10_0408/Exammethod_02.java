package Examjava10_0408;

public class Exammethod_02 {
	//�켱 ���ο� �ڵ带 ¥�� //��ĳ�� ������� �� �� �ʿ� ����!
	//Ȧ������ ¦������ true or false�� ���Ǹ� �غ���
//	public static ��ȯ�ڷ��� �޼����(�Ű�������..) {
// 	����;
// 	����;
//	[return; or return ��ȯ��;]
//}
	public static void main(String[] args) {
		System.out.println("1������ :" );
		int a1 = 4;
		int a2 = 5;
		System.out.println(bignum(a1, a2) + "�� �� ū �� �Դϴ�.");
		System.out.println();
		
		System.out.println("2������ :");
		int b1 = 4;
		int b2 = 7;
		System.out.println("�� ���� ���� ���� : " + intersum(b1,b2));
		System.out.println();
		
		System.out.println("3������ :");
		int c = 6;
		System.out.println("�� ���� " + oddeven(c) + "�Դϴ�.");
		System.out.println();
		
		System.out.println("4������ :");
		System.out.printf("1���� 5������ Ȧ�� ���� : " + oddsum(5));
		System.out.println();
		System.out.println();
		
		System.out.println("5������ :");
		int d1 = 5;
		float d2 = 1.25f;
		System.out.println("�� ���� ����: " + ifsum(d1,d2));
		System.out.println();
		
		System.out.println("6������ :");
		int e = -135;
		System.out.println(absnum(e));
		System.out.println();
		
		System.out.println("7������ :");
		double cm = 10;
		System.out.println("10cm == " + convertInch(cm) + "inch");
		System.out.println();
		
		System.out.println("8������ :");
		System.out.println("1�ް� ����Ʈ�� " + byteTobit(1,'M') + "bit ");
		System.out.println();

	}
	// 1.�� ���� �Է¹޾� ū �� ��� �޼��� �����
	public static int bignum(int su1, int su2) {
		int ret = 0;
		if(su1 > su2) {
			ret = su1;
		} else {
			ret = su2;
		}
		System.out.println("");
		return ret; //��ȯ���ֱ�
	}	
	
	// 2. �� ���� �Է¹޾� �� ���� ������ ���� ����ϴ� �޼��� �����
	public static int intersum(int su1, int su2) {
		if(su1 > su2) {
			int tmp = su1; // �� �����ϱ� su1�� �� ũ�� ġȯ
			su1 = su2;
			su2 = tmp;
		}
		int sum = 0;
		for(int i = su1+1 ; i < su2; i++) {//su1+1 �� 1�� ������?
			sum += i;
		}
		return sum; // System.out.println(sum);
	}	
	
	// 3. �Է¹��� ���� Ȧ������ ¦������ ��ȯ�ϴ� �޼���
	public static String oddeven(int su1) {
	//boolean flag = true; // ������ �صδ°� ������? ����?
		if(su1 % 2==0) {
			return "¦��";
		} else
			return "Ȧ��";
	}
	
	// 4. ���� �Է¹޾� 1���� �Է¹��� �� ������ Ȧ�� ���� ��ȯ�ϴ� �޼���
	public static int oddsum(int su1) { //�Ű������� 1���� ������ �ȴ�.
		int sum = 0;
		for(int i = 1; i <= su1 ; i++) { // ��
			if(i % 2 == 1) {
				sum += i;
			}
		}
		return sum; //for�� ������ �־�� ��.
	}
	
	// 5. ������ ���� �� ���� ���� ��ȯ�ϴ� �޼��� �����(�����ε�)
		/* ����(int)2�� ���� ��
		 * �Ǽ�(float) 2�� ���� ��
		 * ������ �Ǽ� 2�� ���� ��
		 * �Ǽ��� ���� 2�� ���� ��
		 */
	public static int ifsum(int su1, int su2) {
		return su1 + su2;		
	}
	public static float ifsum(float su1,float su2) {
		return su1 + su2;
	}
	public static float ifsum(int su1, float su2) {
		return su1 + su2;
	}
	public static float ifsum(float su1, int su2) {
		return su1 + su2;
	}
	
	//6. ���ڷ� N�� �����ϸ� N�� ���� ���밪�� ��ȯ�ϴ� �Լ�
	public static int absnum(int n) { //������ ����� �ٲ��ִ� �޼��� 
		return n < 0 ? -n : n; //���׿����� ������?���̸�1 :�����̸�2
	}
	public static float absnum(float n) {
		return n <0 ? -n : n;
	}
	
	//7. cm���� inch������ ��ȯ�ϴ� �Լ�(1Inch == 2.54cm)
	public static double convertInch(double cm) {
		double inch = cm / 2.54; //2.54�� ������ inch ���� ���� �� �ִ�.
		return inch;
	}
	
	//8. ������ �뷮(byte)�� �Ű������� �Է¹޾� bit ������ ��ȯ�ϴ� �Լ�
	// ������ �뷮�� �Է��� �� ������ �Է��Ѵ�(G, M, K)
	// switch�Լ� ���, ����������n, ������ b ����
	// 1byte = = 8bit, 1kb = 1024byte = 8 * 1024bit
	public static double byteTobit(int n, char b) {
		double size= 0;
		switch(b) {
		case 'K' :
			size = 1024L * 8;
			break;
		case 'M' :
			size = 1024L * 1024L * 8;
			break;
		case 'G' :
			size = 1024L *1024L * 1024L * 8;
			break;
		}
		return n * size; // �Ű����� n * size.
	}

}
