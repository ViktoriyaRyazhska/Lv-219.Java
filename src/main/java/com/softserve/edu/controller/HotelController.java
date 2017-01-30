package com.softserve.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HotelController {

    @RequestMapping(value = { "/hotelForm" }, method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        return "hotelForm";
    }

}
