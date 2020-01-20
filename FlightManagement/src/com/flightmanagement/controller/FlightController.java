package com.flightmanagement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flightmanagement.model.Flight;
import com.flightmanagement.service.FliManService;

import java.util.ArrayList;
import java.util.List;
//@Controller
//@RequestMapping("/flight")
public class FlightController {
	@Autowired
	private FliManService fliManService;
	private static Logger logger = LogManager.getLogger(FlightController.class.getName());
	
	
	
//	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
//	public ModelAndView getAllFlights(Model m){
//		List<Flight> flightList = new ArrayList<Flight>();
//		try {
//			flightList = fliManService.getAllFlights();
//			m.addAttribute("flightList", flightList);
//			logger.info("Flight List",flightList);
//		}catch (Exception e) {
//			// TODO: handle exception
//			logger.error("Error in getting Flights",e);		
//		}
//		return new ModelAndView("flightDetails");
//	}
}
