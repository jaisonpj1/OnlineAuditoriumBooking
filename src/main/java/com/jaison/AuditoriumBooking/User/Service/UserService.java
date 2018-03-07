package com.jaison.AuditoriumBooking.User.Service;

import java.sql.SQLException;

import com.jaison.AuditoriumBooking.User.Pojo.User;

public interface UserService 
{
	public String userRegistration(User userObj)throws SQLException,ClassNotFoundException;


}
