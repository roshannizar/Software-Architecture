package com.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.producer.Flight;

public class ConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Consumer Service");
		serviceReference = bundleContext.getServiceReference(Flight.class.getName());
		Flight servicePublish = (Flight) bundleContext.getService(serviceReference);
		servicePublish.getFlightService();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Consumer Stopped!");
		bundleContext.ungetService(serviceReference);
	}

}
