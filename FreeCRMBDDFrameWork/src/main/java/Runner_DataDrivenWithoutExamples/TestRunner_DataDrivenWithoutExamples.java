package Runner_DataDrivenWithoutExamples;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\SeleniumCucumberWorkSpace\\FreeCRMBDDFrameWork\\src\\main\\java\\Features_DataDrivenWithoutExamples\\login_DataDrivenWithoutExamples.feature"
		,glue={"stepDefinitions_DataDrivenWithoutExamples"},
		format = {"pretty","html:test-output"},
		dryRun = false
		)

public class TestRunner_DataDrivenWithoutExamples {

}
