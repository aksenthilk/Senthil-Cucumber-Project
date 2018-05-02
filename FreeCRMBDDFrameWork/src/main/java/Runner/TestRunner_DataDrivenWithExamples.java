package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\SeleniumCucumberWorkSpace\\FreeCRMBDDFrameWork\\src\\main\\java\\Features_DataDrivenWithExamples\\login_DataDrivenWithExamples.feature"
		,glue={"stepDefinitions_DataDrivenWithExamples"},
		format = {"pretty","html:test-output"},
		strict = true,
		monochrome = true,
		dryRun = false
		)

public class TestRunner_DataDrivenWithExamples {

}
