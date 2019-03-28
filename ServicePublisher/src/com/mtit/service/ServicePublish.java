package com.mtit.service;

public interface ServicePublish {
	
	public void publishService();
	public double ClassType(String type);
	public double Price(String flightName,double classType, String destination);
	public String FlightName(int flightId);
	public String Destination(int destnation);
}
