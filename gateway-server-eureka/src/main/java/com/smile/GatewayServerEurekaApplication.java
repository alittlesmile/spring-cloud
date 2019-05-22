package com.smile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerEurekaApplication.class, args);
	}

}
