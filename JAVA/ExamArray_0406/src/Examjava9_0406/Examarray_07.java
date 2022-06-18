package Examjava9_0406;
import java.util.Arrays;
import java.util.Scanner;
// 입력받은 배열의 값을 정렬하여 출력하기
public class Examarray_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 배열, 변수 생성하기
		// 정수형 배열 생성하기 size로
		System.out.println("생성할 배열의 길이를 입력하세요.");
		int size = scan.nextInt(); //size로 배열 길이 입력받기
		int[] num = new int[size];//생성할 배열 길이 size(초기화)
	
		// 정수형 입력받기
		System.out.printf("%d의 배열이 생성되었습니다.", num.length); //size로 해도 되지만 length로 하는게 좋음.
		System.out.println();
		
		// 2. 생성할 배열만큼 입력받기
		for(int i = 0; i < num.length; i++) { //배열의 길이보다 작을만큼 반복, 무조건 0부터!
			System.out.printf("%d번째 값 : ", i+1);
			int num2 = scan.nextInt(); // num2는 입력하는 정수 값.
			num[i] = num2; // 입력한 정수 num2를 num배열에 저장시키기
		}
		// 3. 원본 배열 입력된 값 출력해
		System.out.print("배열에 입력된 값은? ");
		// for문이 결국 똑같아서 복사해도 됨.
		for(int i =0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}		
		System.out.println();
		
		// 4. 정렬조건문-버블정렬
		for(int i =0; i < num.length-1 ;i++) { // 뒤 자리와 앞자리를 비교하기 위해 -1을 함.
			for(int j =0; j < num.length-1 ; j++) {
				if(num[j] > num[j+1]) { //뒷자리가 크면 그 뒷자리와 바꿔야 함.
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;					
				}
			}
		}
		// 5. 출력하기
		Arrays.sort(num); //원본 배열이 정렬됨.
		System.out.printf("정렬 후 값은? ");
		for(int i =0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
}
