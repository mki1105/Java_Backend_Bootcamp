package examjava4_for;

public class for_05 {
 // 1���� 100������ �� �� 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� ���� ���Ͽ� ���
	public static void main(String[] args) {
	
		int sum =0;
		for(int i=1; i<100; i++) {
			if(i%3==0 || i%5==0) { //����?
				sum +=i;
			}
		}
		System.out.println(sum);
	}

}
