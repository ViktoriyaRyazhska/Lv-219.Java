package com.softserve.spring.library.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.spring.library.entity.Book;
import com.softserve.spring.library.services.BookService;

@Controller
public class CoreController {

	@Autowired
	BookService bs;
	
    /**
     * Handles request to welcome page
     * @return logical view name
     */
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = { "/books"}, method = RequestMethod.GET)
	public ModelAndView books() {
		 ModelAndView mav = new ModelAndView("books") ;
	        List<Book> books = bs.getAllBooks();
	        mav.addObject("books", books);  
		return mav;
	}

	@RequestMapping(value = { "/products"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		return "products";
	}

	@RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		return "contactus";
	}

}