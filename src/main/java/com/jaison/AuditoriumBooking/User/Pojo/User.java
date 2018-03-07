package com.jaison.AuditoriumBooking.User.Pojo;

public class User 
{
	private int customerID;
	private String userName;
	private String password;
	private String address;
	private String email;
	private String phoneNumber;
	
	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @param customerID
	 * @param customerName
	 * @param userName
	 * @param password
	 * @param address
	 * @param email
	 * @param phoneNumber
	 */
	public User(int customerID, String customerName, String userName, String password, String address, String email,
			String phoneNumber) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	private String customerName;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [customerID=" + customerID + ", userName=" + userName + ", password=" + password + ", address="
				+ address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", customerName=" + customerName
				+ "]";
	}
}
