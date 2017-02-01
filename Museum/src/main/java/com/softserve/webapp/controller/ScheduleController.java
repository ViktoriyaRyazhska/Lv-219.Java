package com.softserve.webapp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.webapp.service.ScheduleService;

@Controller
public class ScheduleController {
	
	@Autowired
    private ScheduleService scheduleService;
	
	@RequestMapping(value = { "/scheduleForm1" }, method = RequestMethod.GET)
    public String showForm1(ModelMap model) {
        return "scheduleForm1";
    }
	
	@RequestMapping(value = { "/scheduleForm2" }, method = RequestMethod.GET)
    public String showForm2(ModelMap model) {
        return "scheduleForm2";
    }
	
	@RequestMapping(value = { "/scheduleForm3" }, method = RequestMethod.GET)
    public String showForm3(ModelMap model) {
        return "scheduleForm3";
    }
	
	@RequestMapping(value = "/showExcursion", method = RequestMethod.POST)
    public ModelAndView getExcursion(@RequestParam String dateStart, @RequestParam String dateEnd, ModelMap model) {
		Date utilDate1 = null;
		Date utilDate2 = null;
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			utilDate1 = dateFormatter.parse(dateStart);
			utilDate2 = dateFormatter.parse(dateEnd);
		} catch (ParseException e) {
			System.out.println("Parsing error");
		}
		model.addAttribute("dateStart", dateStart);
		model.addAttribute("dateEnd", dateEnd);
		model.addAttribute("list", scheduleService.findExcursions(utilDate1, utilDate2));
		return new ModelAndView("showExcursion", model);
    }
	
	@RequestMapping(value = "/showGuidesStatistics", method = RequestMethod.POST)
    public ModelAndView getGuidesStatistics(@RequestParam String dateStart, @RequestParam String dateEnd, ModelMap model) {
		Date utilDate1 = null;
		Date utilDate2 = null;
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			utilDate1 = dateFormatter.parse(dateStart);
			utilDate2 = dateFormatter.parse(dateEnd);
		} catch (ParseException e) {
			System.out.println("Parsing error");
		}
		model.addAttribute("dateStart", dateStart);
		model.addAttribute("dateEnd", dateEnd);
		model.addAttribute("list", scheduleService.showGuidesStatistic(utilDate1, utilDate2));
		return new ModelAndView("showGuidesStatistics", model);
    }
	
	@RequestMapping(value = "/countOfExcursions", method = RequestMethod.POST)
    public ModelAndView getcountOfExcursions(@RequestParam String dateStart, @RequestParam String dateEnd, ModelMap model) {
		Date utilDate1 = null;
		Date utilDate2 = null;
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			utilDate1 = dateFormatter.parse(dateStart);
			utilDate2 = dateFormatter.parse(dateEnd);
		} catch (ParseException e) {
			System.out.println("Parsing error");
		}
		model.addAttribute("dateStart", dateStart);
		model.addAttribute("dateEnd", dateEnd);
		model.addAttribute("count", scheduleService.countOfExcursions(utilDate1, utilDate2));
		return new ModelAndView("countOfExcursions", model);
    }

}
