package com.altocirrusapps.osgi_hello_service.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.altocirrusapps.osgi_hello_service.service.HelloService;

public class HelloServiceActivator implements BundleActivator {
	ServiceRegistration helloServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("in HelloServiceActivator....");
		HelloServiceFactory helloServiceFactory = new HelloServiceFactory();
		helloServiceRegistration = context.registerService(HelloService.class.getName(), helloServiceFactory, null);
		
	}
	
	public void stop(BundleContext context) throws Exception {
		helloServiceRegistration.unregister();
	}
}
