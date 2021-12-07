package com.dlg.steps;

import com.dlg.base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
    @Given("i navigate to url {string}")
    public void iNavigateToUrl(String url) {
        BasePage.driverUtils.navigateToUrl(url);
    }

    @When("In the Login Page i enter email as {string}")
    public void inTheLoginPageIEnterEmailAs(String em) {
        BasePage.loginPage.enterEmail(em);
    }

    @And("i enter password as {string}")
    public void iEnterPasswordAs(String pw) {
        BasePage.loginPage.enterPassword(pw);

    }

    @And("i click on login button")
    public void iClickOnLoginButton() {
        BasePage.loginPage.clickLogin();

    }

    @Then("i should be logged in successfully and see message Successfully Logged in!")
    public void iShouldBeLoggedInSuccessfullyAndSeeMessageSuccessfullyLoggedIn(String s) {
        BasePage.loginSuccessPage.getLoginSuccessText(s);
        System.out.println(s);
    }
}
