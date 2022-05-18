package com.taco;

import java.util.Date;

import lombok.Data;

public class Order {
	private Long id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private Date placeAt;
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;
	
	public Order() {
		
	}

	public Order(Long id, String name, String street, String city, String state, String zip, Date placeAt,
			String ccNumber, String ccExpiration, String ccCVV) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.placeAt = placeAt;
		this.ccNumber = ccNumber;
		this.ccExpiration = ccExpiration;
		this.ccCVV = ccCVV;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Date getPlaceAt() {
		return placeAt;
	}

	public void setPlaceAt(Date placeAt) {
		this.placeAt = placeAt;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcExpiration() {
		return ccExpiration;
	}

	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}

	public String getCcCVV() {
		return ccCVV;
	}

	public void setCcCVV(String ccCVV) {
		this.ccCVV = ccCVV;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", placeAt=" + placeAt + ", ccNumber=" + ccNumber + ", ccExpiration=" + ccExpiration
				+ ", ccCVV=" + ccCVV + "]";
	}
	
	
}
