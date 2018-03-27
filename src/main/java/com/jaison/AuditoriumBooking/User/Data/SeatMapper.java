package com.jaison.AuditoriumBooking.User.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.jaison.AuditoriumBooking.User.Pojo.Seats;

public class SeatMapper implements RowMapper<Seats>
{

	
	@Override
	public Seats mapRow(ResultSet seatsNumbers, int arg1) throws SQLException
	{
		Seats seatObj=new Seats();
		seatObj.setSeatNumber(seatsNumbers.getString(1));
		return seatObj;
	}

}
