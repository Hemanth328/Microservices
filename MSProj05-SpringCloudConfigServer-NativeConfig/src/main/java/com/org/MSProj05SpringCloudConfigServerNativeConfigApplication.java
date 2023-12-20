package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MSProj05SpringCloudConfigServerNativeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSProj05SpringCloudConfigServerNativeConfigApplication.class, args);
	}
}
