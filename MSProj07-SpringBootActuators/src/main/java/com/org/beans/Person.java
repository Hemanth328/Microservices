package com.org.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "per")
@Component
@Data
public class Person {
	private String name;
	private String addrs;
	private int age;
		
}
