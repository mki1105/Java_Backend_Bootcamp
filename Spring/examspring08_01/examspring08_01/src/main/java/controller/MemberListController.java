package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.Member;
import spring.MemberDao;

@Controller
public class MemberListController {
	private MemberDao memberDao;
	
	@Autowired
	public void setMemberDao(MemberDao memberDao){
		this.memberDao = memberDao;
	}
	
	//날짜 형변환 에러메시지 추가 전
	/*@RequestMapping("/member/list")
	public String list(
			@ModelAttribute("cmd")ListCommand listCommand,
			Model model){
		if(listCommand.getFrom() != null && listCommand.getTo() != null){
			List<Member> members = memberDao.selectByRegdate(
					listCommand.getFrom(), listCommand.getTo());
			model.addAttribute("members", members);
		}
		return "member/memberList";
	}*/
	
	
	//날짜 형변환 에러 메시지 추가
	// 400 에러 페이지 대신 폼에 알맞은 에러 메시지를 보여주도록 적용하고 싶다면
	// Errors타입의 파라미터를 @RequestMapping이 적용된 컨트롤러 메서드에 추가해야 함.
	@RequestMapping("/member/list")
	public String list(
			@ModelAttribute("cmd")ListCommand listCommand,
			Errors errors, Model model){
		if(errors.hasErrors()){
			return "member/memberList";
		}
		if(listCommand.getFrom() != null && listCommand.getTo() != null){
			List<Member> members = memberDao.selectByRegdate(
					listCommand.getFrom(), listCommand.getTo());
			model.addAttribute("members", members);
		}
		return "member/memberList";
	}

} 