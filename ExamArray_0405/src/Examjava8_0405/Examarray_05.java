package Examjava8_0405;
//�ֹε�Ϲ�ȣ �����ϱ�
import java.util.Scanner;
public class Examarray_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. ��������, �迭 �����ϱ�  //13�ڸ� ������ �迭 �����ϱ�(�ֹε�Ϲ�ȣ - ����)
		int[] checknum = {2,3,4,5,6,7,8,9,2,3,4,5}; //12�� �ڸ������� ������ �迭
		String num; //�Է��� �ֹι�ȣ �迭 ����
	 	// string num;
		// int [] checknum = new checknum [12]; �̷��� �ϸ� �ȵǳ�?		
		
		// 2. �ֹε�Ϲ�ȣ �Է¹ޱ�
		 System.out.println("�ֹε�Ϲ�ȣ�� -���� �Է��ϼ���.");
		 num = scan.nextLine(); // �ֹι�ȣ �Է¹ޱ� // num�� �迭�� �����ؼ� ���� �ȵȴ�?
		
		 // 3. �ֹε�� �����ϱ�(�ʿ��� ������? sum)
		 int sum =0; // ���������� �ڸ������� ���ϰ� ���ϱ� ���ؼ� �ʿ�
		 for(int i = 0; i < checknum.length; i++) { // �ڸ�����ŭ �ݺ����� �����ؾ� �Ѵ�. 
			 // char a = num.charAt(i);
			 // checknum�� num�� �ڸ����� ���ʴ�� ���Ѵ�?
			 sum = sum + checknum[i] * Character.getNumericValue(num.charAt(i));
			 // ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѱ� sum�� ���� // charAt�� ��� ���?
		 }
		// sum�� 11�� ������ �������� ������ ������ �����
		 int na = (sum % 11);     //sum%11�� �������� ������ ����ϱ�
		 int result = (11 - na); //11- ������ = x �� ���ڸ��� ������ ��ȿ�� �ֹι�ȣ�̴�.	
		 
		 if(result == 10) {
			 result = 0;		
		 }if(result == 11) {
			 result = 1;
		 }
		 // 4. ����ϱ�
		 if(result == Character.getNumericValue(num.charAt(12))) {
			 // �Է��� �ֹι�ȣ�� result�� ���ٸ�. 13�� �ƴ϶� 12�� üũ 
			 System.out.println("�������� �ֹι�ȣ �Դϴ�.");
		 }else {
			 System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		 }
	}
}
