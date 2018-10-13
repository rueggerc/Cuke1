package com.rueggerllc.cuke.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET,value="/sayHello",produces={"application/json"})
	public ResponseEntity<String> sayHello() {
		System.out.println("SAY HELLO BEGIN");
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

}
