package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions
		(
		features="Features",
		glue={"StepDefintions","Hooks"},
		dryRun=false,
		plugin= {"pretty","html:test-output",
				"json:test-output/jsonreport.json"}
				)
public class TestRun {
	
	

}
