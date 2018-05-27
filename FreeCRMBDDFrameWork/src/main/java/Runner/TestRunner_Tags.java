package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		          features = "G:\\git\\Senthil-Cucumber-Project\\FreeCRMBDDFrameWork\\src\\main\\java\\Features\\tagging.feature",
		          glue = "stepDefinitions_Tags",
		          format = {"pretty","html:test-output"},
		          monochrome = true,
		          dryRun = false,
		          strict = true,
		          tags = {"~@RegressionTest"}
		          )
//@RegressionTest
//@smokeTest
public class TestRunner_Tags {

}
