package aop11;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class FinishAspect {
	@After("execution(public int aop11.*.usingComputer(String))")
	public void shutdown(JoinPoint jp) {
		String com = jp.getTarget().getClass().getSimpleName();
		System.out.println(com + "컴퓨터 종료");
	}

}
