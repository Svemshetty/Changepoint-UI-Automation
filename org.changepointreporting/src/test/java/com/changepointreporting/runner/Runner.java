package com.changepointreporting.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features= {"src/test/resources/"},
		glue={"com.changepointreporting.steps"},
		plugin= {"pretty",
				 "html:test-output"}		
		)
public class Runner {

}
