package com.softserve.edu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @RequestMapping(value = { "/hotelForm2" }, method = RequestMethod.GET)
    public String showForm2(ModelMap model) {
        return "hotelForm2";
    }

    @RequestMapping(value = "/hotels", method = RequestMethod.POST)
    public ModelAndView getByCity(@RequestParam String city, ModelMap model) {

        return new ModelAndView("hotels", "set", new HashSet<>(hotelService.findHotels(city)));

    }

    @RequestMapping(value = "/freeRooms", method = RequestMethod.POST)
    public ModelAndView countOfFreeRooms(@RequestParam String hotel, @RequestParam String date, ModelMap model) {

        Date utilDate = null;
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            utilDate = dateFormatter.parse(date);
        } catch (ParseException e) {
            System.out.println("Parsing error");

        }
        model.addAttribute("date", date);
        model.addAttribute("count", hotelService.findCountOfFreeRooms(hotel, utilDate));
        return new ModelAndView("freeRooms", model);

    }

}
