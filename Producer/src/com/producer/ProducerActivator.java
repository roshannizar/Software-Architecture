package com.producer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ProducerActivator implements BundleActivator {

	private Scanner sc;
	private int flightType;
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Producer Start");
		sc= new Scanner(System.in);
		Flight publisherService;
	
		System.out.println("Flight Booking");
		System.out.println("1. Emirates\n2. Sri Lankan Air Lines\n3. King Fisher\n4. Air Asia");
		System.out.println("Select your pefered flight id: ");
		
		flightType = sc.nextInt();
		
		switch(flightType) {
		
			case 1: publisherService = new Emirates();
					break;
			case 4: publisherService = new AirAsia();
					break;
			
			default: publisherService = new Emirates();
		}
		
		publishServiceRegistration = bundleContext.registerService(Flight.class.getName(), publisherService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Producer Stop!");
		publishServiceRegistration.unregister();
	}

}
