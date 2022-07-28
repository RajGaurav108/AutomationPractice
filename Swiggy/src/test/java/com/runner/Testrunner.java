package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
glue = "steps",
tags="@tagLocate or @tagItems")

//tags="@tagLogin or @tagItems or @tagOrder or @tagCart")

public class Testrunner {

}
