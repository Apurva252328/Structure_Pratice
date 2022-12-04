package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Given("I am register page")
    public void i_am_register_page() {
        // Write code here that turns the phrase above into concrete actions
        homepage.verifyRegisterButtonPresent();
    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.verifyUserIsOnRegistrationPage();
    }
    @When("I Should click on Register button")
    public void i_should_click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
    registerResultPage.verifyRegisterResult();
    }


    @When("I click on {string} link")
    public void iClickOnLink(String categoryLink) {
        homepage.clickOnCategoryPage(categoryLink);

    }

    @Then("I should able to see to related {string} page successfully")
    public void iShouldAbleToSeeToRelatedPageSuccessfully(String categoryName) {
        Utils.assertCurrentUrl(categoryName);
    }
}
