package com.jaison.AuditoriumBooking.UserControllere;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.Booking;
import com.jaison.AuditoriumBooking.User.Service.UserService;

@RestController
@RequestMapping(value="/BookingSeats")
public class SeatBooking 
{
	
		@Autowired
		UserService service;
		@PostMapping(value="/Seats")
		public String bookingSeats(@RequestBody Booking bookingOBJ)throws SQLException,ClassNotFoundException
		{
			
			return service.bookEvents(bookingOBJ);
		}
	
}
