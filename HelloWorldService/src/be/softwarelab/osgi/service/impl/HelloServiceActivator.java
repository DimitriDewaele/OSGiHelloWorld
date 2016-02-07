package be.softwarelab.osgi.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import be.softwarelab.osgi.service.HelloService;
import be.softwarelab.osgi.service.HelloServiceFactory;

public class HelloServiceActivator implements BundleActivator {

	ServiceRegistration helloServiceRegistration;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
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
		helloServiceRegistration.unregister();
	}

}
