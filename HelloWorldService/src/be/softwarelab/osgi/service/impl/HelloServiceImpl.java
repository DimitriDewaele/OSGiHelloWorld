package be.softwarelab.osgi.service.impl;

import be.softwarelab.osgi.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
    public String sayHello() {
        System.out.println("Inside HelloServiceImpl.sayHello()");
        return "Say Hello";
    }

}
