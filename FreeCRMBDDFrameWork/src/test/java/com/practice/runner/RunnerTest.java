package com.practice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\git\\Senthil-Cucumber-Project\\FreeCRMBDDFrameWork\\src\\test\\java\\com\\practice\\features\\ZooTest.feature",
                  glue = {"com\\practice\\stepDefinition"},
                  dryRun = true
		)
public class RunnerTest {
	

}
