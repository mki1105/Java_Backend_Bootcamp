package inheritance08;

public class 도형들 {
	int n;
	도형들(){ System.out.println("A()"); }
	도형들(int n){ this.n = n; System.out.println("A(int)"); }
	void methodA() { System.out.println("methodA()"); }
}
