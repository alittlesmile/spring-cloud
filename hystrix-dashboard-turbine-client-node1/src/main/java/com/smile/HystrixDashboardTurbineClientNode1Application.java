package com.smile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableCircuitBreaker
@EnableEurekaClient
public class HystrixDashboardTurbineClientNode1Application {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardTurbineClientNode1Application.class, args);
	}

}
