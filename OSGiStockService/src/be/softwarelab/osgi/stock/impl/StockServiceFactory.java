package be.softwarelab.osgi.stock.impl;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import be.softwarelab.osgi.stock.service.StockService;


	public class StockServiceFactory implements ServiceFactory{
		
	    private int usageCounter = 0;
	    
	    public Object getService(Bundle bundle, ServiceRegistration registration) {
	        System.out.println("Create object of HelloService for " + bundle.getSymbolicName());
	        usageCounter++;
	        System.out.println("Number of bundles using service " + usageCounter);
	        StockService stockService = new StockServiceImpl();
	        return stockService;
	    }
	    
	    public void ungetService(Bundle bundle, ServiceRegistration registration, Object service) {
	        System.out.println("Release object of HelloService for " + bundle.getSymbolicName());
	        usageCounter--;
	        System.out.println("Number of bundles using service " + usageCounter);
	    }
	}