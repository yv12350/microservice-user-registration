package com.yash.microserviceuserregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceUserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserRegistrationApplication.class, args);
	}

}
