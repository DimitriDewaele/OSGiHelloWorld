package be.softwarelab.osgi.world;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import be.softwarelab.osgi.hello.service.HelloService;
import be.softwarelab.osgi.stock.service.StockService;

public class Activator implements BundleActivator {
	
    HelloServiceTracker helloServiceTracker;
    StockServiceTracker stockServiceTracker;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
        System.out.println("Hello World!!");
        
        helloServiceTracker= new HelloServiceTracker(context);
        helloServiceTracker.open();
        HelloService helloService = (HelloService)helloServiceTracker.getService();
        
        stockServiceTracker= new StockServiceTracker(context);
        stockServiceTracker.open();
        StockService stockService = (StockService)stockServiceTracker.getService();
        
        System.out.println(helloService.sayHello());
        System.out.println(stockService.getStockPrice("CISCO"));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
        helloServiceTracker.close();
	}

}
