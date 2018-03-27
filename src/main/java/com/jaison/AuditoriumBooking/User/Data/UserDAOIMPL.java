package com.jaison.AuditoriumBooking.User.Data;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.jaison.AuditoriumBooking.User.Pojo.Booking;
import com.jaison.AuditoriumBooking.User.Pojo.Events;
import com.jaison.AuditoriumBooking.User.Pojo.Payment;
import com.jaison.AuditoriumBooking.User.Pojo.Seats;
import com.jaison.AuditoriumBooking.User.Pojo.User;

@Repository
public class UserDAOIMPL implements UserDAO 
{
	private static final String INSERT_QUERY_USERREGISTRATION="insert into UserRegistration (customerName,userName,password,address,phoneNumber,email) VALUES(?,?,?,?,?,?)";
	private static final String SELECT_QUERY_CUSTOMERID="select customerId from UserRegistration where userName=? and password= ?";
	private static final String INSERT_QUERY_LOGINDATA="insert into login (customerId,userName,password) VALUES(?,?,?)";
	private static final String SELECT_QUERY_USERLOGIN="SELECT * FROM userregistration INNER JOIN login ON login.userName=userregistration.userName AND login.userName = ? AND login.password=? ";
	private static final String SELECT_QUERY_SELECTALLEVENTS="SELECT * FROM EVENTS WHERE eventDate >= CURDATE()";
	private static final String SELECT_QUERY_SELECTALLSEATS="SELECT seatNumber FROM seats";
	private static final String SELECT_QUERY_SELECTALLBOOKINGSFORUSER="SELECT * FROM booking WHERE customerId=?";
	private static final String INSERT_QUERY_SEATBOOKINGFORUSER="INSERT INTO booking (customerId,eventId,bookingDate,bookedForDate,numberOfSeats) VALUES(?,?,?,?,?)";
	private static final String SELECT_QUERY_SELECTAMOUNTFOREVENT="SELECT eventAmount FROM EVENTS WHERE eventId=?";
	private static final String SELECT_QUERY_SELECTBOOKINGID="SELECT bookingID FROM booking WHERE customerId=? AND eventId=? AND bookingDate=? AND bookedForDate=? AND numberOfSeats=?";
	private static final String INSERT_QUERY_PAYMENTDETAILS="INSERT INTO payment (bookingId,customerId,eventId,totalAmount) VALUES(?,?,?,?)";
	private static final String INSERT_QUERY_BOOKEDSEATS="INSERT INTO bookedseats (customerId,eventId,bookingId,seatNumber) VALUES (?,?,?,?)";
	private static final String INSERT_QUERY_ADDEVEBTS="INSERT INTO EVENTS (eventName,eventDate,description,eventAmount,imageFileName) VALUES(?,?,?,?,?)";
	private static final String SELECT_QUERY_VIEWALLPAYMENTS="select * from payment";
	private static final String SELECT_QUERY_VIEWBOOKEDSEATS="SELECT * FROM bookedseats WHERE eventId=?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public String userRegistration(User userObj) throws SQLException, ClassNotFoundException 
	{
		
		int rowCountUserRegistration = jdbcTemplate.update(INSERT_QUERY_USERREGISTRATION, userObj.getCustomerName(),
				userObj.getUserName(),userObj.getPassword(),userObj.getAddress(),userObj.getPhoneNumber(),userObj.getEmail());
		int customerId = jdbcTemplate.queryForObject(SELECT_QUERY_CUSTOMERID, new Object[]{userObj.getUserName(),userObj.getPassword()},Integer.class);
		if(rowCountUserRegistration != 0)
		{
			int rowCountLoginUpdate=jdbcTemplate.update(INSERT_QUERY_LOGINDATA,customerId,userObj.getUserName(),userObj.getPassword());
			if(rowCountLoginUpdate !=0)
				return "Success";
			else
				return "Not registerd !";
		}
		else
			
			return "Not registerd !";
	}
	@Override
	public List<User> userLogin(User userObj)throws SQLException,ClassNotFoundException
	{
		
		return jdbcTemplate.query(SELECT_QUERY_USERLOGIN, new Object[]{userObj.getUserName(),userObj.getPassword()}, new UserMapper());
				
	}
	@Override
	public List<Events> viewEvents()throws SQLException,ClassNotFoundException
	{
			return jdbcTemplate.query(SELECT_QUERY_SELECTALLEVENTS, new EventMapper());
	}
	
	
	@Override
	public List<Seats> bookedSeats(Integer eventId)throws SQLException,ClassNotFoundException
	{
		List<Seats> seatForLayout=new ArrayList<>();
		List<Seats> allSeats=new ArrayList<>(); 
		List<Seats> bookedSeats=new ArrayList<>(); 
		bookedSeats = jdbcTemplate.query(SELECT_QUERY_VIEWBOOKEDSEATS, new Object[]{eventId},new BookedseatsMapper());
		allSeats = jdbcTemplate.query(SELECT_QUERY_SELECTALLSEATS, new SeatMapper());
		System.out.println("BookedSeats:"+bookedSeats);
		System.out.println("All seats:"+allSeats);
		
		for(Seats seat:allSeats)
		{
			System.out.println("First loop BookedSeats:"+seat);
			for(Seats booked:bookedSeats)
			{
				System.out.println("second loop BookedSeats:"+booked);
				if(seat.getSeatNumber().equals(booked.getSeatNumber()))
				{
					System.out.println("match found at "+seat);
				}
				else
				{
					seatForLayout.add(seat);
				}
			}
		}
		System.out.println("Available seats:"+seatForLayout);
		return null;
	}
	
