package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\git\\Senthil-Cucumber-Project\\FreeCRMBDDFrameWork\\src\\main\\java\\Features\\deals.feature"
		,glue={"stepDefinitions_DataDrivenWithTables"},
		format = {"pretty","html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		)

public class TestRunner_Deals {

}
