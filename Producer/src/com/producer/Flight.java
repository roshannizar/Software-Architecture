package com.producer;

public interface Flight {
	
	public void FlightService();
	public double ClassType(int type);
	public double Price(String flightName,double classType, String destination);
	public String Destination(int destnation);
}
