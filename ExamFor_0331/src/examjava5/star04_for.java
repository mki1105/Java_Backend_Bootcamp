package examjava5;

public class star04_for {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) { //i�� 5�� �ݺ��϶� �ٹݺ�
			for(int j=0; j<5 ;j++) { // ���ڹݺ����� for���� �����ϴ� ���߿��� ���� i �������� ������ ���� �ʴ´�.
			System.out.print(i+1); 
		}
			System.out.println();
		}
		
		System.out.println();
		
		int start = 1; //���� ���� �������൵ �ȴ�.
		for(int i=0; i<5; i++) {
			for(int j=0 ; j<5 ; j++) {
			System.out.print(start);
		}
			start++;
			System.out.println();
	}
		
		
		
}
}
