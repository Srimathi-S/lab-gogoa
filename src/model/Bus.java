package model;

import java.time.LocalDate;

// Type your code
public class Bus
{
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;
	
	//constructor
	public Bus(int noOfPersons,  int rates,String busType, LocalDate date) {
		this.noOfPersons = noOfPersons;
		this.busType = busType;
		this.rates = rates;
		this.date = date;
	}
	
	//getters and setters for number of persons 
	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	
	//getters and setters for berth
	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType= busType;
	}
	
	//getters and setters for rate
	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}
	
	//getters and setters for date
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}