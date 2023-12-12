package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MsProj04ShoppingServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj04ShoppingServiceConsumerApplication.class, args);
	}

}
