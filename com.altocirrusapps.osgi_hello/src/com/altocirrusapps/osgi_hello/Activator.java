package com.altocirrusapps.osgi_hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.altocirrusapps.osgi_hello_service.service.HelloService;
/*
 * Code for this project from the OSGi tutorial
 * https://www.javaworld.com/article/2077837/java-se-hello-osgi-part-1-bundles-for-beginners.html
 * 
 * 
 */

public class Activator implements BundleActivator {


	HelloServiceTracker helloServiceTracker;

	public void start(BundleContext context) throws Exception {
		System.out.println("In osgi_hello Activator...");
		
		helloServiceTracker = new HelloServiceTracker(context);
		
		helloServiceTracker.open();
		
		HelloService hs = (HelloService)helloServiceTracker.getService();

		System.out.println(hs.sayHello());
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Goodbye cruel world");
		helloServiceTracker.close();
	}

}
