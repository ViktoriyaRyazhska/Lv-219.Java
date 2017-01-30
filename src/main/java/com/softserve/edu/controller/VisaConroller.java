package com.softserve.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.edu.service.VisaService;

@Controller
public class VisaConroller {

    @Autowired
    private VisaService visaService;

    @RequestMapping(value = { "/visaForm" }, method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        return "visaForm";
    }

    @RequestMapping(value = "/visasOfClient", method = RequestMethod.POST)
    public ModelAndView getByClient(@RequestParam String firstName, @RequestParam String lastName, ModelMap model) {
        return new ModelAndView("visaByClient", "set", visaService.find(firstName, lastName));

    }

}
