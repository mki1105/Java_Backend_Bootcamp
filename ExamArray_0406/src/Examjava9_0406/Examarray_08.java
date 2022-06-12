package Examjava9_0406;
 // 무한 배열 만들기(정수저장하여 배열 늘리기)
import java.util.Scanner;
public class Examarray_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 배열, 변수 설정( 필요할 떄마다 변수는 계속 설정해주자)
		int index = 0;//값을 입력할 인덱스를 변수로선언. 입력될 배열의 자리!!
		int defaultsize = 3;// 현재 기본 길이
		int size = 3; //늘어나는 길이
		// size를 배열에 저장시키자
		int[] arr = new int[size];// 띄어쓰기 조심
		
		// 2. 저장할 반복문 // 현재길이 입력 받아서 늘려가야 할 조건문
		while(true) {
			System.out.printf("입력(현재길이 %d) :" , size); //출력을 했으면 입력을 받아야지
			int num = scan.nextInt(); // 입력길이 입력받고
			if(num == -1)  //-1로 입력하면 멈춤
				break;
			 arr[index++] = num; // num을 arr에 저장시키자
		// 3. 무한배열 조건문
			if(size == index) { //인덱스와 사이즈의 길이가 같으면
				size += defaultsize; //사이즈에 현재기본길이를 추가해서 더해줘라 
				int[] tmp = arr; // 새로운 tmp 변수 생성해서 arr값 저장, arr가 3이니까
				arr = new int[size]; // arr에 size배열을 저장 size는 6으로 늘어남
				for(int i = 0; i < tmp.length; i++) {//tmp길이까지
					arr[i] = tmp[i]; // tmp배열 자리를 arr 배열에 저장시켜라
				}
				System.out.println("증가됨" + "(" + arr.length +")"); //size를 써도 됨.arr 배열이 증가됨.
			}// if문 종료
			
			printArray(arr);
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + ",");
//			}			
			System.out.println();
		}
	}		
	public static void printArray(int[] array) { //array라는 변수는 int형 배열로 받을 것.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
/* size와 인덱스가 같아진다는 것은 꽉 찼다는 뜻.
 * 인덱스 ++ 뜻 다시 물어보기
 * 사이즈를 디폴트 사이즈만큼 증가시킨다.
 * tmp라는 배열 참조변수에 담는다.
 * 새로운 배열 객체를 사이즈로 만들고 
 * 새로 만들어진 집에 tmp를 옮기는 작업을 함
 * 꽉차면 늘어난다는 것을 반복
 * tmp는 if문에서 선언된 변수로 if문을 벗어나면 tmp는 없다고 봐라
 * 없어졌으니 처음에 만들어진 원본 배열이 참조하는 값이 0 메모리에서 사라짐
 * 늘어나는 것처럼 만들자, 배열은 객체다.
 * 
 */


