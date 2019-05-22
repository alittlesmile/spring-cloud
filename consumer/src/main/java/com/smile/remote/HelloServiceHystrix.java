package com.smile.remote;

public class HelloServiceHystrix implements HelloService{

	@Override
	public String getHello(String name) {
		return "hello "+name+",this is hystrix!";
	}

}
