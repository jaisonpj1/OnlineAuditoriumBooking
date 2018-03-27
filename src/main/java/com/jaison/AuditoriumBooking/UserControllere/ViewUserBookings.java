package com.jaison.AuditoriumBooking.UserControllere;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.Booking;
import com.jaison.AuditoriumBooking.User.Pojo.User;
import com.jaison.AuditoriumBooking.User.Service.UserService;

@RestController
@RequestMapping(value="/ViewMyBookings")
public class ViewUserBookings 
{
	@Autowired
	UserService service;
	@PostMapping(value="/Bookings")
	public List<Booking>ViewUserBooking(@RequestBody User userObj)throws SQLException,ClassNotFoundException
	{
		System.out.println(userObj);
		System.out.println(service.viewBooking(userObj));
		return service.viewBooking(userObj);
	}

}
