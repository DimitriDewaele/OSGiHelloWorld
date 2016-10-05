package be.softwarelab.osgi.stock;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import be.softwarelab.osgi.stock.impl.StockServiceFactory;
import be.softwarelab.osgi.stock.service.StockService;

public class Activator implements BundleActivator {

	ServiceRegistration stockServiceRegistration;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("StockService: START");
		StockServiceFactory stockServiceFactory = new StockServiceFactory();
		stockServiceRegistration = context.registerService(StockService.class.getName(), stockServiceFactory, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("StockService: STOP");
		stockServiceRegistration.unregister();
	}

}
