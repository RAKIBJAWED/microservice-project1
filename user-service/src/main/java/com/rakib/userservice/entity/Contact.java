package com.rakib.userservice.entity;

public class Contact {

	private long cId;
	private String phone;
	private String email;
	private long userId;
	public Contact(long cId, String phone, String email, long userId) {
		this.cId = cId;
		this.phone = phone;
		this.email = email;
		this.userId = userId;
	}
	public Contact() {
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
