package survey;

import java.util.List;
// 설문 항목에 대한 답변과 응답자의 정보를 모두 담기 위해 사용
// List 형식을 사용, 스프링 mvc는 이런 List타입의 객체에 접근하여
// 사용할 때 배열형식으로 사용할 수 있음.
// 커맨드 객체로 사용하는 클래스!!

public class AnsweredData {
	private List<String> responses;
	private Respondent res;
	
	public List<String> getResponses() {
		return responses;
	}
	public void setResponses(List<String> responses) {
		this.responses = responses;
	}
	public Respondent getRes() {
		return res;
	}
	public void setRes(Respondent res) {
		this.res = res;
	}
	
	
}
