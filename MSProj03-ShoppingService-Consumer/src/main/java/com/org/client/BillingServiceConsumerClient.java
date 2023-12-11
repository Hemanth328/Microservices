package com.org.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {

	@Autowired
	private LoadBalancerClient client;
	
	public String getBillingInfo() {
		//Get Billing-service Instance from Eureka Server based on load factor 
		ServiceInstance instance =  client.choose("Billing-Service");
		
		//get Details from Service instance
		
		URI uri = instance.getUri();
		
		//Prepare provider MS Related url to consume certain method
		String url = uri.toString()+"/billing/info";
		
		//create RestTemplate class object to consume the provider service
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		// get response content from response Entity object
		String responseContent = response.getBody();
		
		return responseContent;
		
	}
}
