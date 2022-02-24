package com.katwdojo.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/daikichi")

public class DaikichiController {

	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String luckToday() {
		return "Today you will find luck in your endeavors!!";
	}
	
	@RequestMapping("/tomorrow")
	public String luckTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!!";
	}
}

