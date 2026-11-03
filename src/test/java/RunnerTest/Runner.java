package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources/featureFiles/demowebshop_login.feature",
		glue = "CucumberTest",
		publish = true,
		plugin = {"pretty","html:target/output.html"}
		
		)


public class Runner {

}
