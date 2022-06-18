package spring;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring.Client;

public class Main {
	public static void main(String[] args) {
		//스프링 컨테이너 생성
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:springConf.xml");
		Client client = ctx.getBean("client", Client.class);
		client.send();
		ctx.close();

	}

}
