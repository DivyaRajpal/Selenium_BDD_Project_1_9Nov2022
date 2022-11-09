package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features",
		glue = {"stepdefinition","hooks"},
		monochrome = true,  //show the formatted output in console
		plugin = {"pretty","html:target/htmlreport"}
				
		)

public class testrunnerclass {

}
