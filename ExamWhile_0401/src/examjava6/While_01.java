package examjava6;
// while : 상태에 따른 반복
public class While_01 {

	public static void main(String[] args) {
		int i=0;
		for(;i<5;) {
			System.out.println(i);
			i++;
		}	
		int j=0;
		while(j < 5) { //조건이 거짓일때까지 무한반복
			System.out.println(j);
			j++;
		}
	}

}
