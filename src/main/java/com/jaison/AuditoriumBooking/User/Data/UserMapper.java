package com.jaison.AuditoriumBooking.User.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jaison.AuditoriumBooking.User.Pojo.User;

public class UserMapper implements RowMapper<User> 
{

	@Override
	public User mapRow(ResultSet details, int arg1) throws SQLException 
	{
		User userDetails =new User();
		userDetails.setCustomerID(details.getInt(1));
		userDetails.setCustomerName(details.getString(2));
		userDetails.setUserName(details.getString(3));
		userDetails.setPassword(details.getString(4));
		userDetails.setAddress(details.getString(5));
		userDetails.setPhoneNumber(details.getString(6));
		userDetails.setEmail(details.getString(7));
		return userDetails;
	}

}
