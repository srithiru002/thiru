package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\resources\\Features", glue="com.stepdefinition",dryRun =false,monochrome = true,tags="@smoke",plugin= {
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"json:target/cucumber-reports.json"	
		 })
	
public class Runner {
		
}
