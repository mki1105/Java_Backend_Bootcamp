package examjava2;

import java.util.Scanner;
public class examjava2_3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("����� �̸��� �����Դϱ�?");
		String name = in.nextLine();
		System.out.println(name + "���̴� �� �� �Դϱ� ?");
		int age = in.nextInt();
		System.out.println(name + " ���̴�" + age + " �Դϴ�." );
	}

}
