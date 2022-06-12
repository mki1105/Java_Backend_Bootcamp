package examjdbc01;

public class Exam01 {
	public static void main(String[]args) {
		try {
			//드라이버 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

