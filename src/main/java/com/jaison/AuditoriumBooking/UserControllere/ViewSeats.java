package com.jaison.AuditoriumBooking.UserControllere;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.Seats;
import com.jaison.AuditoriumBooking.User.Service.UserService;


@RestController
@RequestMapping(value="/ViewSeats")
public class ViewSeats 
{

	@Autowired
	UserService service;
	@GetMapping("/BookedSeats/{eventId}")
	public List<Seats> viewBookedSeats(@PathVariable int eventId) throws ClassNotFoundException, SQLException
	{
		return service.bookedSeats(eventId);
	}

}
