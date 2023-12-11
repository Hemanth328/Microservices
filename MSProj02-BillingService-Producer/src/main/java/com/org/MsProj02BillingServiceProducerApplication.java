package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj02BillingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj02BillingServiceProducerApplication.class, args);
	}

}
