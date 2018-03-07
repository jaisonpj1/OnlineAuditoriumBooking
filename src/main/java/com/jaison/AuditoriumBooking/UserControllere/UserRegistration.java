package com.jaison.AuditoriumBooking.UserControllere;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.User;
import com.jaison.AuditoriumBooking.User.Service.UserService;

@RestController
@RequestMapping(value="/UserRegistration")
public class UserRegistration 
{
	@Autowired
	UserService service;
	@PostMapping("/Registration")
	public String UserRegistration(@RequestBody User userObj) throws ClassNotFoundException, SQLException
	{
		return service.userRegistration(userObj);
	}
}
