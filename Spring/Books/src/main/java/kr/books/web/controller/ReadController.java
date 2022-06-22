package kr.books.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.books.web.model.BookDao;
import kr.books.web.model.BookDto;

@Controller
public class ReadController {
	@Autowired
	private BookDao bookdao;
	
	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}
	// 도서 정보보기
	@RequestMapping(value="/books/search/{idx}")
	public Object selectView(Model model, @PathVariable int idx) {
		BookDto bookDto = new BookDto();
		model.addAttribute("bookDto", bookdao.selectView(idx));
		return "/books/book_detail";
	}
}
