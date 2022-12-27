package com.masai.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String state;
	private String city;
	private String pincode;
	
	// At a particular address we can have multiple customers staying
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Customer> customers=new ArrayList<Customer>();
	
	public Address() {
		
	}
	

	public Address(int id, String state, String city, String pincode, List<Customer> customers) {
		super();
		this.id = id;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.customers = customers;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
	
	

}
