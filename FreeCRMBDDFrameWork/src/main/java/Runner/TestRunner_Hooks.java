package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		          features = "G:\\git\\Senthil-Cucumber-Project\\FreeCRMBDDFrameWork\\src\\main\\java\\Features\\hooks.feature",
		          glue = "stepDefinitions_Hooks",
		          format = {"pretty","html:test-output"},
		          monochrome = true,
		          dryRun = false,
		          strict = true
		          
		          )

public class TestRunner_Hooks {

}
