package com.softserve.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.webapp.service.ExhibitService;

@Controller
public class ExhibitsController {
	
	@Autowired
    private ExhibitService exhibitService;
	
	@RequestMapping(value = "/exhibitsStatistic", method = RequestMethod.GET)
    public ModelAndView getStatistic(ModelMap model) {
        return new ModelAndView("exhibitsStatistic", "exhibits", exhibitService.showExhibitStatistic());
    }
	
	@RequestMapping(value = "/showExhibits", method = RequestMethod.GET)
    public ModelAndView getAll(ModelMap model) {
        return new ModelAndView("showExhibits", "set", exhibitService.showExhibit());
    }
	
	@RequestMapping(value = { "/exhibitForm1" }, method = RequestMethod.GET)
    public String showForm1(ModelMap model) {
        return "exhibitForm1";
    }
	
	@RequestMapping(value = { "/exhibitForm2" }, method = RequestMethod.GET)
    public String showForm2(ModelMap model) {
        return "exhibitForm2";
    }
	
	@RequestMapping(value = "/showExhibitsByAuthor", method = RequestMethod.POST)
    public ModelAndView getByAuthor(@RequestParam String author, ModelMap model) {
        return new ModelAndView("showExhibitsByAuthor", "set", exhibitService.findExhibitsByAuthor(author));
    }
	
	@RequestMapping(value = "/showExhibitsByWorker", method = RequestMethod.POST)
    public ModelAndView getByWorker(@RequestParam String worker, ModelMap model) {
        return new ModelAndView("showExhibitsByWorker", "set", exhibitService.findExhibitsByWorker(worker));
    }
	
	@RequestMapping(value = "/showExhibitsByHall", method = RequestMethod.GET)
    public ModelAndView getByHall(ModelMap model) {
        return new ModelAndView("showExhibitsByHall", "set", exhibitService.findExhibitsByHall());
    }

}
