package aop03;
// pojoxml로 설정하는 방법 03
// POJO - Plain old java object -> 순수한 자바 객체(dto 같은 일반적인 객체)
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyAspect {
	public void bootingAndLogin(JoinPoint jp) {
		String pwd = (String)jp.getArgs()[0];
		System.out.println("컴퓨터 부팅 " + pwd + "입력 로그인");
	}
}
