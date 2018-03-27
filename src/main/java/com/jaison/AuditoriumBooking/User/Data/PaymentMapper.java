package com.jaison.AuditoriumBooking.User.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jaison.AuditoriumBooking.User.Pojo.Payment;

public class PaymentMapper implements RowMapper<Payment> 
{
	@Override
	public Payment mapRow(ResultSet payments,int arg1)throws SQLException
	{
		Payment paymentObj =new Payment();
		paymentObj.setPaymentId(payments.getInt(1));
		paymentObj.setBookingId(payments.getInt(2));
		paymentObj.setCustomerId(payments.getInt(3));
		paymentObj.setEventId(payments.getInt(4));
		paymentObj.setTotalAmount(payments.getDouble(5));
		return paymentObj;
		
	}
}
