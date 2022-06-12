package Examjava8_0405;
//주민등록번호 검증하기
import java.util.Scanner;
public class Examarray_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수설정, 배열 생성하기  //13자리 정수형 배열 생성하기(주민등록번호 - 빼고)
		int[] checknum = {2,3,4,5,6,7,8,9,2,3,4,5}; //12개 자릿수마다 곱해줄 배열
		String num; //입력할 주민번호 배열 생성
	 	// string num;
		// int [] checknum = new checknum [12]; 이렇게 하면 안되나?		
		
		// 2. 주민등록번호 입력받기
		 System.out.println("주민등록번호를 -없이 입력하세요.");
		 num = scan.nextLine(); // 주민번호 입력받기 // num을 배열로 생성해서 쓰면 안된다?
		
		 // 3. 주민등록 검증하기(필요한 변수는? sum)
		 int sum =0; // 최종적으로 자릿수마다 곱하고 더하기 위해서 필요
		 for(int i = 0; i < checknum.length; i++) { // 자리값만큼 반복시켜 저장해야 한다. 
			 // char a = num.charAt(i);
			 // checknum와 num의 자릿수를 차례대로 곱한다?
			 sum = sum + checknum[i] * Character.getNumericValue(num.charAt(i));
			 // 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한걸 sum에 대입 // charAt는 어떻게 사용?
		 }
		// sum을 11로 나누어 나머지를 저장할 변수를 만들기
		 int na = (sum % 11);     //sum%11로 나머지만 가지고 계산하기
		 int result = (11 - na); //11- 나머지 = x 가 뒷자리와 같으면 유효한 주민번호이다.	
		 
		 if(result == 10) {
			 result = 0;		
		 }if(result == 11) {
			 result = 1;
		 }
		 // 4. 출력하기
		 if(result == Character.getNumericValue(num.charAt(12))) {
			 // 입력한 주민번호가 result랑 같다면. 13이 아니라 12로 체크 
			 System.out.println("정상적인 주민번호 입니다.");
		 }else {
			 System.out.println("잘못된 주민번호 입니다.");
		 }
	}
}
