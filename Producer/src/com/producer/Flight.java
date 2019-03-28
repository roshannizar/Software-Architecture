package com.producer;

public interface Flight {
	
	public void FlightService();
	public double ClassType(int type);
	public double Price(double classType, String destination);
	public String Destination(int destnation);
}
