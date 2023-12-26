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
@RequestMapping("/shopping")
public class ShoppingOperationsController {
	
	@Autowired
	private RestTemplate template;
	
	Logger logger = LoggerFactory.getLogger(ShoppingOperationsController.class);
	
	@GetMapping("/shop")
	public ResponseEntity<String> shopping() {
		
		logger.info("Welcome to shopping module --> shopping() with GET");
		
		ResponseEntity<String> result = template.getForEntity("http://localhost:9092/billing/bill", String.class);
		
		logger.info("Exiting from shopping module --> shopping() with GET");
		
		return new ResponseEntity<String>("shopping = "+result.getBody(), HttpStatus.OK);
				
	}
}
