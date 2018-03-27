package com.jaison.AuditoriumBooking.User.Pojo;

import java.sql.Date;
import java.util.List;

public class Booking 
{
	private Integer bookingId;
	private Integer customerId;
	private Integer eventId;
	private Date bookingDate;
	private Date bookedForDate;
	private Integer numberOfSeats;
	private List<String>seatNumbers;
	
	/**
	 * 
	 */
	public Booking() {
		super();
	}
	/**
	 * @param bookingId
	 * @param customerId
	 * @param eventId
	 * @param bookingDate
	 * @param bookedForDate
	 * @param numberOfSeats
	 * @param seatNumbers
	 */
	public Booking(Integer bookingId, Integer customerId, Integer eventId, Date bookingDate, Date bookedForDate,
			Integer numberOfSeats, List<String> seatNumbers) {
		super();
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.eventId = eventId;
		this.bookingDate = bookingDate;
		this.bookedForDate = bookedForDate;
		this.numberOfSeats = numberOfSeats;
		this.seatNumbers = seatNumbers;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + ", eventId=" + eventId
				+ ", bookingDate=" + bookingDate + ", bookedForDate=" + bookedForDate + ", numberOfSeats="
				+ numberOfSeats + ", seatNumbers=" + seatNumbers + "]";
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getBookedForDate() {
		return bookedForDate;
	}
	public void setBookedForDate(Date bookedForDate) {
		this.bookedForDate = bookedForDate;
	}
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public List<String> getSeatNumbers() {
		return seatNumbers;
	}
	public void setSeatNumbers(List<String> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}
	
}
