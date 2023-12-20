package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj06EmpServiceRefreshScopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj06EmpServiceRefreshScopeApplication.class, args);
	}

}
