package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(name = { "scenario",
		"scenario2" }, snippets = SnippetType.CAMELCASE, dryRun = false, publish = true, stepNotifications = true, monochrome = false, features = "src\\test\\resources", glue = "com.omrbranch.stepdefn", plugin = {
				"pretty", "html:target\\Output.html", "json:target\\Output.json", "junit:target\\Output.xml" })
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
		String jsonReport = "F:\\SelfCucumber\\CucumberGrocery\\target\\Output.json";
		Reporting.generateJvmReport(jsonReport);
	}

}
