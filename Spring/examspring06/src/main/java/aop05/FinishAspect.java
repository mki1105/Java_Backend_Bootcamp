package aop05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class FinishAspect {
	@After("execution(public int aop05.*.usingComputer(String))")
	public void shutdown(JoinPoint jp) {
		// 누구의 컴퓨터가 종료되었는지 이름까지 출력하기
		String com = jp.getTarget().getClass().getSimpleName();
		System.out.println(com + "컴퓨터 종료");
	}

}
