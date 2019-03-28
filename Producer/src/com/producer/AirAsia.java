package com.producer;

import java.util.Scanner;

public class AirAsia implements Flight{
	
	private String flightName = "Air Asia";
	private double classType;
	private String destination;
	private String duration;
	private Scanner sc;
	@Override
	public void FlightService() {
		
		int varType,varDestination;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter Class Type: ");
		System.out.println("1. A\n2. B\n3. C\n4. D");
		varType = sc.nextInt();
		
		this.classType = ClassType(varType);
		
		System.out.println("Select a destination: ");
		System.out.println("1. London\n2. Austrailia\n3. Dubai\n4. America");
		varDestination = sc.nextInt();
		
		this.destination = Destination(varDestination);
		
		System.out.println("Your Price for this booking is: "+Price(flightName,this.classType,this.destination));
	}

	@Override
	public double ClassType(int type) {

		double value;
		
		switch(type) {
			case 1: value = 30;
			          break;
			case 2: value = 25;
			          break;
			case 3: value = 15;
					  break;
			case 4: value = 10;
					  break;
		    default: value = 0;
		             break;
		}
		
		return value;
	}
	
	@Override
	public double Price(String flightName, double classType, String destination) {

		double price;
		
		switch(destination) {
			case "London": price = classType * 50000;
					       break;
					     
			case "Australia": price = classType * 120000;
					          break;
					     
			case "Dubai": price = classType * 135000;
					      break;
					     
			case "America": price = classType * 145000;
					        break;
					     
		    default: price = 0;
					 break;
		}
		
		return price;
	}
	
	@Override
	public String Destination(int destination) {
		String dest = "";
		
		switch(destination) {
		
			case 1: dest = "London";
						   break;
						   
			case 2: dest = "Austrailia";
			               break;
			               
			case 3: dest = "Dubai";
			               break;
			               
			case 4: dest = "America";
			               break;
			               
			default: dest = null;
			                break;
		}
		
		return dest;
	}
}
