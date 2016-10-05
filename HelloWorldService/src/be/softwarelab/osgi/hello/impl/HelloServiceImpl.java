package be.softwarelab.osgi.hello.impl;

import be.softwarelab.osgi.hello.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
    public String sayHello() {
        System.out.println("Inside HelloServiceImpl.sayHello()");
        return "Say Hello";
    }

}
