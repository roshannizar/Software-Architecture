package com.mtit.service;

import java.util.Scanner;

public class AirAsia implements ServicePublish{
	
	private String flightName;
	private double classType;
	private String destination;
	private String duration;
	private Scanner sc;
	@Override
	public void publishService() {
		
		String varType="";
		int varDestination;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter Class Type: ");
		System.out.println("1. A\n2. B\n3. C\n4. D");
		varType = sc.next();
		
		this.classType = ClassType(varType);
		
		System.out.println("Select a destination: ");
		System.out.println("1. London\n2. Austrailia\n3. Dubai\n4. America");
		varDestination = sc.nextInt();
		
		this.destination = Destination(varDestination);
		
		System.out.println("Your Price for this booking is: "+Price("Air Asia",this.classType,this.destination));
	}

	@Override
	public double ClassType(String type) {

		double value;
		
		switch(type) {
			case "A": value = 30;
			          break;
			case "B": value = 25;
			          break;
			case "C": value = 15;
					  break;
			case "D": value = 10;
					  break;
		    default: value = 0;
		             break;
		}
		
		return value;
	}
	
	@Override
	public double Price(String flightName, double classType, String destination) {

		double price;
		
		switch(flightName) {
			case "Air Asia": 
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
				break;
			default: price = 0;
		}
		
		return price;
	}
	
	@Override
	public String FlightName(int flightId) {

		String name = "";
		
		System.out.println("Enter a flight you prefer: ");
		
		System.out.println("----------------------------");
		System.out.println("1. Emirates\n2. Sri Lankan Airlines\n3. King Fisher\n4. Air Asia");

		switch(flightId) {
			case 1: name = "Emirates";
				    break;
				    
			case 2: name = "Sri Lankan Airlines";
			        break;
			        
			case 3: name = "King Fisher";
			        break;
			        
			case 4: name = "Air Asia";
			        break;
			        
			default:break;
		}
		
		this.flightName = name;
		
		return this.flightName;
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
