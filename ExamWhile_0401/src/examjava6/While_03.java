package examjava6;
// do ~ while
public class While_03 {

	public static void main(String[] args) { 
		int n = 5;
		while(n >0) {
			System.out.println("n: " + n--);
		}
		do {
			System.out.println("n: " + n++);
		}while(n > 5);
		System.out.println("���α׷� ����");
		
	} 
}
	/*  while(���ǽ�) {��������;}
	 *  do {���ӹ���;} while(���ǽ�)
	 *  ���ǽ��� �����̶� ���ӹ�����  �ּ� 1ȸ�� ����
	 *  do �Է��� �ް�����Ѵ�. ���� �����ϰ� ������ ����.
	 */