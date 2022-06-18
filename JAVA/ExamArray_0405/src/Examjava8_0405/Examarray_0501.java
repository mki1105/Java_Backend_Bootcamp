package Examjava8_0405;
//주민등록번호 검증하기 다시 연습하기
import java.util.Scanner;
public class Examarray_0501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수 배열 생성하기
		// 주민등록번호 자리에 곱할 배열 하나, 주민등록번호 입력할 배열 자리 하나
		int [] checknum = new int[] {2,3,4,5,6,7,8,9,2,3,4,5};
		String num; //문자열 번호 생성, 주민등록 번호 13자리 입력할거임.
		int sum = 0;
		// 주민번호 입력해라!
		System.out.println("주민등록번호를 -없이 입력하세요.");
		//입력 받아야지
		num = scan.nextLine();
		// 2. 배열 자리 저장할 공간 반복문으로 만들기
		for(int i = 0; i< checknum.length; i++) {
			// String문자열에서 하나의 문자만 꺼내오고 싶을 때 charAt라는 메소드 사용
			sum = sum + checknum[i] * Character.getNumericValue(num.charAt(i));
		}	
		// sum 변수도 필요, result 변수도 필요, 나머지 변수도 필요
		// 자리마다 곱한걸 총합에서 11로 나눈 나머지가 한 자로 맨 뒤랑 똑같아야 함
		// 3. 주민 검증하기
		int na; // 나머지 변수 안할거면 result = 11-(sum%11)로!
		int result; // 11에서 나머지를 뺀 값
		na = sum % 11;
		result = 11 - na;
		
		if(result == 10) {
			result = 0;
		}if(result == 11) {
			result = 1;
		}
		// 4. 출력하기 //result= 나머지 값이 마지막 12번 자리와 동일하면!
			if( result == Character.getNumericValue(num.charAt(12))) {
				System.out.println("검증된 주민등록번호 입니다.");
			}	else {
				System.out.println("잘못된 주민등록번호 입니다.");
		}
	}
}

