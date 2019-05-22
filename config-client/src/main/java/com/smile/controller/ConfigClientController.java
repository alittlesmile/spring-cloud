package com.smile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${name}")
	String name;
	@Value("${age}")
	String age;
	
	@RequestMapping("/hello")
	public String hello() {
		return "name:"+name+",age:"+age;
	}
}
