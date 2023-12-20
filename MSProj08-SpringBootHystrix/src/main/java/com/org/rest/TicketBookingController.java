package com.org.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/ticket")
public class TicketBookingController {

	@GetMapping("/booking")
	@HystrixCommand(fallbackMethod = "dummyBookTickets", commandProperties = {
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"), // back to exception count
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliSeconds", value = "10000") // retry time

	})
	public String bootickets() {
		System.out.println("TicketBookingController.bootickets()");

		if (new Random().nextInt(10) < 8) {
			throw new IllegalArgumentException("Problem in ticket booking");
		}
		System.out.println("End of Ticket Booking OPeration");
		return "Tickets Booked Successfully";
	}

	int count = 0;

	public String dummyBookTickets() { // this method should not have parameters
		count++;
		System.out.println("TicketBookingController.dummyBookTickets() " + count);
		return "Sorry for the Inconvience, some problem araised while booking ticket";
	}
}
