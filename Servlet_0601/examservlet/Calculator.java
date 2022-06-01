import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 계산할 떄 요청과 응답을 포함하여 준비한다.

public interface Calculator {
	public String calculate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;

}

