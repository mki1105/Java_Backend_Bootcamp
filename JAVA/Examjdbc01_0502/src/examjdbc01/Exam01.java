package examjdbc01;

public class Exam01 {
	public static void main(String[]args) {
		try {
			//����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

