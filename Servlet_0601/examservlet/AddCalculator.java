public class AddCalculator implements Calculator {

	@Override
	public String calculate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 변수설정 더할 값 2개, String이니까 int로 자료형 변환
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		// 덧셈을 받을 값 result, operation 변수설정
		int result = n1 + n2;
		String operation = "덧셈";
		// setAttiribute로 ${} 사용할 때 값 그대로 가져갈 것.
		req.setAttribute("operation", operation);
		// req.setAttribute("result", n1 + n2) 이렇게 작성해도 됨.
		req.setAttribute("result", result);
		return "result";
	}
}
////get이 기본으로 작동하니 경로설정 잘 확인.
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.getRequestDispatcher("/addform.jsp").forward(req, resp);
//	}
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// 변수설정 더할 값 2개, String이니까 int로 자료형 변환
//		int n1 = Integer.parseInt(req.getParameter("n1")) ;
//		int n2 = Integer.parseInt(req.getParameter("n2")) ;
//		// 덧셈을 받을 값 result, operation 변수설정
//		int result = n1 + n2;
//		String operation = "덧셈";
//		// setAttiribute로 ${} 사용할 때 값 그대로 가져갈 것.
//		req.setAttribute("operation", operation);
//		// req.setAttribute("result", n1 + n2) 이렇게 작성해도 됨.
//		req.setAttribute("result", result);
//		// 위 2개 값 가지고 result로 감 - 화면에 보여주기 위해 요청
//		req.getRequestDispatcher("/result.jsp").forward(req, resp);
//	}