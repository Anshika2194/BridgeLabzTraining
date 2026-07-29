package com.example.Gpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //optional
public class GpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpayApplication.class, args);
	}

}
