package examjava5;

public class star16_for {

	public static void main(String[] args) {
		boolean flag = true; //flag기법
		int line = 5; // 줄의 시작
		int star = 1;
		int space = line /2; // 
		
		for(int i =0; i < line ; i++) {
			for(int j=0; j < space; j++)
				System.out.println(" ");
			for(int j=0; j < star ; j++) {
				System.out.println("*");
				System.out.println();
				if(i== line/2)
				flag =!flag;
				if(flag) {
					star +=2;
					space--;					
				} else {
					star -=2;
					space++;
				}
			}
		}
		
	}		
	
	}
	
