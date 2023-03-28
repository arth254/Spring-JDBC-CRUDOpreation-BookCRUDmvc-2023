package com.bookmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookmvc.dao.BookDAO;
import com.bookmvc.model.Book;

@Controller
public class BookControler {
	
	@Autowired
	BookDAO dao;
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert (@ModelAttribute ("Book") Book book)  {
		dao.insertBook(book);
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model m)
	{
		List<Book> list = dao.listAllBooks();
		m.addAttribute("list",list);
		return "listpage";
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Book book = dao.getBookById(id);
		m.addAttribute("command", book);
		return "editpage";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("book") Book book) {
		dao.updateBook(book);
		return "redirect:/list";
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		dao.deleteBook(id);
		return "redirect:/list";
	}	
}
