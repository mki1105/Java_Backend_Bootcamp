package examspring08_01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// 컨트롤러로 지정
@Controller
public class HelloController {
	// 메서드가 처리할 요청 경로를 지정, 이 경우 /hello 경로
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("/hello요청처리");
		return "index";
		// 컨트롤러의 처리결과를 보여줄 뷰 이름으로 "index"를 사용
	}
	@RequestMapping(value = "/add")
	public String addForm()	{
		return "add";
	}
	
//	@RequestMapping(value="/addproc")
//	public String addProc(HttpServletRequest req) {
//		int n1 = Integer.parseInt(req.getParameter("n1"));
//		int n2 = Integer.parseInt(req.getParameter("n2"));
//		int result = n1 + n2;
//		System.out.println("result:" + result);
//		req.setAttribute("result", result);
//		return "addResult";
//	}
	
//	@RequestMapping(value="/addproc")
	// name 요청 파라미터 값을 name 파라미터에 전달
//	public String addProc(@RequestParam(name = "n1")int nn1, int n2, Model model) {
//		int result = nn1 + n2;
//		System.out.println("result:" + result);
//		model.addAttribute("result", result);
//		return "addResult";
//	}
	
//	@RequestMapping(value="/addproc")
//	public String addProc(CommandObject cmd, Model model) {
//		int result = cmd.getN1() + cmd.getN2();
//		System.out.println("result:" + result);
//		model.addAttribute("result", result);
//		return "addResult";
//	}
	
	@RequestMapping(value="/addproc")
	@ResponseBody
	public String addProc(CommandObject cmd, Model model) {
		int result = cmd.getN1() + cmd.getN2();
		System.out.println("result:" + result);
		return String.valueOf(result);
	}

}