package com.ht.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@RequestMapping(value="/user/{name}",method = RequestMethod.GET, headers = "Accept=application/json")
	public String getMessage(@PathVariable("name")String name) {
		return "Hello this is my welcome message... "+name;
	}
}
