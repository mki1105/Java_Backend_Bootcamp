package examjava2;

public class operator1 {

	public static void main(String[] args) {
		int a = 5, b = 6, c=10, d = 0;
		boolean bo = false;
		d = ++a *b--;
		// a���� ��ġ������Ű��, * ������ ������ b -1 ���ֱ�
		//6*6 �̴ϱ� d�� 36, b�� 1 �����ؼ� 5 (a=6 b=5 c=10 d=36)
		
		System.out.printf("a= %d, b=%d, d=%d/n" + a,b,d);
		d = a++ + ++c - b--;
		// c���� ��ġ������Ű��, + - ������ ������ a�� +1 b�� -1 ���ֱ�
		//(a=7 b=4 c=11 d=12)
		
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n" + a,b,c,d);
		a =1; //������ ���� �ٲ�ϱ� (a=1 b=0 c=11 d=12)
		b =0;
		bo = a++ > 0 || 1 < ++b * d-- / ++c;			
	    System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
	    // || �������� or, ���� �ϳ��� ���̸� 1, �տ� ������ ���̱� ������ �ڿ��� ���� �ȵ�.
	    // a�� 1 ������Ű�� (a=2 b=0 c=11 d=12)
	    	    
	    bo = b++ > 0 && 1 < ++a / ++c * d++;
	    System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
	    // && �������� and, �Ѵ� ���̸� �� 1, �տ� ������ �����̱� ������ �ڿ��� ���� �ȵ�.
	    // �����̶� ���� �� ��������� �ϱ� ������ b�� 1 ����! (a=2 b=1 c=11 d=12)
	}

}
