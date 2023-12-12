package com.org.rest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.client.IBillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceOPerationsController {
	
	@Autowired
	private IBillingServiceConsumerClient client;
	
	@GetMapping("/cart")
	public ResponseEntity<String> doshopping() {
		System.out.println("Proxy Class name = "+client.getClass()+"   "+Arrays.toString(client.getClass().getInterfaces()));
		
		String result = client.fetchBillinginfo().getBody();
//		                  (OR)
//		ResponseEntity<String> result = client.fetchBillinginfo();
		
		return new ResponseEntity<String>("Bill for Shirt, Pant and Trouser "+result, HttpStatus.OK);
	}
}
