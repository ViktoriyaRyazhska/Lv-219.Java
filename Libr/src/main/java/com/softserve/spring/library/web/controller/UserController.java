package com.softserve.spring.library.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.spring.library.entity.Book;
import com.softserve.spring.library.entity.User;
import com.softserve.spring.library.services.BookService;
import com.softserve.spring.library.services.UserService;

@Controller
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	BookService bs;
	
	@Autowired
	UserService us;

	@RequestMapping(value = { "/all" }, method = RequestMethod.GET)
	public ModelAndView books() {
		ModelAndView mav = new ModelAndView("users");
		List<User> users = us.getAllUsers();
		mav.addObject("users", users);
		return mav;
	}

	
	
	

}