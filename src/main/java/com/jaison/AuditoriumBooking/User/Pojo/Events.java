package com.jaison.AuditoriumBooking.User.Pojo;

import java.sql.Date;

public class Events 
{
	private int eventId;
	private String eventName;
	private Date eventDate;
	private String description;
	private Double eventAmount;
	private String imageFileName;
	/**
	 * 
	 */
	public Events() {
		super();
	}
	/**
	 * @param eventId
	 * @param eventName
	 * @param eventDate
	 * @param description
	 * @param eventAmount
	 * @param imageFileName
	 */
	public Events(int eventId, String eventName, Date eventDate, String description, Double eventAmount,String imageFileName) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.description = description;
		this.eventAmount = eventAmount;
		this.imageFileName = imageFileName;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	
	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate + ", description="
				+ description + ", eventAmount=" + eventAmount + ", imageFileName=" + imageFileName + "]";
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getEventAmount() {
		return eventAmount;
	}
	public void setEventAmount(Double eventAmount) {
		this.eventAmount = eventAmount;
	}
	
}
