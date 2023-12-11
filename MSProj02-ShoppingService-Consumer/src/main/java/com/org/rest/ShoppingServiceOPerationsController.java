package com.org.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceOPerationsController {
	
	@Autowired
	private BillingServiceConsumerClient client;
	
	@GetMapping("/cart")
	public ResponseEntity<String> doshopping() {
		
		String result = client.getBillingInfo();
		return new ResponseEntity<String>("Bill for Shirt, Pant and Trouser "+result, HttpStatus.OK);
	}
}
