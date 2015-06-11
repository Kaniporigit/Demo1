package com.ht.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {

//	@RequestMapping(value = { "/", "/helloworld**" }, method = RequestMethod.GET)
//	public ModelAndView welcomePage() {
// System.out.println("I am called for index page");
//		ModelAndView model = new ModelAndView();
//		model.addObject("title", "Spring Security 3.2.3 Hello World Application");
//		model.addObject("message", "Welcome Page !");
//		model.setViewName("helloworld");
//		return model;
// 
//	}
	@RequestMapping(value="/user/{name}",method = RequestMethod.GET)
	public ResponseEntity<Boolean> getMessage(@PathVariable("name")String name) {
		System.out.println("working");
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}
	// customize the error message
		private String getErrorMessage(HttpServletRequest request, String key) {

			Exception exception = (Exception) request.getSession().getAttribute(key);

			String error = "";
			if (exception instanceof BadCredentialsException) {
				error = "Invalid username and password!";
			} else if (exception instanceof LockedException) {
				error = exception.getMessage();
			} else {
				error = "Invalid username and password!";
			}

			return error;
		}
//	@RequestMapping(value = "/protected**", method = RequestMethod.GET)
//	public ModelAndView protectedPage() {
// 
//		ModelAndView model = new ModelAndView();
//		model.addObject("title", "Spring Security 3.2.3 Hello World");
//		model.addObject("message", "This is protected page - Only for Administrators !");
//		model.setViewName("protected");
// 		return model;
// 
//	}
// 
//	@RequestMapping(value = "/confidential**", method = RequestMethod.GET)
//	public ModelAndView superAdminPage() {
// 
//		ModelAndView model = new ModelAndView();
//		model.addObject("title", "Spring Security 3.2.3 Hello World");
//		model.addObject("message", "This is confidential page - Need Super Admin Role !");
//		model.setViewName("protected");
// 
//		return model;
// 
//	}
	

}
