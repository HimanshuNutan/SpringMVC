package com.flightmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flightmanagement.dao.FlightDAO;
import com.flightmanagement.model.Flight;

@Service("fliManService")
public class FliManService {
	@Autowired
	private FlightDAO flightDAO;
	@Transactional
    public int insertFlight(Flight flight){
     return flightDAO.insertFlight(flight);
    }
    @Transactional
    public int updateFlight(Flight flight){
        return flightDAO.updateFlight(flight);
    }
    @Transactional
    public int deleteFlight(int flightid){
        return flightDAO.deleteFlight(flightid);
    }

    public Flight getFlight(int flightid){
        return flightDAO.getFlight(flightid);
    }
    public List<Flight> getAllFlights(){
        return flightDAO.getAllFlights();
    }
    @Transactional
    public int updateAvailableSeats(int flightid,int seatsbooked){
        return flightDAO.updateAvailableSeats(flightid,seatsbooked);
    }
	
}
