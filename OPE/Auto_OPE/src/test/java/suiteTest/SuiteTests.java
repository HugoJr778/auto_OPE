package suiteTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		dryRun = false,
		features = "src//test//java//teste",
		glue = {"stepGherkin",
				"logicsSteps.ope001",
				"logicsSteps.ope002"},
		
		tags = {"@OPE_AUTO_001, @OPE_AUTO_002"}
)

public class SuiteTests {
}