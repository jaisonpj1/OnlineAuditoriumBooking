package com.jaison.AuditoriumBooking.User.Data;

import java.sql.SQLException;

import com.jaison.AuditoriumBooking.User.Pojo.User;

public interface UserDAO 
{
	public String userRegistration(User userObj)throws SQLException,ClassNotFoundException;
	
}
