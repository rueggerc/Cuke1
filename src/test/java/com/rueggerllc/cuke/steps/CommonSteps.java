package com.rueggerllc.cuke.steps;

import org.springframework.http.ResponseEntity;
import com.rueggerllc.cuke.integration.SpringBootBaseIntegrationTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonSteps extends SpringBootBaseIntegrationTest {
	
	@When("User Wants Controller to say something")
	public void user_Wants_Controller_to_say_something() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		System.out.println("User Wants Controller to say something");
	}

	@Then("Hello Controller Says Hello")
	public void hello_Controller_Says_Hello() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		
		ResponseEntity<String> helloResponse = testRestTemplate.getForEntity("/v1/hello/sayHello",String.class);
		System.out.println("HELLO RESPONSE=" + helloResponse.getBody());
		
		
	}

}
