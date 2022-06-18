package aop05;
// after 어노테이션으로 설정하기
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class MyAspect {
	@Before("execution(public int aop05.*.usingComputer(String))")
	public void bootingAndLogin(JoinPoint jp) {
		String pwd = (String)jp.getArgs()[0];
		System.out.println("컴퓨터 부팅 " + pwd + "입력 로그인");
	}
}
