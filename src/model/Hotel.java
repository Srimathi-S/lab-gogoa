package model;

import java.time.LocalDate;

// Type your code
public class Hotel
{
	private int noOfPersons;
	private String roomType;
	private int rates;
	private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
	
	//constructor
	public Hotel(int noOfPersons, String roomType, int rates, String occupancy, LocalDate fromdate, LocalDate todate) {
		this.noOfPersons = noOfPersons;
		this.roomType = roomType;
		this.rates = rates;
		this.occupancy = occupancy;
		this.fromdate = fromdate;
		this.todate = todate;
	}
	
	//getters and setters for number of persons
	public int getNoOfPersons() {
		return noOfPersons;
	}


	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	//getters and setters for room type
	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	//getters and setters for rate
	public int getRates() {
		return rates;
	}


	public void setRates(int rates) {
		this.rates = rates;
	}

	//getters and setters for occupancy
	public String getOccupancy() {
		return occupancy;
	}


	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	
	//getters and setters for from date
	public LocalDate getFromdate() {
		return fromdate;
	}


	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}

	//getters and setters for to date
	public LocalDate getTodate() {
		return todate;
	}


	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	
	
	
	
}