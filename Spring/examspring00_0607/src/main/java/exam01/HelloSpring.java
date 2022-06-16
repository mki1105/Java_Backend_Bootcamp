package exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
	// Hello hello = new Hello();
	// hello.setName("홍길동")
	ApplicationContext ctx =  new ClassPathXmlApplicationContext("appContext.xml");
	// get으로 호출	
	Hello hello = ctx.getBean("hello", Hello.class);
	Hello hello2 = ctx.getBean("hello", Hello.class);
	System.out.println(hello.greet());
	
	
	}

}
