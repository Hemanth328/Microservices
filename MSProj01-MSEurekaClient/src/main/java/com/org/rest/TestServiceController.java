package com.org.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/service")
public class TestServiceController {
	
	@GetMapping("/show")
	public ResponseEntity<String> showMessage() {
		return new ResponseEntity<String>("Welcome To SpringBoot Microservices", HttpStatus.OK);
	}

}
