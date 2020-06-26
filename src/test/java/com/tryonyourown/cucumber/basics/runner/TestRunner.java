package com.tryonyourown.cucumber.basics.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/tryonyourown/cucumber/basics/features/Login",
        glue = "com.tryonyourown.cucumber.basics.stepdefinitions")
public class TestRunner {

}
