package ys.pdev.learning.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String addrLane1;
	private String addrLane2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public String getAddrLane1() {
		return addrLane1;
	}
	public void setAddrLane1(String addrLane1) {
		this.addrLane1 = addrLane1;
	}
	public String getAddrLane2() {
		return addrLane2;
	}
	public void setAddrLane2(String addrLane2) {
		this.addrLane2 = addrLane2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addrLane1=" + addrLane1 + ", addrLane2=" + addrLane2
				+ ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", country=" + country + "]";
	}
	
}
