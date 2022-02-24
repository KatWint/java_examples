package com.katwdojo.hellohuman.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController 
public class Human {
	
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value="n", required=false) String name) {
		if (name==null) {
			return "Hello Human";
		}else return "Hello " + name;
	}
}
