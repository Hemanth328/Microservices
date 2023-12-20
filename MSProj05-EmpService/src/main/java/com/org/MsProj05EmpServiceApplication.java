package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj05EmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj05EmpServiceApplication.class, args);
	}

}
