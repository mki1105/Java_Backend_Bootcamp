package aop08;

import org.aspectj.lang.JoinPoint;
// 정상적으로 돌아갈 떄 xml 설정으로
public class AfterReturningAspect {
	
	public void afterReturning(JoinPoint jp) { // 
		String computer = jp.getTarget().getClass().getSimpleName();
		System.out.println(computer + "작업 종료");
	}
}
