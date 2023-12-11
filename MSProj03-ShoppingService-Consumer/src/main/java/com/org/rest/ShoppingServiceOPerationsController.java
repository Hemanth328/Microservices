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
	public ResponseEntity<String> lbDoShopping() {
		String result = client.getBillingInfo();
		
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return new ResponseEntity<String>("Bill for Shirt, Pant and Trouser from Load Balancer Client "+result, HttpStatus.OK);
	}
	
}
