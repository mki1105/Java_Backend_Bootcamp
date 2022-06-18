package aop04;

import org.aspectj.lang.JoinPoint;

// 공통 기능을 만들고 시점을 만들어서 끼워넣기
public class FinishAspect {
	public void shutdown(JoinPoint jp) {
		// 누구의 컴퓨터가 종료되었는지 이름까지 출력하기
		String com = jp.getTarget().getClass().getSimpleName();
		System.out.println(com + "컴퓨터 종료");
	}
}
