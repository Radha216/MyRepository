package com.intro.to.appium.demo.stepdefinitions;

import com.intro.to.appium.demo.*;
import com.intro.to.appium.demo.pages.*;
import cucumber.api.java.en.*;
import io.appium.java_client.*;

import static com.intro.to.appium.demo.Utils.ElementHelper.*;

public class LoginStepsDef {

    AppiumDriver driver = CucumberTest.driver;

     public LoginPage loginPage = new LoginPage(driver);
     public LandingPage landingPage = new LandingPage(driver);
     public MakeASalePage makeASalePage = new MakeASalePage(driver);



    // public LoginStepsDef(AppiumDriver driver) {
       //this.driver = driver;
      //this.loginPage = new LoginPage(CucumberTest.driver);
      //this.landingPage = new LandingPage(CucumberTest.driver);
       // this.makeASalePage = new MakeASalePage(CucumberTest.driver);

 //  }


    @Given("^The initial login page is shown$")
    public void theInitialLoginPageIsShown() {

        checkElementVisible(loginPage.loginToGetStarted);
    }

    @And("^The 'Login to get Started' button is pressed and the login page is shown$")
    public void theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown() {

        checkElementVisibleThenClick(loginPage.loginToGetStarted);
        checkElementVisible(loginPage.emailField);
    }

    @When("^Correct login credentials are provided$")
    public void CorrectLoginCredentialsAreProvided() {

        checkElementVisible(loginPage.emailField);
        setValue(loginPage.emailField, "james.claydon@wpdsptest.com");
        setValue(loginPage.passwordField, "Password1!");
        checkElementVisibleThenClick(loginPage.loginButton);
    }


    @And("^The 'allow location' permission is accepted$")
    public void theAllowLocationPermissionIsAccepted() {

        checkElementVisibleThenClick(landingPage.landingPageElementConfirm);
    }

    @And("^PED pairing is skipped$")
    public void PedPairingIsSkipped() {


        checkElementVisibleThenClick(landingPage.moreOptions);
        checkElementVisibleThenClick(landingPage.skipPedSetup);
        checkElementVisibleThenClick(landingPage.YesSkip);

    }

    @Then("^The user is logged in successfully - initial$")
    public void theUserIsLoggedInSuccessfully() {

        checkElementVisible(makeASalePage.makeASale);

    }


    @And("^the proposition should be choosen by the user$")
    public void thePropositionShouldBeChoosenByTheUser() {

        checkElementVisibleThenClick(loginPage.readerProposition);
        checkElementVisibleThenClick(loginPage.continueBtn);
    }
}










