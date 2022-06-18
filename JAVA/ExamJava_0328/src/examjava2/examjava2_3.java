package examjava2;

import java.util.Scanner;
public class examjava2_3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("당신의 이름은 무엇입니까?");
		String name = in.nextLine();
		System.out.println(name + "나이는 몇 살 입니까 ?");
		int age = in.nextInt();
		System.out.println(name + " 나이는" + age + " 입니다." );
	}

}
