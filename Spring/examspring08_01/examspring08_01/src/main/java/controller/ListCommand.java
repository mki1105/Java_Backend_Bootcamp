package controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
// 회원가입한 일시를 기준으로 회원 검색을 할 수 있도록 시작기준, 끝 기준을 전달
// Data를 사용하여 커맨드 클래스를 구현
/* @DateTimeFormat
 * 일반적으로 스프링은 long, int에 대한 변환은 기본적으로 처리할 수 있지만
 * data 타입으로 변환은 자동으로 되지 않아서 추가적인 설정이 필요함.
 */
public class ListCommand {
	@DateTimeFormat(pattern="yyyyMMddHH")
	private Date from;
	@DateTimeFormat(pattern="yyyyMMddHH")
	private Date to;

	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	
}