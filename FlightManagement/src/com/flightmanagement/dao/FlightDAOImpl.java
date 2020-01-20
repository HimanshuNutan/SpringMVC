package com.flightmanagement.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.flightmanagement.model.Flight;
@Repository
public class FlightDAOImpl implements FlightDAO {

	private static Logger logger = LogManager.getLogger(FlightDAOImpl.class.getName());
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertFlight(Flight flight) {
		// TODO Auto-generated method stub
		int response = 0;
		logger.info("Insert Flight details"+flight.getArrivalcity()+flight.getDeparturecity()+flight.getArrivaltime()+flight.getAvailableseats()
        +flight.getDeparturetime()+flight.getSeathighprice()+flight.getSeatmediumprice()+flight.getSeatlowprice());
		String query = "INSERT INTO FLIGHT (departurecity,arrivalcity,departuretime,arrivaltime,seatlowprice,seatmediumprice,seathighprice,\" +\r\n" + 
				"                \"totalseats,availableseats) VALUES(?,?,?,?,?,?,?,?)";
		try {
			response = jdbcTemplate.update(query, flight.getDeparturecity(),flight.getArrivalcity(),flight.getDeparturetime(),flight.getArrivaltime(),
	                flight.getSeatlowprice(),flight.getSeatmediumprice(),flight.getSeathighprice(),flight.getTotalseats(),flight.getTotalseats());
			
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error in inserting flight",e);
		}
	logger.info("Response = "+response);
		return response;
	}

	@Override
	public int updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		int response = 0;
		String query = "UPDATE FLIGHT SET departurecity = ?,arrivalcity =?,departuretime = ?,arrivaltime = ?,seatlowprice = ?," +
                "seatmediumprice =?,seathighprice =?,totalseats =?,availableseats =? where flightid = ?";
		try {
			response = jdbcTemplate.update(query,flight.getDeparturecity(), flight.getArrivalcity(), flight.getDeparturetime(), flight.getArrivaltime(),
                    flight.getSeatlowprice(), flight.getSeatmediumprice(), flight.getSeathighprice(), flight.getTotalseats(), flight.getTotalseats(),flight.getFlightid());		
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error in updating flight",e);
		}	
		return response;
	}

	@Override
	public int deleteFlight(int flightid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Flight getFlight(int flightid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateAvailableSeats(int flightid, int seatsbooked) {
		// TODO Auto-generated method stub
		return 0;
	}

}
