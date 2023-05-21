package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test

@CucumberOptions(
		
		features ="./Features/Login.feature",
		glue={"stepDefinitions","Hooks"},
		monochrome=true
		
		
		
		)





public class RunnerFile extends AbstractTestNGCucumberTests {
	

}
