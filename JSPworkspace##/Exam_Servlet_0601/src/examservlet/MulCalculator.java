package examservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MulCalculator extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/mulform.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 변수설정 더할 값 2개, String이니까 int로 자료형 변환
		int n1 = Integer.parseInt(req.getParameter("n1")) ;
		int n2 = Integer.parseInt(req.getParameter("n2")) ;
		// 덧셈을 받을 값 result, operation 변수설정
		int result = n1 * n2;
		String operation = "곱셈";
		// setAttiribute로 ${} 사용할 때 값 그대로 가져갈 것.
		//req.setAttribute("result", n1 + n2)
		req.setAttribute("operation", operation);
		req.setAttribute("result", result);
		// 위 2개 값 가지고 result로 감
		req.getRequestDispatcher("/result.jsp").forward(req, resp);
	}
}
