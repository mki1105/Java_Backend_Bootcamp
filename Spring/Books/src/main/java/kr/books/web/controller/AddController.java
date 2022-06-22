package kr.books.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.books.web.model.BookDao;
import kr.books.web.model.BookDto;

@Controller
public class AddController {
	@Autowired
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	// 새글 작성
	@RequestMapping(value="/books/add", method=RequestMethod.GET)
	public String insert(Model model) {
		model.addAttribute("bookDto", new BookDto());
		return "/books/book_reg_form";
	}
	
	// 새글 등록 후 목록으로 리다이렉트
	@RequestMapping(value="/books/add", method=RequestMethod.POST)
	public String insert(@ModelAttribute("formData")BookDto BookDto, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "/books/book_reg_form";
		}		
		bookDao.insert(BookDto);
		return "redirect:/books/list";
	}
	
	@RequestMapping(value = "/books/add", method = RequestMethod.POST)
	   public String register(@ModelAttribute("formData") RegisterRequest regReq, Errors error, MultipartFile image, HttpSession session) {      
	      if(!image.getOriginalFilename().equals("")) {
	         String fileName = image.getOriginalFilename();
	         String savePath = session.getServletContext().getRealPath("/resources/uploadFiles/");
	         try {
	            image.transferTo(new File(savePath + fileName));
	         } catch (IllegalStateException | IOException e) {
	            e.printStackTrace();
	         }
	         regReq.setImage(image.getOriginalFilename());
	      }
	      try {
	         registerService.regist(regReq);
	         return "redirect:./list";
	      } catch (AlreadyExistingBookException e) {
	         System.out.println(e);
	         error.rejectValue("isbn", "exist");
	         return "books/book_reg_form";
	      }
	   }
}
