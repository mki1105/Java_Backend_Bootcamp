package inheritance03;

public class Exam01 {
	public static void main(String[] args) {
		A2 ob1 = new A2();
		ob1.n = 10; //A에 정의된 내용 사용가능
		ob1.methodA(); //A에 정의된 내용 사용가능
		ob1.methodA2();
	}

}
