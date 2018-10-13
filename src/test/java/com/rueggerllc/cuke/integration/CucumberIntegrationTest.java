package com.rueggerllc.cuke.integration;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		strict=true,
		dryRun=false,
		tags={"@hellocontroller"},
		// tags={"@hellocontroller or @datacontroller"},
		glue="com.rueggerllc.cuke.steps",
		features="src/test/resources/features",
		plugin= {
          "pretty",
		  "html:target/cucumber-reports/cucumber-pretty",
          "testng:target/cuke/TEST-cucumber-testng.xml",
          "json:target/cuke/cucumber.json"
        }
)
public class CucumberIntegrationTest extends AbstractTestNGCucumberTests {
	
}