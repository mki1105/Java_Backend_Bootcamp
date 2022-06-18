package controller;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.Member;
import spring.MemberDao;
import spring.MemberNotFoundException;

// 사용자 id를 요청 경로에 포함하도록 되어 있고, id가 다르기 때문에 경로에 사용되는 값도
// 선택한 회원마다 값이 달라져야 함.
@Controller
public class MemberDetailController {
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao){
		this.memberDao = memberDao;
	}
	//{id} 부분이 바로 요청 경로에서 {경로변수}로 지정되는 부분임.
	// 중괄호에 들어가는 값은 @PathVariable에 경로변수 이름(예제에서 id)으로 전달되게 됨.
	@RequestMapping("/member/detail/{id}")
	public String detail(@PathVariable("id")Long memId, Model model){
		Member member = memberDao.selectById(memId);
		if(member == null){ throw new MemberNotFoundException(); }
		model.addAttribute("member", member);
		return "member/memberDetail";
	}
	
	//예외 처리
	@ExceptionHandler(TypeMismatchException.class)
	public String handleTypeMismatchException(){
		return "member/invalidId";	
	}
	
//	@ExceptionHandler(MemberNotFoundException.class)
//	public String handleMemberNotFoundException(){
//		return "member/noMember";
//	}

} 