package aop12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class AfterThrowingAspect {
	@AfterThrowing("execution(public int aop12.*.usingComputer(String))")
	public void afterThrowing(JoinPoint jp) {
		System.out.println("예외 발생! AS신청!");
	}
}
