package examjava4;

import java.util.Scanner;

public class switch_0330_04 {

	public static void main(String[] args) {
		// 성적표 만들기 //입력받을 것
		Scanner key = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int score = 0;
		score = key.nextInt();
		String grade = ""; //string을 만들어둔다.
		
		switch(score/5) {
		case 20: // case 뒤에는 몫이라고 생각하자.
			grade ="A+";break;
		case 19:
			grade ="A";break;	
		case 18:
			grade ="B+";break;
		case 17:
			grade ="B";break;
		case 16:
			grade ="C+";break;
		case 15:
			grade ="C";break;
		case 14:
			grade ="D+";break;
		case 13:
			grade ="D";break;
		case 12:
			grade ="E";break;
		case 11:
			grade ="F";break;
	
		}	
		System.out.printf("%d점은 %s등급입니다.", score, grade);
	}

}
