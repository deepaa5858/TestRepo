package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F04PracticeTestAutomation.feature"},
						glue = {"com.StepDefinition", "com.MyHooks"},
						plugin = {"json:Reports/Cucumber-json.json",
				"junit:Reports/xmlReport.xml" })
public class R04PractceTestAutomation {

}
