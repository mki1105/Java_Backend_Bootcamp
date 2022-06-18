package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.AlreadyExistingMemberException;
import spring.MemberRegisterService;
import spring.RegisterRequest;

// 회원가입 시 약관을 보여주는 경로를 처리하기 위한 컨트롤러
// 스프링은 기본적으로 @RequestMapping에 지정된 경로와 일치하면 무조건 처리함.
@Controller
public class RegisterController {
	
// 클라이언트로부터 요청이 들어오는 url 경로가 "/register/step1" 라면
// handleStep 메서드가 처리하게 되고, 처리 후 view해줄 경로인
// 문자열 "/register/step1"을 반환함.
// 현재 컨트롤러의 설정은 get/post 모두 처리
// 아래 설정처럼 메서드 형식을 지정할 수 있음.
	@RequestMapping("/register/step1")
	public String handleStep1() {
		return "register/step1";
	}

	// 요청을 처리할 컨트롤러의 메서드에서 요청 파라미터를 사용하기 위한 방법
	// <첫 번째 방법> - HttpServletRequest를 직접 이용하여 getParameter 메서드를 호출하여 값 사용
//	@RequestMapping(value = "/register/step2", method=RequestMethod.POST)
//	public String handleStep2(HttpServletRequest request) {
//		String agreeParam = request.getParameter("agree");
//		if (agreeParam == null || !agreeParam.equals("true")) {
//			return "register/step1";
//		}
//		return "register/step2";
//	}

	// <두 번째 방법> - @RequestParam 어노테이션을 사용하는 방법.
	// 요청 파라미터 개수가 몇 개 안되는 경우 사용하면 유용
	@RequestMapping(value = "/register/step2", method=RequestMethod.POST)
	public String handleStep2(
			@RequestParam(value="agree", defaultValue = "false") Boolean agree, 
			Model model) {
		if (!agree) {
			return "register/step1";
		}
		model.addAttribute("formData", new RegisterRequest());
		return "register/step2";
	}

	@RequestMapping(value = "/register/step2", method=RequestMethod.GET)
	public String handleStep2() {
		return "redirect:/register/step1";
	}
	
	
	private MemberRegisterService memberRegisterService;

	// 컨트롤러에 커맨드 객체에 대한 setter 추가 (의존 주입 시 필요함)
	public void setMemberRegisterService(
			MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	// 컨트롤러 커맨드 객체를 받아 회원가입 기능 메서드 추가
	@RequestMapping(value = "/register/step3", method=RequestMethod.POST)
	public String handleStep3(@ModelAttribute("formData")RegisterRequest regReq,
			Errors errors) { // errors를 전달받도록 정의하면 mvc 자동으로 커맨드 객체와 연결된 에러 객체를 생성하여 전달
		new RegisterRequestValidator().validate(regReq, errors);
		if(errors.hasErrors()) { //validate 실행 중 한번이라도 rejectValue가 실행 되었을 경우 true를 반환
			return "register/step2";
		}
		try {
			memberRegisterService.regist(regReq); // 동일한 이메일 주소일 경우
			return "register/step3";
		} catch (AlreadyExistingMemberException e) {
			errors.rejectValue("email", "duplicate"); // 에러 저장하기 위해 catch문 안에 추가
			return "register/step2";
		}
	}
}
