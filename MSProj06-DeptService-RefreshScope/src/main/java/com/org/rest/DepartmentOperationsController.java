package com.org.rest;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
@RefreshScope
public class DepartmentOperationsController {

	@Value("${dbuser}")
	private String dbusername;
	@Value("${dbpwd}")
	private String dbpassword;
	
	@GetMapping("/show")
	public ResponseEntity<String> showDBDetails() {
		
		return new ResponseEntity<String>("Dept ==> DB Details "+dbusername+"-------"+dbpassword, HttpStatus.OK);
	}
}
