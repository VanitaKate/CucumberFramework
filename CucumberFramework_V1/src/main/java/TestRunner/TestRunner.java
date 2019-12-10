package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


//@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

@CucumberOptions(
		features=".//Features/",
		glue="StepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"Pretty","html:test-otput"}
		
		
		)
public class TestRunner {
}
