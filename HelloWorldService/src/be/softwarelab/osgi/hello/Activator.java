package be.softwarelab.osgi.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import be.softwarelab.osgi.hello.impl.HelloServiceFactory;
import be.softwarelab.osgi.hello.service.HelloService;

public class Activator implements BundleActivator {

	ServiceRegistration helloServiceRegistration;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("HelloService: START");
		HelloServiceFactory helloServiceFactory = new HelloServiceFactory();
		helloServiceRegistration = context.registerService(HelloService.class.getName(), helloServiceFactory, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("HelloService: STOP");
		helloServiceRegistration.unregister();
	}

}
