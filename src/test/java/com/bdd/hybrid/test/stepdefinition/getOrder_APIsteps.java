package com.bdd.hybrid.test.stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class getOrder_APIsteps extends BaseStepClass {

 
    @Given("^user should have the base URL \"([^\"]*)\"$")
    public void user_should_have_the_base_URL(String baseURL) {

        System.out.println("Testing rest assured with Cucumber");              
         httpRequest = get_httpRequest_Ref(baseURL);
    }

    @When("user fetches the records with {string} endpoint")
    public void user_fetches_the_records_with_endpoint(String endpoint) {
        response = httpRequest.get(endpoint);
        System.out.println("endpoint: " +endpoint);
    }

    @Then("^user should get status code \"([^\"]*)\" in response$")
    public void user_should_get_status_code_in_response(String expectedStatusCode) {
        
         int statusCode = response.getStatusCode();
         Assert.assertEquals(statusCode, Integer.parseInt(expectedStatusCode));
    }
}
