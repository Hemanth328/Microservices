package com.org.timer;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DisplayDateTime {
	
	@Scheduled(fixedDelay = 10, initialDelay = 20)
	public void showTime() {
//		System.out.println("DisplayDateTime.showTime() ::"+new Date());
	}
}
