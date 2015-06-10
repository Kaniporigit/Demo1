package com.ht.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@RequestMapping(value="/user/{name}",method = RequestMethod.GET)
	public ResponseEntity<Boolean> getMessage(@PathVariable("name")String name) {
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
