package com.jaison.AuditoriumBooking.User.Service;


import java.sql.SQLException;
import java.util.List;

import com.jaison.AuditoriumBooking.User.Pojo.Booking;
import com.jaison.AuditoriumBooking.User.Pojo.Events;
import com.jaison.AuditoriumBooking.User.Pojo.Payment;
import com.jaison.AuditoriumBooking.User.Pojo.Seats;
import com.jaison.AuditoriumBooking.User.Pojo.User;

public interface UserService 
{
	public String userRegistration(User userObj)throws SQLException,ClassNotFoundException;
	public List<User> userLogin(User userObj)throws SQLException,ClassNotFoundException;
	public List<Events> viewEvents()throws SQLException,ClassNotFoundException;
	//public List<Seats> seatNumbers()throws SQLException,ClassNotFoundException;
	public List<Booking>viewBooking(User userObj)throws SQLException,ClassNotFoundException;
	public String bookEvents(Booking bookingOBJ)throws SQLException,ClassNotFoundException;
	public String addEvents(Events eventObj)throws SQLException,ClassNotFoundException;
	public List<Payment> viewPayment()throws SQLException, ClassNotFoundException;
	public List<Seats> bookedSeats(Integer eventId)throws SQLException, ClassNotFoundException;

}
