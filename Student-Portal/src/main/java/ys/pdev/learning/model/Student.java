package ys.pdev.learning.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.std.DateSerializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	private String firstName;
	private String lastname;
	private String email;
	@JsonSerialize(using=DateSerializer.class)  
	private Date dateOfBirth;
	private String gender;
	private Address address;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName
				+ ", lastname=" + lastname + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", address=" + address + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
