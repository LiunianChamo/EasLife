package com.liunian.photoAny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAnyApplication {
	public static void main(String args[]) {
		SpringApplication.run(PhotoAnyApplication.class, args);
	}
}
