package basketball;
// ������ ���� �����
/* �޴� �̿��Ͽ� �ۼ� �� �Է�(0 :����) :
 * while������ ����� ���Ḹ���
 * �����ڸ� �̿��ؼ� count�� �ʱ�ȭ(0 �Ǵ� ���� ������ �ʱ�ȭ)
 * Getter, Setter ����Ͽ� ����� ���Ƿ� �ʱ�ȭ�� �����ϵ���
 * �ʿ��� Ŭ������? basketball, ���Ǽ� ��������, �����Է¸޴�
 */ 
import java.util.Scanner;
public class Basketball { //���� �Լ� ����ϴ� ��
	public static void main(String[] args) {
		// ���α׷� ����� ������ �� �� �� ���
		Scanner scan = new Scanner(System.in);
		// ����Ʈ ������ ȣ��
		Scorecalculator shoot1 = new Scorecalculator();
		System.out.println(shoot1.getCountShoot1());
		// while�� �����
		while(true) {
			System.out.print("(�� �Է� :(0:����): "); //���� �Է� ���� ������?
			int g = scan.nextInt();

			if(g == 0) { //g ��
				System.out.println("���α׷� ����!");
				break;
			}else if(g == 1) { // ���� 1�̸�
				shoot1.Countplus1();
			}else if(g == 2) { // ���� 2�̸�
				shoot1.Countplus2();
			}else if(g == 3) { // ���� 3�̸�
				shoot1.Countplus3();
			}else {
				System.out.println("�߸��Է� �ϼ̽��ϴ�!");
			}
			// ��� ��ȯ �ϴ�
		}
		System.out.println("������ \t�� ���� \t ����"); //�� get���� �ٽ� �����ϱ�
		System.out.println("===================");
		System.out.println(" 1�� : " + "\t" + shoot1.getCountShoot1() +"\t" +  shoot1.countShoot1score());
		System.out.println(" 2�� : " + "\t" + shoot1.getCountShoot2() + "\t" + shoot1.countShoot2score());
		System.out.println(" 3�� : " + "\t" + shoot1.getCountShoot3() + "\t" + shoot1.countShoot3score());
		System.out.println("Total : " + shoot1.getCountShootSum() + "\t" + shoot1.getScoreShootSum());
	}
}