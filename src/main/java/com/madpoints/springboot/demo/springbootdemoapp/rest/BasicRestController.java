package com.madpoints.springboot.demo.springbootdemoapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {
	
	// inject custom properties
	@Value("${leader.name}")
	private String leaderName;
	
	@Value("${guild.name}")
	private String guildName;
	
	@GetMapping("/guildInfo")
	public String getGuildInfo() {
		
		return "Leader: " + leaderName + ", Guild name: " + guildName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello World! Time on the server is: " + LocalDateTime.now();
	}

	@GetMapping("/workout")
	public String getDailyWorkout() {
		
		return "Run a 5k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		
		return "You will run like the wind";
	}
}
