package com.ys.spring.helloMVC.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class PersonDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private long id;
	
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String email;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	private String zip;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", address="
				+ address.toString() + ", zip=" + zip + "]";
	}

}
