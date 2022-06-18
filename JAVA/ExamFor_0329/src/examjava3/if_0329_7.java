package examjava3;

import java.util.Scanner;

public class if_0329_7 {

	public static void main(String[] args) {
		//수를 입력받아 출력하시오(단, 3의 배수는 제외하고 3의 배수이면서 5인 배수인 수는 출력)
		Scanner scan = new Scanner(System.in);
		int n =1;
		if(n%3 !=0 || n %5 ==0) { //!= 같지 않냐고 물어보는 것.
			System.out.println(n);
		}
		System.out.println("end");
	}

}
