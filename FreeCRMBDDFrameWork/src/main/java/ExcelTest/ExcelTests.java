package ExcelTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "G:\\git\\Senthil-Cucumber-Project\\FreeCRMBDDFrameWork\\src\\main\\java\\Features\\Excel.feature",
                 glue = {"step_Excel"}
                 
                 
		)
@RunWith(Cucumber.class)
public class ExcelTests {

}
