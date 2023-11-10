package com.automation.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/LoginSalesforce.feature"},
glue= {"com.cucumber.stepdefinitions.StepDefinitionSalesforce"})

public class RunnerSalesforce {

}
