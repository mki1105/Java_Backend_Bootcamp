package examjava2;

public class operator1 {

	public static void main(String[] args) {
		int a = 5, b = 6, c=10, d = 0;
		boolean bo = false;
		d = ++a *b--;
		// a먼저 전치증감시키고, * 연산한 다음에 b -1 해주기
		//6*6 이니까 d는 36, b는 1 감소해서 5 (a=6 b=5 c=10 d=36)
		
		System.out.printf("a= %d, b=%d, d=%d/n" + a,b,d);
		d = a++ + ++c - b--;
		// c먼저 전치증감시키고, + - 연산한 다음에 a는 +1 b는 -1 해주기
		//(a=7 b=4 c=11 d=12)
		
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n" + a,b,c,d);
		a =1; //변수는 값이 바뀌니까 (a=1 b=0 c=11 d=12)
		b =0;
		bo = a++ > 0 || 1 < ++b * d-- / ++c;			
	    System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
	    // || 논리연산자 or, 둘중 하나만 참이면 1, 앞에 연산이 참이기 때문에 뒤에는 실행 안됨.
	    // a만 1 증가시키기 (a=2 b=0 c=11 d=12)
	    	    
	    bo = b++ > 0 && 1 < ++a / ++c * d++;
	    System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
	    // && 논리연산자 and, 둘다 참이면 참 1, 앞에 연산이 거짓이기 때문에 뒤에는 실행 안됨.
	    // 거짓이라도 연산 후 증감해줘야 하기 때문에 b만 1 증가! (a=2 b=1 c=11 d=12)
	}

}
