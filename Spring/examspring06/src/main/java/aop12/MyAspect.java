package aop12;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class MyAspect {
	@Before("execution(public int aop12.*.usingComputer(String))")
	public void bootingAndLogin(JoinPoint jp) {
		String pwd = (String)jp.getArgs()[0]; //배열을 가지고 오면 오브젝트 배열로 참조가 가능
		System.out.println("컴퓨터 부팅 " + pwd + "입력 로그인");
	}
}
