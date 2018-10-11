package com.rueggerllc.cuke.steps;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ControllerSteps {
	
	private ControllerStepsService service;
	
	@Autowired
	public ControllerSteps(ControllerStepsService service) {
		this.service = service;
	}

	@When("User Has Data to Insert")
	public void user_Has_Data_to_Insert() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("USER HAS DATA TO INSERT");
	}

	@Then("Data is Inserted Into Database")
	public void data_is_Inserted_Into_Database() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("INSERTING DATA");
		System.out.println("Service=" + service);
	}

}
