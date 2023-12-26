package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj09DistributedTracingAndLogging1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj09DistributedTracingAndLogging1Application.class, args);
	}
	

	@Bean
	public Sampler createSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Bean
	public RestTemplate createTemplate() {
		return new RestTemplate();
	}
}