	@Override
	public List<Booking>viewBooking(User userObj)throws SQLException,ClassNotFoundException
	{
		return jdbcTemplate.query(SELECT_QUERY_SELECTALLBOOKINGSFORUSER,new Object[]{userObj.getCustomerID()}, new ViewBookings());
	}
	@Override
	public String bookEvents(Booking bookingOBJ)throws SQLException,ClassNotFoundException
	{
		
		int rowBookSeats=jdbcTemplate.update(INSERT_QUERY_SEATBOOKINGFORUSER,bookingOBJ.getCustomerId(),bookingOBJ.getEventId(),bookingOBJ.getBookingDate(),bookingOBJ.getBookedForDate(),bookingOBJ.getNumberOfSeats());
		if(rowBookSeats !=0)
		{
			double eventAmount=jdbcTemplate.queryForObject(SELECT_QUERY_SELECTAMOUNTFOREVENT,new Object[]{ bookingOBJ.getEventId()},Double.class);
			double totalAmount = eventAmount * bookingOBJ.getNumberOfSeats();
			int bookingId=jdbcTemplate.queryForObject(SELECT_QUERY_SELECTBOOKINGID,new Object[]{bookingOBJ.getCustomerId(),bookingOBJ.getEventId(),bookingOBJ.getBookingDate(),bookingOBJ.getBookedForDate(),bookingOBJ.getNumberOfSeats()},Integer.class);
			int rowPayment=jdbcTemplate.update(INSERT_QUERY_PAYMENTDETAILS, bookingId,bookingOBJ.getCustomerId(),bookingOBJ.getEventId(),totalAmount);
			if (rowPayment !=0)
			{
				for (int i=0;i<bookingOBJ.getSeatNumbers().size();i++)
				{
					
					jdbcTemplate.update(INSERT_QUERY_BOOKEDSEATS,bookingOBJ.getCustomerId(),bookingOBJ.getEventId(),bookingId,bookingOBJ.getSeatNumbers().get(i));
					
				}
				
				return "Success";
					
			}
			else
				return "Failed";
		}
		else 
			return "Failed";
		
		
	}
	@Override
	public String addEvents(Events eventObj)throws SQLException,ClassNotFoundException
	{
		
		int rowAddEvent=jdbcTemplate.update(INSERT_QUERY_ADDEVEBTS,eventObj.getEventName(),eventObj.getEventDate(),eventObj.getDescription(),eventObj.getEventAmount(),eventObj.getImageFileName());
		if (rowAddEvent !=0)
			return "Success";
		else
			return "Failed";
	}
	@Override
	public List<Payment> viewPayment()throws SQLException, ClassNotFoundException
	{
		return jdbcTemplate.query(SELECT_QUERY_VIEWALLPAYMENTS, new PaymentMapper());
		 
	}
	
	

}
