package com.mtit.service;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	private Scanner sc;
	private int flightType;
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Start");
		sc= new Scanner(System.in);
		ServicePublish publisherService;
	
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
		
		publishServiceRegistration = bundleContext.registerService(ServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
