package Examjava9_0406;
// 8번 무한배열 강사님 코드 풀이
import java.util.Arrays;
import java.util.Scanner;
public class Examarray_0801 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 1. 변수선언
		int index = 0; // 칸 안의 값 0으로 초기화 선언
		int defaultSize = 3; // 현재길이(기본 사이즈 =3)
		int size = defaultSize; // 사이즈와 기본사이즈 동일
		int[] arr = new int[size]; // arr라는 배열에 size 배열 저장
		//2. 반복 조건문 만들기
		while(true) { // 참인 동안 계속 반복
			System.out.printf("입력(현재길이:%d):", size); //현재길이 출력 
			int n = in.nextInt(); // n이라는 정수형 변수 입력받기
			if(n == -1) break; // -1을 입력하면 멈춤
			arr[index++] = n; // n을 arr배열 index한칸씩 늘려주면서 저장하기
			// 저장시키고 나서 index 후치증가?
			if(size == index) { // 현재 사이즈와 인덱스 길이가 같아지면 꽉 찼다는 뜻.
				// size = size + defaultsize, 사이즈에  원래 기본사이즈 추가.
				size += defaultSize;
				int[] tmp = arr; // tmp라는 새로운 배열 참조변수에 arr를 담아라.
				arr = new int[size]; //arr에 또 다른 새로운 size배열을 저장?
				//i는? tmp 새로운 배열 길이 보다작은만큼 반복 
				for(int i = 0; i < tmp.length; i++) { //tmp 배열 길이는 3
					arr[i] = tmp[i]; // tmp의 배열을 arr의 배열에 저장시키기.
				}
				System.out.println("증가됨("+arr.length+")"); //arr배열 길이만큼 증가 됨.
			}// if문 종료, tmp는 if문에 선언된 변수니까 if문을 벗어나면 없어짐.
			printArray(arr); //int형 배열 printArray 메서드출력? 정확한 뜻 물어보기
			System.out.println();
		}
	}
	public static void printArray(int[] array) { //array출력
		for(int i = 0; i < array.length; i++) { //array배열 길이보다 적은만큼 출력하기
			System.out.print(array[i] + ",");
		}
	}

}
