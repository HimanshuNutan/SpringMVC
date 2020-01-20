package com.flightmanagement.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.flightmanagement.model.Flight;

//@Repository
public interface FlightDAO {

	public int insertFlight(Flight flight);
	public int updateFlight(Flight flight);
	public int deleteFlight(int flightid);
	public Flight getFlight(int flightid);
	public List<Flight> getAllFlights();
	public int updateAvailableSeats(int flightid,int seatsbooked);
	
}
