package com.org.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/billing")
public class BillingOperationsController {
	
	@Autowired
	private RestTemplate template;
	
	Logger logger = LoggerFactory.getLogger(BillingOperationsController.class);
	
	@GetMapping("/bill")
	public ResponseEntity<String> billing() {
		
		logger.info("Welcome to billing module --> billing() with GET");
		
		ResponseEntity<String> result = template.getForEntity("http://localhost:9093/payment/pay", String.class);
		
		logger.info("Exiting from billing module --> billing() with GET");
		
		return new ResponseEntity<String>("billing = "+result.getBody(), HttpStatus.OK);
				
	}
}
