package examjava3;
	import java.util.Scanner;
public class if_java3 {
	public static void main(String[] args) {
		/* ���� 1�뿡 5000��, �ѹ��� 10�� �̻� ��� ��ü�ݾ��� 10%�� �������ش�.
		 * 100�� �̻��� ��� ��ü �ݾ��� 12% �������ش�.X���� ������ ����� �󸶰� �־�� �ϴ°�?
		 */
		Scanner key = new Scanner(System.in);
		// 1. �ʿ��� ���� ��¹� �ۼ��ϱ�
		System.out.println("���� �� ���� �����Ͻðڽ��ϱ�?");
		// 2. ���� �����ϱ�, x�� ���̴ϱ� 
		int x = key.nextInt(); //int �Է¹��� �� nextInt �޼�����
		double money=0;
		// 3. ���ǹ� �ۼ��ϱ�
		if(x >= 100) { //100�� �̻� ��� 12%�� ���ǽ�
			money = x * 5000 * 0.88;
		} else if (x >=10) { //�׷��� �ʰ� 10�� �̻� ��� 10%�� ���ǽ�
			money = x* 5000 * 0.9;
		}
		// 4. ��¹� �ۼ��ϱ�
		System.out.println(x + "�� ������ ���űݾ��� "+ (int)money + "�� �Դϴ�");
		
		key.close();
		
	}
}
