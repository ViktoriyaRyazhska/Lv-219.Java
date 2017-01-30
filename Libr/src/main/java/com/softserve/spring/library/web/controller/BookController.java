//package com.softserve.spring.library.web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.softserve.spring.library.services.BookService;
//
//
//public class BookController {
//	
//	@Autowired
//	BookService bs;
//	
//	   @GetMapping
//	    public ModelAndView onGuides() {
//	        return new ModelAndView("guides/guides", "guides", bs.getAllBooks());
//	    }
//
//}
