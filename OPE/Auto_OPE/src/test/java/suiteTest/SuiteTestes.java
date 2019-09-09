package suiteTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		features = "src.test.java.teste",
		glue = {"src.test.java.stepGherkin"},
		tags = {"@TEST", "@OPE_AUTO_001"}
)

public class SuiteTestes {
}