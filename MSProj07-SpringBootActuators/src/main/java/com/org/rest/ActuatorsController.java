package com.org.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuators")
public class ActuatorsController {

	@GetMapping("/method1")
	public ResponseEntity<String> actuatormethod1() {
		return new ResponseEntity<String>("This is a actuator method 1", HttpStatus.OK);
	}
}
