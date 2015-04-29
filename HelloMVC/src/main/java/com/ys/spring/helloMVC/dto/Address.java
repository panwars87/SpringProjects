package com.ys.spring.helloMVC.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class Address {
	@NotEmpty
	private String lane1;
	@NotEmpty
	private String lane2;
	@NotEmpty
	private String zipcode;
	public String getLane1() {
		return lane1;
	}
	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}
	public String getLane2() {
		return lane2;
	}
	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address [lane1=" + lane1 + ", lane2=" + lane2 + ", zipcode="
				+ zipcode + "]";
	}
	
}
