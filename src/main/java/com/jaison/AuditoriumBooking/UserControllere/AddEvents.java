package com.jaison.AuditoriumBooking.UserControllere;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.Events;
import com.jaison.AuditoriumBooking.User.Service.UserService;

@RestController
@RequestMapping(value="/AddEvents")
public class AddEvents 
{
	@Autowired
	UserService service;
	@RequestMapping(value="/Events")
	public String addEvents(@RequestBody Events eventObj)throws SQLException,ClassNotFoundException
	{
		return service.addEvents(eventObj);
	}
	
	

}
