package com.softserve.spring.library.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@GetMapping("/info/{userId}")
	public ModelAndView getBookInfo(@PathVariable("userId") String id) {
		Integer userId =Integer.parseInt(id);
		ModelAndView model = new ModelAndView("userInfo");
		model.addObject("userObj", us.getUserById(userId));
		model.addObject("bookOnHands", us.booksWasNotReturned(userId));
		model.addObject("bookTaken", us.booksWasTaken(userId));
		model.addObject("timeSinceRegistration", us.getTimeSinceRegistration(userId));
		
		return model;
	}
	
	

}