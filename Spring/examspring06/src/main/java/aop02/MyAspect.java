package aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(public int aop02.*.usingComputer(String))")
	// 어떤 메서드를 자르고 들어갈지 시점을 정해줘라.
	// @before 핵심기능 호출되기 직전에 동작을 하는 메서드임.
	public void bootingAndLogin(JoinPoint jp) {
		String pwd = (String)jp.getArgs()[0];
		System.out.println("컴퓨터 부팅 " + pwd + "입력 로그인");
	}
}
