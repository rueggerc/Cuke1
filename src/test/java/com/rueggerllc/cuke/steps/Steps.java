package com.rueggerllc.cuke.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^I have (\\d+) cukes in my belly$")
	public void i_have_cukes_in_my_belly(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("GOT CUKES=" + arg1);
	    // throw new PendingException();
	}

	@When("^I wait (\\d+) hour$")
	public void i_wait_hour(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("WAIT=" + arg1);
	    // throw new PendingException();
	}

	@Then("^my belly should growl$")
	public void my_belly_should_growl() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
