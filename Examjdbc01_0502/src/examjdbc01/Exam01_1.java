package examjdbc01;

public class Exam01_1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
