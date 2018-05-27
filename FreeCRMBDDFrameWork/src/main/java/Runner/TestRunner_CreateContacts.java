package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\SeleniumCucumberWorkSpace\\FreeCRMBDDFrameWork\\src\\main\\java\\Features\\contacts.feature"
		,glue={"stepDefinitions_DataDrivenWithExamples2"},
		format = {"pretty","html:test-output"},
		monochrome = true,
		dryRun = false,
		strict = true
		
		)

public class TestRunner_CreateContacts {

}
