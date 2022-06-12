package Examjava9_0406;
import java.util.Scanner;
public class Examarray_09 {

	public static void main(String[] args) {
		// 무한배열 스트링으로 중복값
		Scanner scan = new Scanner(System.in);
		//1. 배열이나 변수 생성하기
		int index = 0, defaultsize =3, size =3; //값을 입력할 인덱스를 변수로선언. 입력될 배열의 자리!!
		String str; //스트링 변수 생성
		String[] arr = new String[size]; //사이즈를 arr라는 스트링 배열에 저장할 예정
		boolean flag; // 논리 참 거짓 변수
		
		System.out.println("입력을 종료하려면 '종료'를 입력하세요.");
		
		//2. 반복 조건문 작성하고 입력받고, 저장하기
		while(true) {
			System.out.printf("입력(현재길이 : %d) :", arr.length); //size라고 입력해도 됨.
			str = scan.nextLine(); //문자열 입력받기
			//종료라고 적으면 종료할 수 있게 입력받기
			if(str.equals("종료")) {
				System.out.println("입력을 종료합니다.");
				break;
			}//if문 종료
			// 중복확인하기
			flag = true; // 전부 참이다.
			for(int i=0; i < index ;i++) { //index까지 
				if(arr[i].equals(str)) {
					System.out.println("중복!");
					flag = false; //중복일 경우 true를 false로 변경해라
				}
			}//for문 종료
			// 3. 무한배열 조건식 // 중복이 아니면 배열이 추가하는 조건식
			if(flag) { //for문은 끝났지만 중복일 경우 false기 때문에 while문에서 true? 한번 물어보깅
				arr[index++] = str; // 배열에 저장하는건  계속 신경쓰기! arr 배열 자리에 str스트링문자 저장
				for(int i =0; i < index; i++) {
					System.out.print(arr[i] + ","); //
				}
				System.out.println();
			}						
			if(size == index) {// 현재 사이즈가 인덱스와 같다면 늘려주자
				size += defaultsize;
				String[] tmp = arr;// tmp에 옮기고 배열에 저장까지 해주기
				arr = new String[size];
				//arr에는 길이만큼을 넣어줘라
				for(int i =0; i< tmp.length; i++) {
					arr[i] = tmp[i];
				}
				System.out.println("증가됨(" + arr.length + ")");
			} /* if(size == index) {// 현재 사이즈가 인덱스와 같다면 늘려주자
			  * size += defaultsize;
			  * arr = Arrays.copyOf(arr.size);
			  * System.out.println("증가됨(" + size + ")");
			  */
		}
	}
}
