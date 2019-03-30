package com.producer;

import java.util.Scanner;

public class Airlines implements Flight{
	
	private double classType;
	private String destination;
	private Scanner sc;
	
	@Override
	public void getFlightService() {
		
		int varType,varDestination;
		
		sc = new Scanner(System.in);
		
		System.out.println("\nSelect a class type: \n");
		System.out.print("1. A\n2. B\n3. C\n4. D");
		varType = sc.nextInt();
		
		this.classType = getClassType(varType);
		
		System.out.println("Select a destination: ");
		System.out.print("1. London\n2. Austrailia\n3. Dubai\n4. America");
		varDestination = sc.nextInt();
		
		this.destination = getDestination(varDestination);
		
		System.out.println("Your Price for this booking is: "+getAmount(this.classType,this.destination) + " and duration will be "+getDuration(this.destination));
	
	}
	
	@Override
	public double sendAmount() {
		return this.getAmount(this.classType, this.destination);
	}

	@Override
	public double getClassType(int type) {

		double value;
		
		switch(type) {
			case 1: value = 40;
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
	public double getAmount(double classType, String destination) {

		double price;
		
		switch(destination) {
			case "London": price = classType * 25000;
					       break;
					     
			case "Australia": price = classType * 40000;
					          break;
					     
			case "Dubai": price = classType * 20000;
					      break;
					     
			case "America": price = classType * 135000;
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
						   
			case 2: dest = "Australia";
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
	public String getDuration(String destination) {
		
		String hours = "";
		
		switch(destination) {
			
			case "London": hours = "8 Hours";
						   break;
			case "Australia": hours = "10 Hours";
							  break;
			case "Dubai": hours = "4 Hours";
						  break;
			case "America": hours= "12 Hours";
							break;			
			default: break;
		
		}
		
		return hours;	
	}
}
