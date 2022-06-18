package Quiz01;

public class Child extends Parent{
	@Override
	void methodParentA() {
		System.out.println("ParentA-B");
	}
	void methodChild() {
		super.methodParentA();
		this.methodParentA();
	}

}
