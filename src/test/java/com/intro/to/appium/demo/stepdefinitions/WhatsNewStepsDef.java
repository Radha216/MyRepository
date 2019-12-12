package com.intro.to.appium.demo.stepdefinitions;

import com.intro.to.appium.demo.*;
import com.intro.to.appium.demo.constants.*;
import com.intro.to.appium.demo.pages.*;
import cucumber.api.java.en.*;
import io.appium.java_client.android.*;

import static com.intro.to.appium.demo.Utils.ElementHelper.*;


public class WhatsNewStepsDef {

    public AndroidDriver driver = (AndroidDriver) CucumberTest.driver;
    public WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
    public NavigationDrawerPage navigationDrawerPage = new NavigationDrawerPage(driver);
    public HelpAndSupportPage helpAndSupportPage = new HelpAndSupportPage(driver);
    public MakeASalePage makeASalePage = new MakeASalePage(driver);
    public LoginStepsDef loginStepsDef =  new LoginStepsDef();



    @Given("^the user logged in successfully$")
    public void theUserLoggedInSuccessfully() {

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.theAllowLocationPermissionIsAccepted();
        loginStepsDef.PedPairingIsSkipped();
    }

    @Then("^the What’s New presents$")
    public void theWhatSNewPresents() {

        checkElementVisible(whatsNewPage.whatsNew);
    }

    @And("^the VAT Breakdown promotion is displayed$")
    public void theVATBreakdownPromotionIsDisplayed() throws InterruptedException {

        checkElementVisible(whatsNewPage.whatsNewPanelTitle);
        assertEquals(Messages.VAT_Panel_Desc, checkElementVisibleThenReturnText(whatsNewPage.whatsNewPanelTitle));
        checkElementVisible(whatsNewPage.whatsNewScreenShot);
        assertEquals(Messages.Panel_Description, checkElementVisibleThenReturnText(whatsNewPage.panelDescription));
        checkElementVisibleThenClick(whatsNewPage.closeButton);


    }

    @And("^the user selects the What’s New Link$")
    public void theUserSelectsTheWhatSNewLink() {

        checkElementVisibleThenClick(helpAndSupportPage.whatsNewHelpAndSupport);
    }


    @When("^the user navigates to the Help & Support screen$")
    public void theUserNavigatesToTheHelpSupportScreen() {

        checkElementVisibleThenClick(navigationDrawerPage.navBar);
        checkElementVisibleThenClick(navigationDrawerPage.helpAndSupport);

    }

    @Given("^the user is logged in and on Make A Sale Page$")
    public void theUserIsLoggedInAndOnMakeASalePage() {

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.theAllowLocationPermissionIsAccepted();
        loginStepsDef.PedPairingIsSkipped();
        checkElementVisibleThenClick(whatsNewPage.closeButton);
        loginStepsDef.theUserIsLoggedInSuccessfully();
        //checkElementVisible(makeASalePage.makeASale);
    }

    @And("^the VAT Breakdown promotion is displayed - Help & Support$")
    public void theVATBreakdownPromotionIsDisplayedHelpSupport() {

        checkElementVisible(whatsNewPage.whatsNewPanelTitle);
        assertEquals(Messages.VAT_Panel_Desc, checkElementVisibleThenReturnText(whatsNewPage.whatsNewPanelTitle));
        checkElementVisible(whatsNewPage.whatsNewScreenShot);
        assertEquals(Messages.Panel_Description, checkElementVisibleThenReturnText(whatsNewPage.panelDescription));
        checkElementVisibleThenClick(whatsNewPage.backArrow);
    }

    @Given("^the user signs in$")
    public void theUserSignsIn() {

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.theAllowLocationPermissionIsAccepted();
        loginStepsDef.PedPairingIsSkipped();

    }
}
