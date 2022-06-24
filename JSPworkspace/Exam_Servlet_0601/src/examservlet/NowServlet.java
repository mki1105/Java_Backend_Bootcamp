package examservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet{ //
	//서블릿이란 클라이언트의 요청을 처리하는 클래스임.
	//do get, post는 요청을 구분해주는 것.
	@Override
	public void init() throws ServletException {
		System.out.println("서블릿 초기화");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//요청, 응답 매개변수
		req.setAttribute("now", new Date());
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head><title>now</title></head>");
		pw.println("<body>");
		pw.print("Now date is");
		pw.println(new Date());
		pw.println("</body></html>");
		pw.flush();
	}
}
