package Examjava9_0406;
 import java.util.Scanner;
public class Examarray_0803 {
	//정수 무한배열 만들기
	/* 배열을 출력하기 위해서는 반복문을 사용하거나, 배열을
	 * 출력할 수 있는 메서드를 활용해야 한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. 배열이나 변수 생성하기
		int index = 0; //배열 자리에 들어가는 값
		int defaultsize = 3; //기본 현재 길이3
		int size = 3; // 늘어나서 가지고 있는 길이 3(3씩 늘어날 예정)
		//배열에 변수 넣어주기
		int[] arr = new int[size]; //정수형 배열에 size배열을 저장 
		//2. 반복 조건문 작성하고 입력받고, 저장하기
		System.out.println("입력을 종료하려면 -1을 입력하세요.");
		while(true) {
			System.out.printf("입력(현재길이 : %d) :", arr.length);
			int num = scan.nextInt(); //정수 입력받기
			if(num == -1) break;
			// 배열에 저장하는건  계속 신경쓰기! arr에 입력받은 num을 저장시키기
			arr[index++] = num; // index 한칸씩 늘리며 저장
			// 3. 무한배열 조건식
			if(size == index) {// 현재 사이즈가 인덱스와 같다면 늘려주자
				size += defaultsize;
				int[] tmp = arr; //tmp에 옮기고 배열에 저장까지 해주기
				arr = new int[size];
				//arr에는 길이만큼을 넣어줘라
				for(int i =0; i< tmp.length; i++) {
					arr[i] = tmp[i];
				}
				System.out.println("증가됨(" + arr.length + ")");
			}//if문 종료
			//4. 출력문 작성하기
			for(int i = 0; i <arr.length; i++) { //arr사이즈만큼 arr자리를 출력해라.
				System.out.print(arr[i] + ","); 
			}
			System.out.println();
		}
	}
}
