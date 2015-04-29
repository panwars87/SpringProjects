package com.ys.spring.aggregator.dto;

import org.springframework.stereotype.Repository;

@Repository(value="contactBean")
public class Contact {
	
	private String phone;
	private String email;
	private String secondaryPhone;
	private String secondaryEmail;
	
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
	public String getSecondaryPhone() {
		return secondaryPhone;
	}
	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
}
