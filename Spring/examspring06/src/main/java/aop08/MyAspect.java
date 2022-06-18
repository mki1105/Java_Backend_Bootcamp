package aop08;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyAspect {
	public void bootingAndLogin(JoinPoint jp) {
		String pwd = (String)jp.getArgs()[0]; //배열을 가지고 오면 오브젝트 배열로 참조가 가능
		System.out.println("컴퓨터 부팅 " + pwd + "입력 로그인");
	}
}
