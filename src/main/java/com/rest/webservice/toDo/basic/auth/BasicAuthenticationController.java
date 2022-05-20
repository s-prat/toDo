package com.rest.webservice.toDo.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class BasicAuthenticationController {
	
	@GetMapping(path="basicAuth")
	public AuthenticationBean basicAuth() {
		System.out.println("inside authentication");
		return new AuthenticationBean("You are authenticated");
	}

}
