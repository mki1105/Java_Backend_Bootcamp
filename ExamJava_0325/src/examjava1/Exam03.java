package examjava1;

import java.util.Scanner;
// �ڷ����� 3����, �ʿ��� Ÿ�Կ� ���缭 ������ �����ϰ� �ִ�. �޸𸮿� �����Ѵٴ� �������� ������ ������ ������.
// �ڷ��� + �̸� ; - ��������(���� ���� ��쿡�� ������ ��)
// �ڷ��� + �̸� = ��; - ������ �ʱ�ȭ(���������� �� ������ ���� �����ϴ� ��, �����ϴ� ��) 
// ���� Boolean (true/false)
// ������ byte(1) short(2) char(2)->unsigned int(4)->�⺻�����ڷ��� long(8)
// �Ǽ��� float(4) double(8)->�ڹ��� �⺻ �Ǽ���
// Ŭ����(����� Ư���� ����)
public class Exam03 {
	public static void main(String[] args){
		
		Scanner keyboard =new Scanner(System.in);
		
		System.out.print("�̸� :");
		String name = keyboard.next();
		
		System.out.print("���� :");
		int age = keyboard.nextInt(); //Integer.parseInt(key.nextLine());
		--age;
		
		System.out.print("Ű :");
		float height = keyboard.nextFloat();//Float.parseFloat(key.nextLine());
		
		System.out.print("������ :");
		float weight =keyboard.nextFloat(); //double�� ����,Double.parseFloat(key.nextLine());
		
		System.out.print("�ְ����� :");
		float grade =keyboard.nextFloat();//char ��� .charAt(0);
		
		System.out.println();
		System.out.println("�̸��� " + name + "�Դϴ�." + "\n" + "���̴� " +age + "���Դϴ�." + "\n" +
				"Ű�� " + height + "cm�Դϴ�." + "\n" + "�����Դ� " + weight + "kg�Դϴ�." + "\n" +
				"�ְ������� " +grade+ "�Դϴ�.");
			
	}

}
