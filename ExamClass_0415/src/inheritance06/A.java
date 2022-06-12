package inheritance06;

public class A {
	int n;
	A(){ System.out.println("A()"); }
	A(int n){ this.n = n; System.out.println("A(int)"); }
	
	void methodA() { 
		System.out.println("methodA()"); 
	}
	void methodAA() { 
		System.out.println("methodAA()"); 
	}
}
