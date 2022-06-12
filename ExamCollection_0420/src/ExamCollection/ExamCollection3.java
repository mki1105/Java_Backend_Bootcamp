package ExamCollection;

//class MyInteger{
//	Integer a;
//	void me(Integer a) {
//		System.out.println(a);
//	}
//}
//class MyDouble{
//	Double a;
//	void me(Double a) {
//		System.out.println(a);
//	}
//}

class MyData<E>{
	E a;
	void me(E a) {
		System.out.println(a);
	}
}

public class ExamCollection3 {
	public static void main(String[] args) {
		MyData<Integer> a = new MyData<>();
		a.a = 10;
		MyData<Double> b = new MyData<>();
		b.a = 3.14;
	}
}


