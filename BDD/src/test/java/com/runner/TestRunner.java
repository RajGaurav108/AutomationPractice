package com.runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {"stepDefinitions"},

//tags = " @tagWeekly and @tagSmoke "
tags = "@tagOrder",
monochrome = true,
plugin = {"json:target/MyReports/report.json",
         "junit:target/MyReports/report.xml" }
//plugin = {"pretty"}
//dryRun = true

)
public class TestRunner {

	

}
