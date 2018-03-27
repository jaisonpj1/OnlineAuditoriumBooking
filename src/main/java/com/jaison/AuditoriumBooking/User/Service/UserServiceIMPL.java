package com.jaison.AuditoriumBooking.User.Service;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaison.AuditoriumBooking.User.Data.UserDAO;
import com.jaison.AuditoriumBooking.User.Pojo.Booking;
import com.jaison.AuditoriumBooking.User.Pojo.Events;
import com.jaison.AuditoriumBooking.User.Pojo.Payment;
import com.jaison.AuditoriumBooking.User.Pojo.Seats;
import com.jaison.AuditoriumBooking.User.Pojo.User;

@Service
public class UserServiceIMPL implements UserService 
{
	@Autowired
	UserDAO DAO;
	@Override
	public String userRegistration(User userObj) throws SQLException, ClassNotFoundException 
	{
		
		return DAO.userRegistration(userObj);
	}
	
	public List<User> userLogin(User userObj)throws SQLException,ClassNotFoundException
	{
		 
		return DAO.userLogin(userObj);
	}
	public List<Events> viewEvents()throws SQLException,ClassNotFoundException
	{
		return DAO.viewEvents();
	}
	
	public List<Booking>viewBooking(User userObj)throws SQLException,ClassNotFoundException
	{
		return DAO.viewBooking(userObj);
	}
	public String bookEvents(Booking bookingOBJ)throws SQLException,ClassNotFoundException
	{
		return DAO.bookEvents(bookingOBJ);
	}
	public String addEvents(Events eventObj)throws SQLException,ClassNotFoundException
	{
		return DAO.addEvents(eventObj);
	}
	public List<Payment> viewPayment()throws SQLException, ClassNotFoundException
	{
		return DAO.viewPayment();
	}
	public List<Seats> bookedSeats(Integer eventId)throws SQLException, ClassNotFoundException
	{
		return DAO.bookedSeats(eventId);
	}

}
