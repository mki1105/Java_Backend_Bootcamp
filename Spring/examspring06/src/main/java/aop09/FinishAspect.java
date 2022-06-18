package aop09;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

public class FinishAspect {
	public void shutdown(JoinPoint jp) {
		String com = jp.getTarget().getClass().getSimpleName();
		System.out.println(com + "컴퓨터 종료");
	}

}
