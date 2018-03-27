package com.jaison.AuditoriumBooking.User.Pojo;

public class Payment 
{
	private int paymentId;
	private int bookingId;
	private int customerId;
	private int eventId;
	private Double totalAmount;
	/**
	 * 
	 */
	public Payment() {
		super();
	}
	/**
	 * @param paymentId
	 * @param bookingId
	 * @param customerId
	 * @param eventId
	 * @param totalAmount
	 */
	public Payment(int paymentId, int bookingId, int customerId, int eventId, Double totalAmount) {
		super();
		this.paymentId = paymentId;
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.eventId = eventId;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", customerId=" + customerId
				+ ", eventId=" + eventId + ", totalAmount=" + totalAmount + "]";
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
