package com.altocirrusapps.osgi_hello_service.service.impl;

import com.altocirrusapps.osgi_hello_service.service.HelloService;

public class HelloServiceImpl implements HelloService {
	public String sayHello() {
		System.out.println("I'm the service!");
		return "Hello World, from the osgi_hello_service serviceImpl!!!";
	}
}
