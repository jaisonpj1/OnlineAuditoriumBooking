package com.jaison.AuditoriumBooking.UserControllere;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.User;
import com.jaison.AuditoriumBooking.User.Service.UserService;

@RestController
@RequestMapping(value="/UserLogin")
public class Login 
{
	@Autowired
	UserService service;
	@PostMapping("/ligin")
	public List<User> userLogin(@RequestBody User userObj) throws ClassNotFoundException, SQLException
	{
		
		return service.userLogin(userObj);
	}
}
