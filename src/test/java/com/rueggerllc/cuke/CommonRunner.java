package com.rueggerllc.cuke;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rueggerllc.cuke.steps.ControllerSteps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		strict=true,
		dryRun=false,
		// tags={"@card or @belly or @login or @controller"},
		// tags={"@belly or @login"},
		// tags={"@card"},
		tags={"@controller"},
		glue="com.rueggerllc.cuke.steps",
		features="src/test/resources/features",
		plugin= {
          // "pretty"
		  "html:target/cucumber-reports/cucumber-pretty",
          "testng:target/cuke/TEST-cucumber-testng.xml",
          "json:target/cuke/cucumber.json"
        }
)

// Execution priority: TestNG’s @BeforeClass → Cucumber’s @Before → 
// Cucumber Background → Cucumber Scenario → Cucumber’s @After → TestNG’s @AfterClass

// @Test
@SpringBootTest(classes= {Cuke1Application.class,ControllerSteps.class})
public class CommonRunner extends AbstractTestNGSpringContextTests {
// public class CommonRunner extends AbstractTestNGCucumberTests {
	
  private TestNGCucumberRunner testNGCucumberRunner;
  
  @BeforeClass(alwaysRun=true)
  public void setUpClass() throws Exception {
      testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
  }
  
  @Test(groups="cucumber", description="Runs Cucumber Scenarios", dataProvider="scenarios")
  public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
  	testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
  }

  @DataProvider
  public Object[][] scenarios() {
  	return testNGCucumberRunner.provideScenarios();
  }

  @AfterClass(alwaysRun = true)
  public void tearDownClass() throws Exception {
      testNGCucumberRunner.finish();
  }
	
}

//public class CommonRunner  {
//
//    private TestNGCucumberRunner testNGCucumberRunner;
//    
//    @BeforeClass(alwaysRun=true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//    
//    @Test(groups="cucumber", description="Runs Cucumber Scenarios", dataProvider="scenarios")
//    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
//    	testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
//    }
// 
//    @DataProvider
//    public Object[][] scenarios() {
//    	return testNGCucumberRunner.provideScenarios();
//    }
// 
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
//    
//}
