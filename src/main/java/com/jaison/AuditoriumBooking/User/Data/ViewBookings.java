package com.jaison.AuditoriumBooking.User.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.jaison.AuditoriumBooking.User.Pojo.Booking;

public class ViewBookings implements RowMapper<Booking> 
{

	@Override
	public Booking mapRow(ResultSet bookings, int arg1) throws SQLException 
	{
		Booking bookingObj=new Booking();
		bookingObj.setBookingId(bookings.getInt(1));
		bookingObj.setCustomerId(bookings.getInt(2));
		bookingObj.setEventId(bookings.getInt(3));
		bookingObj.setBookingDate(bookings.getDate(4));
		bookingObj.setBookedForDate(bookings.getDate(5));
		bookingObj.setNumberOfSeats(bookings.getInt(6));
		return bookingObj;
	}
	
	
	
}
