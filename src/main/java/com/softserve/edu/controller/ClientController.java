package com.softserve.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.edu.service.ClientService;
import com.softserve.edu.service.CountryService;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CountryService countryService;

	@RequestMapping(value = { "/clientForm" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "clientForm";
	}
	@RequestMapping(value = { "/clientForm1" }, method = RequestMethod.GET)
	public String showForm1(ModelMap model) {
		return "clientForm1";
	}

	@RequestMapping(value = "/clientStatistic", method = RequestMethod.POST)
	public ModelAndView getCountByCountry(@RequestParam String firstName, @RequestParam String lastName,
			ModelMap model) {
		
		model.addAttribute("list", countryService.findVisited(firstName, lastName) );
		model.addAttribute("set", clientService.find(firstName, lastName).getVisas());
		return new ModelAndView("clientStatistic", model);

	}

}
