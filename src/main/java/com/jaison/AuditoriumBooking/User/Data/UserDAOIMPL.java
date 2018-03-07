package com.jaison.AuditoriumBooking.User.Data;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jaison.AuditoriumBooking.User.Pojo.User;

@Repository
public class UserDAOIMPL implements UserDAO 
{
	private static final String INSERT_QUERY_USERREGISTRATION="insert into UserRegistration (customerId,customerName,userName,password,address,phoneNumber,email) VALUES(?,?,?,?,?,?,?)";
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public String userRegistration(User userObj) throws SQLException, ClassNotFoundException 
	{
		
		int rowCountUserRegistration = jdbcTemplate.update(INSERT_QUERY_USERREGISTRATION, userObj.getCustomerID(),userObj.getCustomerName(),
				userObj.getUserName(),userObj.getPassword(),userObj.getAddress(),userObj.getPhoneNumber(),userObj.getEmail());
		if(rowCountUserRegistration != 0)
			return "Success";
		else
			
			return "Not registerd !";
	}

}
