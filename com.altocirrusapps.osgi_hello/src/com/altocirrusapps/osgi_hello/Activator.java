package com.altocirrusapps.osgi_hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.altocirrusapps.osgi_hello_service.service.HelloService;





public class Activator implements BundleActivator {


	ServiceReference helloServiceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("In osgi_hello Activator...");
		
		helloServiceReference = context.getServiceReference(HelloService.class.getName());
		HelloService hs = (HelloService)context.getService(helloServiceReference);

		System.out.println(hs.sayHello());
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Goodbye cruel world");
	}

}
