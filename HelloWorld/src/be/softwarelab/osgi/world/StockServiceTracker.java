package be.softwarelab.osgi.world;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import be.softwarelab.osgi.stock.service.StockService;

public class StockServiceTracker extends ServiceTracker {
	
	public StockServiceTracker(BundleContext context) {
		super(context, StockService.class.getName(), null);
	}

	public Object addingService(ServiceReference reference) {
		System.out.println("Inside StockServiceTracker.addingService " + reference.getBundle());
		return super.addingService(reference);
	}

	public void removedService(ServiceReference reference, Object service) {
		System.out.println("Inside StockServiceTracker.removedService " + reference.getBundle());
		super.removedService(reference, service);
	}
}
