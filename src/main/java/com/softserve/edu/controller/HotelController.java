package com.softserve.edu.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softserve.edu.service.HotelService;

@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = { "/hotelForm" }, method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        return "hotelForm";
    }

    @RequestMapping(value = "/hotels", method = RequestMethod.POST)
    public ModelAndView getByCity(@RequestParam String city, ModelMap model) {

        return new ModelAndView("hotels", "set", new HashSet<>(hotelService.findHotels(city)));

    }

}
