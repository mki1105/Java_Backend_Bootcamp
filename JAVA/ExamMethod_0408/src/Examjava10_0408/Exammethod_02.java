package Examjava10_0408;

public class Exammethod_02 {
	//우선 메인에 코드를 짜라 //스캐너 입출력을 꼭 할 필요 없다!
	//홀수인지 짝수인지 true or false로 정의를 해보자
//	public static 반환자료형 메서드명(매개변수들..) {
// 	문장;
// 	문장;
//	[return; or return 반환값;]
//}
	public static void main(String[] args) {
		System.out.println("1번문제 :" );
		int a1 = 4;
		int a2 = 5;
		System.out.println(bignum(a1, a2) + "가 더 큰 수 입니다.");
		System.out.println();
		
		System.out.println("2번문제 :");
		int b1 = 4;
		int b2 = 7;
		System.out.println("두 수의 사이 합은 : " + intersum(b1,b2));
		System.out.println();
		
		System.out.println("3번문제 :");
		int c = 6;
		System.out.println("이 수는 " + oddeven(c) + "입니다.");
		System.out.println();
		
		System.out.println("4번문제 :");
		System.out.printf("1부터 5까지의 홀수 합은 : " + oddsum(5));
		System.out.println();
		System.out.println();
		
		System.out.println("5번문제 :");
		int d1 = 5;
		float d2 = 1.25f;
		System.out.println("두 수의 합은: " + ifsum(d1,d2));
		System.out.println();
		
		System.out.println("6번문제 :");
		int e = -135;
		System.out.println(absnum(e));
		System.out.println();
		
		System.out.println("7번문제 :");
		double cm = 10;
		System.out.println("10cm == " + convertInch(cm) + "inch");
		System.out.println();
		
		System.out.println("8번문제 :");
		System.out.println("1메가 바이트는 " + byteTobit(1,'M') + "bit ");
		System.out.println();

	}
	// 1.두 수를 입력받아 큰 수 출력 메서드 만들기
	public static int bignum(int su1, int su2) {
		int ret = 0;
		if(su1 > su2) {
			ret = su1;
		} else {
			ret = su2;
		}
		System.out.println("");
		return ret; //반환해주기
	}	
	
	// 2. 두 수를 입력받아 두 수의 사이의 합을 출력하는 메서드 만들기
	public static int intersum(int su1, int su2) {
		if(su1 > su2) {
			int tmp = su1; // 값 저장하기 su1이 더 크면 치환
			su1 = su2;
			su2 = tmp;
		}
		int sum = 0;
		for(int i = su1+1 ; i < su2; i++) {//su1+1 왜 1을 더하지?
			sum += i;
		}
		return sum; // System.out.println(sum);
	}	
	
	// 3. 입력받은 수가 홀수인지 짝수인지 반환하는 메서드
	public static String oddeven(int su1) {
	//boolean flag = true; // 참으로 해두는게 좋은가? 거짓?
		if(su1 % 2==0) {
			return "짝수";
		} else
			return "홀수";
	}
	
	// 4. 수를 입력받아 1부터 입력받은 수 까지의 홀수 합을 반환하는 메서드
	public static int oddsum(int su1) { //매개변수가 1개만 있으면 된다.
		int sum = 0;
		for(int i = 1; i <= su1 ; i++) { // 헷갈
			if(i % 2 == 1) {
				sum += i;
			}
		}
		return sum; //for문 끝나고 넣어야 함.
	}
	
	// 5. 다음과 같이 두 수의 합을 반환하는 메서드 만들기(오버로딩)
		/* 정수(int)2개 더한 값
		 * 실수(float) 2개 더한 값
		 * 정수와 실수 2개 더한 값
		 * 실수와 정수 2개 더한 값
		 */
	public static int ifsum(int su1, int su2) {
		return su1 + su2;		
	}
	public static float ifsum(float su1,float su2) {
		return su1 + su2;
	}
	public static float ifsum(int su1, float su2) {
		return su1 + su2;
	}
	public static float ifsum(float su1, int su2) {
		return su1 + su2;
	}
	
	//6. 인자로 N을 전달하면 N에 대한 절대값을 반환하는 함수
	public static int absnum(int n) { //음수를 양수로 바꿔주는 메서드 
		return n < 0 ? -n : n; //삼항연산자 조건항?참이면1 :거짓이면2
	}
	public static float absnum(float n) {
		return n <0 ? -n : n;
	}
	
	//7. cm값을 inch값으로 반환하는 함수(1Inch == 2.54cm)
	public static double convertInch(double cm) {
		double inch = cm / 2.54; //2.54를 나눠야 inch 값을 구할 수 있다.
		return inch;
	}
	
	//8. 파일의 용량(byte)을 매개변수로 입력받아 bit 단위로 반환하는 함수
	// 파일의 용량을 입력할 때 단위도 입력한다(G, M, K)
	// switch함수 사용, 정수값변수n, 문자형 b 변수
	// 1byte = = 8bit, 1kb = 1024byte = 8 * 1024bit
	public static double byteTobit(int n, char b) {
		double size= 0;
		switch(b) {
		case 'K' :
			size = 1024L * 8;
			break;
		case 'M' :
			size = 1024L * 1024L * 8;
			break;
		case 'G' :
			size = 1024L *1024L * 1024L * 8;
			break;
		}
		return n * size; // 매개변수 n * size.
	}

}
