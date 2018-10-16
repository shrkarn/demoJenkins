package com.cg;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld {
	public String sayHello()
	{
		return "Hello";
	}
}
