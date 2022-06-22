package kr.books.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.books.web.model.BookDao;
import kr.books.web.model.BookDto;

@Controller
public class SearchController {
	@Autowired
	private BookDao bookdao;	
	
	@RequestMapping(value="/books/search")
	public String search(Model model, @PathVariable int idx) {
		BookDto bookDto = new BookDto();
		model.addAttribute("bookDto", bookdao.searchList(idx));
		return "/books/book_list";
	}
}
