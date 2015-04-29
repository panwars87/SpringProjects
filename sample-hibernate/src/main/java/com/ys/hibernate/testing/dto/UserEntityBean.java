package com.ys.hibernate.testing.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="UserEntity")
public class UserEntityBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String dob;
	
	@OneToOne
	@JoinColumn(name="insuranceId")
	private AutoInsurance insurance;
	
	public AutoInsurance getInsurance() {
		return insurance;
	}

	public void setInsurance(AutoInsurance insurance) {
		this.insurance = insurance;
	}
	
	@OneToMany
	@JoinTable(name="userVehicle",
			   joinColumns=@JoinColumn(name="userId"),
			   inverseJoinColumns=@JoinColumn(name="vehicleId")
	)
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	//If use embedded then address fields will add as columns in UserEntity table.
	//@Embedded
	//private Address userAddress;
	//Element collections will create a seperate table with user entity's userId as primarykey.
	@ElementCollection
	@JoinTable(name="UserAddress",
				joinColumns=@JoinColumn(name="userId")		
	)
	//the below 2 are specific to hibernate
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="addressId") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	//private Set<Address> listOfAddress = new HashSet<Address>();
	
	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	@Lob
	private String userDescription;
	
/*	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}*/

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
