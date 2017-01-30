/*
 * This is a simple web application utilizing Spring MVC and Hibernate.
 * Developed by Lv-205 group of Softserve Academy.
 * 
 * Copyright (c) 1993-2016 Softserve, Inc.
 * This software is the confidential and proprietary information of Softserve.
 * 
 */
package com.softserve.spring.library.web.controller;





import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 
 * Core servlet controller class.
 * 
 * @author Kostyantyn Panchenko
 * @version 1.0
 * @since 22.10.2016
 *
 */
@Controller
public class BaseController {

    /**
     * Handles request to welcome page
     * @return logical view name
     */
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}
	
	

	@RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		return "contactus";
	}

}