package examjava1;

import java.util.Scanner;
// 자료형은 3가지, 필요한 타입에 맞춰서 변수를 정의하고 있다. 메모리에 저장한다는 개념으로 저장할 공간을 만들어라.
// 자료형 + 이름 ; - 변수선언(값이 없을 경우에는 쓰레기 값)
// 자료형 + 이름 = 값; - 변수의 초기화(변수선언할 때 최초의 값을 세팅하는 것, 대입하는 것) 
// 논리형 Boolean (true/false)
// 정수형 byte(1) short(2) char(2)->unsigned int(4)->기본정수자료형 long(8)
// 실수형 float(4) double(8)->자바의 기본 실수형
// 클래스(언어의 특성에 따라서)
public class Exam03 {
	public static void main(String[] args){
		
		Scanner keyboard =new Scanner(System.in);
		
		System.out.print("이름 :");
		String name = keyboard.next();
		
		System.out.print("나이 :");
		int age = keyboard.nextInt(); //Integer.parseInt(key.nextLine());
		--age;
		
		System.out.print("키 :");
		float height = keyboard.nextFloat();//Float.parseFloat(key.nextLine());
		
		System.out.print("뭄무게 :");
		float weight =keyboard.nextFloat(); //double도 가능,Double.parseFloat(key.nextLine());
		
		System.out.print("최고학점 :");
		float grade =keyboard.nextFloat();//char 사용 .charAt(0);
		
		System.out.println();
		System.out.println("이름은 " + name + "입니다." + "\n" + "나이는 " +age + "세입니다." + "\n" +
				"키는 " + height + "cm입니다." + "\n" + "몸무게는 " + weight + "kg입니다." + "\n" +
				"최고학점은 " +grade+ "입니다.");
			
	}

}
