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
@RequestMapping("/payment")
public class PaymentOperationsController {
	
	@Autowired
	private RestTemplate template;
	
	Logger logger = LoggerFactory.getLogger(PaymentOperationsController.class);
	
	@GetMapping("/pay")
	public ResponseEntity<String> payment() {
		
		logger.info("Welcome to payment module --> payment() with GET");
		
		logger.info("Exiting from payment module --> payment() with GET");
		
		return new ResponseEntity<String>("Payment Completed successfully ", HttpStatus.OK);
				
	}
}
