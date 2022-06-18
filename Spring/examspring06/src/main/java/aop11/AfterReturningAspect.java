package aop11;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class AfterReturningAspect {
	@AfterReturning("execution(public int aop11.*.usingComputer(String))")
	public void afterReturning(JoinPoint jp) { // 
		String computer = jp.getTarget().getClass().getSimpleName();
		System.out.println(computer + "작업 종료");
	}
}
