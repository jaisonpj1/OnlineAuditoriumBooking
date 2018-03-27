package com.jaison.AuditoriumBooking.User.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jaison.AuditoriumBooking.User.Pojo.Seats;

public class BookedseatsMapper implements RowMapper<Seats> 
{
	@Override
	public Seats mapRow(ResultSet seats, int arg1) throws SQLException
	{
		Seats seatObj=new Seats();
		seatObj.setSeatNumber(seats.getString(4));
		return seatObj;
	}
}
