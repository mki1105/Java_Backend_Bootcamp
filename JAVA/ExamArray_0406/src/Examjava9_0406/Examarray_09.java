package Examjava9_0406;
import java.util.Scanner;
public class Examarray_09 {

	public static void main(String[] args) {
		// ���ѹ迭 ��Ʈ������ �ߺ���
		Scanner scan = new Scanner(System.in);
		//1. �迭�̳� ���� �����ϱ�
		int index = 0, defaultsize =3, size =3; //���� �Է��� �ε����� �����μ���. �Էµ� �迭�� �ڸ�!!
		String str; //��Ʈ�� ���� ����
		String[] arr = new String[size]; //����� arr��� ��Ʈ�� �迭�� ������ ����
		boolean flag; // �� �� ���� ����
		
		System.out.println("�Է��� �����Ϸ��� '����'�� �Է��ϼ���.");
		
		//2. �ݺ� ���ǹ� �ۼ��ϰ� �Է¹ް�, �����ϱ�
		while(true) {
			System.out.printf("�Է�(������� : %d) :", arr.length); //size��� �Է��ص� ��.
			str = scan.nextLine(); //���ڿ� �Է¹ޱ�
			//������ ������ ������ �� �ְ� �Է¹ޱ�
			if(str.equals("����")) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}//if�� ����
			// �ߺ�Ȯ���ϱ�
			flag = true; // ���� ���̴�.
			for(int i=0; i < index ;i++) { //index���� 
				if(arr[i].equals(str)) {
					System.out.println("�ߺ�!");
					flag = false; //�ߺ��� ��� true�� false�� �����ض�
				}
			}//for�� ����
			// 3. ���ѹ迭 ���ǽ� // �ߺ��� �ƴϸ� �迭�� �߰��ϴ� ���ǽ�
			if(flag) { //for���� �������� �ߺ��� ��� false�� ������ while������ true? �ѹ� �����
				arr[index++] = str; // �迭�� �����ϴ°�  ��� �Ű澲��! arr �迭 �ڸ��� str��Ʈ������ ����
				for(int i =0; i < index; i++) {
					System.out.print(arr[i] + ","); //
				}
				System.out.println();
			}						
			if(size == index) {// ���� ����� �ε����� ���ٸ� �÷�����
				size += defaultsize;
				String[] tmp = arr;// tmp�� �ű�� �迭�� ������� ���ֱ�
				arr = new String[size];
				//arr���� ���̸�ŭ�� �־����
				for(int i =0; i< tmp.length; i++) {
					arr[i] = tmp[i];
				}
				System.out.println("������(" + arr.length + ")");
			} /* if(size == index) {// ���� ����� �ε����� ���ٸ� �÷�����
			  * size += defaultsize;
			  * arr = Arrays.copyOf(arr.size);
			  * System.out.println("������(" + size + ")");
			  */
		}
	}
}
