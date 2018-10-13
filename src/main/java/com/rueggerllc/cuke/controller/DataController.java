package com.rueggerllc.cuke.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rueggerllc.cuke.beans.OrderData;

@RestController
@RequestMapping("/v1/data")
public class DataController {
	
	@RequestMapping(method=RequestMethod.POST,value="/insertData",produces={"application/json"})
	public ResponseEntity<String> insertData(@RequestBody OrderData data) {
		System.out.println("INSERT DATA=\n" + data);
		return new ResponseEntity<String>("Order Data Saved to Database", HttpStatus.OK);
	}

}
