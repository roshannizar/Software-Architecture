package com.producer;

public interface Flight {
	
	public void getFlightService();
	public double getClassType(int type);
	public double getAmount(double classType, String destination);
	public String getDestination(int destnation);
	public String getDuration(String flightName);
	
}
