package aop13;
// 어라운드는 원하는 시점에 핵심기능을 호출하는 것을 말함.(proceed)
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class WorkingAspect {
	
	@Around ("execution(public int aop13.*.usingComputer(String))")
	public Object workingAdvice(ProceedingJoinPoint pjp) { // 조인 포인트와는 다르게 proceed라는 메서드가 들어있음.
		// Before
		String pwd = (String) pjp.getArgs()[0]; // 
		System.out.println("컴퓨터 부팅 및 " + pwd + "를 입력하여 로그인");

		String computer = null;
		Object result = null;
		try {
			result = pjp.proceed(pjp.getArgs()); // 핵심 기능 호출 지점! - usingComputer를 부르는 핵심기능 시점. 이 전에 하는건 전부 비포 
			// AfterReturning
			computer = pjp.getTarget().getClass().getSimpleName();
			System.out.println(computer + "작업 종료");
		} catch (Throwable e) {
			// AfterThrowing
			System.out.println(e.getMessage() + "문제로 AS 신청!");
		}
		// After - 핵심 기능이 끝나면 무조건 진행하는 것.
		computer = pjp.getTarget().getClass().getSimpleName();
		System.out.println(computer + "시스템 종료");

		return result;
	}
}
