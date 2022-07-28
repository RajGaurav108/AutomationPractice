package com.runner;

import static org.junit.Assert.*;

import org.junit.Test;



//import Reporter;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;

import java.io.File;

/**
 * A sample test to demonstrate
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},

//  glue = {"com.vimalselvam.cucumber.stepdefinitions"},
    glue = {"stepDefinitions"}
   
//    plugin = {"com.vimalselvam.cucumber.ExtentCucumberFormatter:test-output/report.html"}
)
public class TestRunner2 {
    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}


