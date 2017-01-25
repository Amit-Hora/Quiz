package com.gojeck.parking.bean;



public class Vehicle {

	private String registrationNumber;

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public Vehicle(String registrationNumber, String colour) {
		super();
		this.registrationNumber = registrationNumber;
		this.colour = colour;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	private String colour;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

}
