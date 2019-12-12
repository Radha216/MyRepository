package com.intro.to.appium.demo.stepdefinitions;

import com.intro.to.appium.demo.*;
import com.intro.to.appium.demo.pages.*;
import cucumber.api.java.en.*;
import io.appium.java_client.android.*;

import static com.intro.to.appium.demo.Utils.ElementHelper.*;

public class HelpAndSupportStepsDef  {

     AndroidDriver driver = (AndroidDriver) CucumberTest.driver;

     public HelpAndSupportPage helpAndSupportPage = new HelpAndSupportPage(driver);
     public WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
     public LoginStepsDef loginStepsDef =  new LoginStepsDef();
     public NavigationDrawerPage navigationDrawerPage = new NavigationDrawerPage(driver);


        @Given("^The user is logged in and on the help & support screen$")
        public void theUserIsLoggedInAndOnTheHelpAndSupportScreen()
       {
           loginStepsDef.theInitialLoginPageIsShown();
           loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
           loginStepsDef.CorrectLoginCredentialsAreProvided();
           loginStepsDef.theAllowLocationPermissionIsAccepted();
           loginStepsDef.PedPairingIsSkipped();
           checkElementVisibleThenClick(whatsNewPage.closeButton);
           loginStepsDef.theUserIsLoggedInSuccessfully();
           checkElementVisibleThenClick(navigationDrawerPage.navBar);
           checkElementVisibleThenClick(navigationDrawerPage.helpAndSupport);

        }

       @When("^the user clicks on the user manual button$")
       public void theUserClicksOnTheUserManualButton()
       {
           checkElementVisibleThenClick(helpAndSupportPage.userManual);
       }

       @Then("^the user is taken to the user manual screen$")
       public void theUserIsTakenToTheUserManualScreen()
       {

           checkElementVisibleThenClick(helpAndSupportPage.backButton);
       }

    @When("^the user selects the 'TAKE ME TO HELP CENTRE'Then the user is taken to help\\.worldpay\\.com in a new tab in the browser$")
    public void theUserSelectsTheTAKEMETOHELPCENTREThenTheUserIsTakenToHelpWorldpayComInANewTabInTheBrowser()
    {
        checkElementVisibleThenClick(helpAndSupportPage.helpCentre);
    }
}

