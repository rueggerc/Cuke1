package com.rueggerllc.cuke.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	@Given("I have {int} cukes in my belly")
	public void i_have_cukes_in_my_belly(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("GIVEN=" + int1);
	}

	@Given("I reduce the number of cukes")
	public void i_reduce_the_number_of_cukes() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("REDUCE");
	}

	@When("I wait {int} hour")
	public void i_wait_hour(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("WAIT");
	}

	@Then("my belly should growl")
	public void my_belly_should_growl() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("GROWL");
	}
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("User Navigates to Login Page")
	public void user_Navigates_to_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("User enters Username and Password")
	public void user_enters_Username_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("Message is displayed Login Succeeded")
	public void message_is_displayed_Login_Succeeded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("User LogOut from the Application")
	public void user_LogOut_from_the_Application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("Message Displayed Logout Succeeded")
	public void message_Displayed_Logout_Succeeded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
//	@Given("a member provided an access number {int}")
//	public void a_member_provided_an_access_number(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("an application is submitted")
//	public void an_application_is_submitted() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("the application details should be saved for future use")
//	public void the_application_details_should_be_saved_for_future_use() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("a card number is requested by providing the member access number from TSYS API")
//	public void a_card_number_is_requested_by_providing_the_member_access_number_from_TSYS_API() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("TSYS API should return a card number")
//	public void tsys_API_should_return_a_card_number() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

}
