package survey;

import java.util.Collections;
import java.util.List;
// 컨트롤러에서 설문항목을 생성하고 뷰에 전달하여 보여질 수 있게
// 개별 설문항목 데이터들을 담기 위한 클래스
// 질문제목(title)과 답변옵션(options)을 저장
// 주관식 항목일 경우에는 답변 옵션이 (emptyList)객체를 생성하도록 함.
public class Question {
		private String title;
		private List<String> options;
		
		
		public Question(String title) {
			this(title, Collections.<String>emptyList());
		}
		
		public Question(String title, List<String> options) {
			super();
			this.title = title;
			this.options = options;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		
		public boolean isChoice() {
			return options != null && !options.isEmpty();
		}
		
		
}
