package com.virtusa.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SampleService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleService1Application.class, args);
	}

}
