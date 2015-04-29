package com.ys.hibernate.testing.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class AutoInsurance{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int insuranceId;
	private String policyName;
	
	@OneToOne
	@JoinColumn(name="userId")
	private UserEntityBean user;

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public UserEntityBean getUser() {
		return user;
	}

	public void setUser(UserEntityBean user) {
		this.user = user;
	}
}
