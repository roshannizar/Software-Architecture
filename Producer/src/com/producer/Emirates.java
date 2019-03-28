package com.producer;

import java.util.Scanner;

public class Emirates implements Flight {
	
	private String flightName = "Estimates";
	private double classType;
	private String destination;
	private Scanner sc;
	
	@Override 
	public void getFlightService() {
		
		int varType,varDestination;
		
		sc = new Scanner(System.in);
		
		System.out.println("\nSelect a class type: \n");
		System.out.println("1. A\n2. B\n3. C\n4. D\n");
		varType = sc.nextInt();
		
		this.classType = getClassType(varType);
		
		System.out.println("\nSelect a destination: \n");
		System.out.println("1. London\n2. Austrailia\n3. Dubai\n4. America\n");
		varDestination = sc.nextInt();
		
		this.destination = getDestination(varDestination);
		
		System.out.println("Your Price for this booking is: "+getAmount(this.classType,this.destination) + " and duration will be "+getDuration(this.flightName));
	}
	
	@Override
	public double getClassType(int type) {
		
		double value;
		
		switch(type) {
			case 1: value = 25;
			          break;
			case 2: value = 20;
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
	public double getAmount(double classType,String destination) {
		
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
	public String getDestination(int destination) {
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
	
	@Override 
	public String getDuration(String flightName) {
		return "5 Hours";
	}
}
