package Examjava2_02;

	public class Info {
		String name;
		int age;
		
		/*
		 * ������(Constructor)
		 * - Ŭ������� ������ �̸��� ��� �޼���
		 * - ��ü ���� �� �ݵ�� ȣ�� (ex. new Info(); )
		 * - ���ڰ� ���� ������(Default Constructor)
		 * - ��ȯ �ڷ��� ������ ����
		 * - ����Ʈ �����ڴ� �����ڸ� �ϳ��� �������� ������ JVM�� �˾Ƽ� ȣ��
		 * - �����ε� ����(��ü �����ϴ� ����� �پ��ϰ� ����)
		 * - ��ü�� �ʱ�ȭ �����̴�!
		 */
		Info(){
			System.out.println("Info()");
		}
		Info(String n, int a){
			System.out.println("Info(String, int)");
			name = n;
			age = a;
		}

}
