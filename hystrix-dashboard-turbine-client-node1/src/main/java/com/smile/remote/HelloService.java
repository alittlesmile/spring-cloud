package com.smile.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "producer",fallback = HelloServiceHystrix.class)
public interface HelloService {
	
	@RequestMapping("/getHello")
	public String getHello1(@RequestParam String name);
}
