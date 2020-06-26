package com.tryonyourown.cucumber.basics.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {

    @Given("^User is on Home Page$")
    public void user_is_on_home_page() throws Throwable {
        // throw new PendingException();
        System.out.println("Running step: User is on home page");
    }

    @When("^User logs into the application using username and password$")
    public void user_logs_into_the_application_using_username_and_password() throws Throwable {
        // throw new PendingException();
        System.out.println("Running step: User logs into the application using username and password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // throw new PendingException();
        System.out.println("Running step: Home page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        // throw new PendingException();
        System.out.println("Running step: Cards are displayed");
    }

}