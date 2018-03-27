package com.jaison.AuditoriumBooking.UserControllere;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaison.AuditoriumBooking.User.Pojo.Payment;
import com.jaison.AuditoriumBooking.User.Service.UserService;


@RestController
@RequestMapping(value="/Payment")
public class Payments 
{
	@Autowired
	UserService service;
	@GetMapping(value="/ViewAllPayments")
	public List<Payment>ViewAllPayment()throws SQLException,ClassNotFoundException
	{
		return service.viewPayment();
	}
}
