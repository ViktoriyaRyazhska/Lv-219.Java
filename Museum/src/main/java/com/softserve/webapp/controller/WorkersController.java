package com.softserve.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.webapp.service.WorkersService;

@Controller
public class WorkersController {
	
	@Autowired
    private WorkersService workersService;
	
	@RequestMapping(value = { "/workerForm" }, method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        return "workerForm";
    }
	
	@RequestMapping(value = "/Workers", method = RequestMethod.POST)
    public ModelAndView getByAuthor(@RequestParam String post, ModelMap model) {
        return new ModelAndView("workers", "set", workersService.findWorkersByPost(post));
    }

}
