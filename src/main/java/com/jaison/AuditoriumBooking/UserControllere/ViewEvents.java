package com.jaison.AuditoriumBooking.UserControllere;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.io.Console;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.Events;
import com.jaison.AuditoriumBooking.User.Pojo.User;
import com.jaison.AuditoriumBooking.User.Service.UserService;

@RestController
@RequestMapping(value="/ViewEvents")
public class ViewEvents 
{
	@Autowired
	UserService service;
	@GetMapping("/Events")
	public List<Events> UserRegistration() throws ClassNotFoundException, SQLException
	{
	
		return service.viewEvents();
	}
	
	
	

}
