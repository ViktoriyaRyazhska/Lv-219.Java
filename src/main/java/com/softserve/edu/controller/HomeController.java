package com.softserve.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.edu.service.BookingService;

@Controller
public class HomeController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }

    @GetMapping("/products")
    public ModelAndView byMaterial() {
        return new ModelAndView("products", "list", bookingService.getAll());
    }

    @RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "contactus";
    }

}
