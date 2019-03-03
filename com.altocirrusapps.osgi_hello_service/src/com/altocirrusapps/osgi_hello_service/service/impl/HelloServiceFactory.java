package com.altocirrusapps.osgi_hello_service.service.impl;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import com.altocirrusapps.osgi_hello_service.service.HelloService;

public class HelloServiceFactory implements ServiceFactory {
	
	private int usageCounter = 0;
	
	public Object getService(Bundle bundle, ServiceRegistration registration) {
		System.out.println("create object of HelloService for " + bundle.getSymbolicName());
		++usageCounter;
		System.out.println("number of bundles using service " + usageCounter);
		HelloService helloService = new HelloServiceImpl();
		return helloService;
	}
	
	public void ungetService(Bundle bundle, ServiceRegistration registration, Object service) {
		System.out.println("release object of HelloService for " + bundle.getSymbolicName());
		usageCounter--;
		System.out.println("number of bundles using service " + usageCounter);
	}
}
