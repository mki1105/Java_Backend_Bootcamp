package examjava1;
	import java.util.Scanner;
public class Exam04_0328 {
	public static void main(String[] args) {
		//자신의 이니셜을 입력받아 출력하는 프로그램
		
		//사용자님께 이니셜을 입력하라고 안내해
		System.out.print("자신의 이니셜은?");
		//사용자로부터 이니셜을 입력받아
		Scanner in = new Scanner(System.in);
		//입력받은 이니셜을 저장해
		String init = in.nextLine();
		//저장한 이니셜을 사용자님께 출력해
		System.out.println("입력한 이니셜은" + init + "입니다");
		
		
		System.out.print("첫 번째 이니셜 입력 :");
		char init1 = in.nextLine().charAt(0);
		System.out.print("두 번째 이니셜 입력 :");
		char init2 = in.nextLine().charAt(0);
		System.out.print("세 번째 이니셜 입력 :");
		char init3 = in.nextLine().charAt(0);
		
		System.out.println(init1 + "." + init2 + "." + init3 );
	
		//3과목의 성적을 입력받아 합계 평균 구하는 프로그램
		//사용자한테 첫 번째 과목의 점수를 입력하라고 안내해
		System.out.println("첫 번째 과목의 점수 :");
		int sub1 = in.nextInt();
		//사용자한테 두 번째 과목의 점수를 입력하라고 안내해
		System.out.println("두 번째 과목의 점수 :");
		int sub2 = in.nextInt();
		//사용자한테 세 번째 과목의 점수를 입력하라고 안내해
		System.out.println("세 번째 과목의 점수 :");
		int sub3 = in.nextInt();
		
		// sum, total , average(avg)
					
		//합계를 구해
		float total1 = sub1 + sub2 + sub3;
		//평균을 구해
		float avg = total1 / 3;    //명시적으로 앞에 (float 넣어도 된다), 3.0f 또는 F를 넣어도 된다.
		//합계와 평균을 사용자한테 알려줘	
		System.out.println("총점 :" + total1 + "점");
		System.out.println("평균 :" + avg + "점");
		
		
		// 이름 + 나이 입력받아 출력하기
		System.out.println("당신의 이름음 무엇입니까?");
		String name = in.nextLine();
		System.out.println(name + "님의 나이는 몇 살 입니까?");
		int age = in.nextInt();
		System.out.println(name + "님의 나이는" + age + "살입니다.");
		
				
		// 서식 출력 %s, %c, %d, %f 활용
		System.out.printf("%s님의 나이는 몇 살 입니까?", name);
		System.out.println();
		System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);

	
	}

}
