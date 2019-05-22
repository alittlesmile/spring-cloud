package com.smile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	@RequestMapping("/getHello")
	public String getGetHello(@RequestParam String name) {
		return "hello "+name+",this is producer 1";
	}
}
