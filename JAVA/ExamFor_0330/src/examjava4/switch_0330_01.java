package examjava4;

public class switch_0330_01 {

	public static void main(String[] args) {
		// switch ���, ��ȣ �ȿ� ���°� �������� �Ѵ�.
		int n =3 ;
	switch(n) { //� ������̽��� ��ġ�� �Ǵ°�(���κ�ȯ��, �帧�� �������� ������ �����Ѵ�)
	case 1 : // �� ���̽����� ������ġ
		System.out.println("1");
		break; // switch, for, while ������ �ı��ϴ��� �������� ���
	case 2 :
		System.out.println("2");
	case 3 :
		System.out.println("3");
		default : //��ġ�� ���ప�� ���� �� ����Ǵ� ��, else if�� ���
		System.out.println("default");
		
	}
	
	}

}
