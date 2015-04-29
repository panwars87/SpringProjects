package com.ys.spring.bean;

public class Customer {
	
	private Person custObject;

	public Person getCustObject() {
		return custObject;
	}

	public void setCustObject(Person custObject) {
		this.custObject = custObject;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return custObject.getName()+" & "+custObject.getAge();
	}
}
