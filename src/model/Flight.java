package model;

import java.time.LocalDate;

//Type your code 
public class Flight
{
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	
	//constructors
	public Flight(int noOfPersons, int rates,  String classType,LocalDate from, LocalDate to, String triptype) {
		super();
		this.noOfPersons = noOfPersons;
		this.classType = classType;
		this.rates = rates;
		this.from = from;
		this.to = to;
		this.triptype = triptype;
	}
	
	//getters and setters for number of people
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	
	//getters and setters for class type
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	//getters and setters for rate
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	
	//getters and setters for from date
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	
	//getters and setters for to date
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	
	//getters and setters for trip type
	public String getTriptype() {
		return triptype;
	}
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
}