package com.smile.remote;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService{

	@Override
	public String getHello(String name) {
		return "hello "+name+",this is hystrix!";
	}

}
