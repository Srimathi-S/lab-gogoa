package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking
{
	//Hotel booking price calculator
	public double book(Hotel hotel)
	{
		if(isValid(hotel))
		return super.booking(hotel.getNoOfPersons(),hotel.getRates());
		System.out.println("Error");
		return 0;
	}
	
	private boolean isValid(Hotel hotel) {
		LocalDate fromDate=null;
		LocalDate toDate=null;
			fromDate = hotel.getFromdate();
			toDate= hotel.getTodate();
		return toDate.isAfter(fromDate);
		
	}

	//Flight booking price calculator
	public double book(Flight flight)
	{
		return super.booking(flight.getNoOfPersons(),flight.getRates());
	}
	
	//Train booking price calculator
	public double book(Train train)
	{
		return super.booking(train.getNoOfPersons(),train.getRates());
	}
	
	//Bus booking price calculator
	public double book(Bus bus)
	{
		return super.booking(bus.getNoOfPersons(),bus.getRates());
	}
}