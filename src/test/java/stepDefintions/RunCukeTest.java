package stepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		//pretty:target/cucumber-json-report.json
		features = "classpath:features"
)

public class RunCukeTest {
}
