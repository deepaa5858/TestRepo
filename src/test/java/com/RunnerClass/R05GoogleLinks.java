package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/MyCucumberProject/MyCucumberProject/F05GoogleLinksTest.feature" }, glue = {
				"com.StepDefinition" }, publish = true, tags = "@SmokeTest or @SanityTest")
// tags = "not @RegressionTest"
//tags = @ReTest
//tags = "@SmokeTest or @SanityTest"

public class R05GoogleLinks {

}
