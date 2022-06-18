package aop07;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
//pojo
public class FinishAspect {
	//포인트 컷을 지정할 때 공통 포인트 컷으로 지정을 해주자
	public void shutdown(JoinPoint jp) {
		// 누구의 컴퓨터가 종료되었는지 이름까지 출력하기
		String com = jp.getTarget().getClass().getSimpleName();
		System.out.println(com + "컴퓨터 종료");
	}
}
