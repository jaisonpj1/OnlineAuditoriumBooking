package com.jaison.AuditoriumBooking.User.Pojo;

public class Seats 
{
	private String seatNumber;

	/**
	 * 
	 */
	public Seats() {
		super();
	}

	@Override
	public String toString() {
		return "Seats [seatNumber=" + seatNumber + "]";
	}

	/**
	 * @param seatNumber
	 */
	public Seats(String seatNumber) {
		super();
		this.seatNumber = seatNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
}
