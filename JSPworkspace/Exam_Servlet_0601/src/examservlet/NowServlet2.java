package examservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet2 extends HttpServlet{ //
	//서블릿이란 클라이언트의 요청을 처리하는 클래스임.
	//do get, post는 요청을 구분해주는 것.
	@Override
	public void init() throws ServletException {
		System.out.println("서블릿 초기화");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("now", new Date());
		
		RequestDispatcher dispatcher =
		req.getRequestDispatcher("/now.jsp");
			dispatcher.forward(req, resp);	
	}
}
