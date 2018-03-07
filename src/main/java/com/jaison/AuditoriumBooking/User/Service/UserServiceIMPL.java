package com.jaison.AuditoriumBooking.User.Service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaison.AuditoriumBooking.User.Data.UserDAO;
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

}
