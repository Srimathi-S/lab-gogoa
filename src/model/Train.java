package model;

import java.time.LocalDate;

// Type your code
public class Train
{
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	
	//constructor
	public Train(int noOfPersons, int rates,  String berth,LocalDate date) {
		this.noOfPersons = noOfPersons;
		this.berth = berth;
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
	public String getBerth() {
		return berth;
	}

	public void setBerth(String berth) {
		this.berth = berth;
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