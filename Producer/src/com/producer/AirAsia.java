package com.producer;

import java.util.Scanner;

public class AirAsia implements Flight{
	
	private double classType;
	private String destination;
	private Scanner sc;
	
	@Override
	public void getFlightService() {
		
		int varType,varDestination;
		
		sc = new Scanner(System.in);
		
		System.out.println("\nSelect a class type: \n");
<<<<<<< HEAD
		System.out.println("1. A\n2. B\n3. C\n4. D \n");
=======
		System.out.print("1. A\n2. B\n3. C\n4. D\n");
>>>>>>> e4a6ea5928710be08efa1fcc2a41951e17628251
		varType = sc.nextInt();
		
		while (varType < 1 || varType > 4) {
			System.out.println("\nSelect a valid class type: \n");
			System.out.println("1. A\n2. B\n3. C\n4. D \n");
			varType = sc.nextInt();
		}
		
		this.classType = getClassType(varType);
		
<<<<<<< HEAD
		System.out.println("Select a destination: \n");
		System.out.println("1. London\n2. Australia\n3. Dubai\n4. America \n");
=======
		System.out.println("Select a destination: ");
		System.out.print("1. London\n2. Austrailia\n3. Dubai\n4. America\n");
>>>>>>> e4a6ea5928710be08efa1fcc2a41951e17628251
		varDestination = sc.nextInt();
		System.out.println("Select a valid destination: \n");
		System.out.println("1. London\n2. Australia\n3. Dubai\n4. America \n");
		varDestination = sc.nextInt();
//		while (varType < 1 || varType > 4) {
//			System.out.println("\nSelect a valid destination: \n");
//			System.out.println("1. London\n2. Australia\n3. Dubai\n4. America \n");
//			varDestination = sc.nextInt();
//		}
		
		this.destination = getDestination(varDestination);
		
		System.out.println("\nYour Price for this booking is: "+getAmount(this.classType,this.destination) + " and duration will be "+getDuration(this.destination)+"\n\n");
		System.out.println("---------  Flight Booking --------------\n");
		System.out.println("Destination : "+this.destination +"\nPrice : "+getAmount(this.classType,this.destination) +"\nDuration : "+getDuration(this.destination) );
		System.out.println("\n---------  Thank You for Using Our System. --------------");
	}
	
	@Override
	public double sendAmount() {
		return this.getAmount(this.classType, this.destination);
	}

	@Override
	public double getClassType(int type) {

		double value;
		
		switch(type) {
			case 1: value = 30;
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
			case "London": price = classType * 35000;
					       break;
					     
			case "Australia": price = classType * 90000;
					          break;
					     
			case "Dubai": price = classType * 120000;
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
