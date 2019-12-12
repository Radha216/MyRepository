package com.intro.to.appium.demo.stepdefinitions;

import com.intro.to.appium.demo.*;
import com.intro.to.appium.demo.pages.*;
import cucumber.api.java.en.*;
import io.appium.java_client.*;
import io.appium.java_client.android.*;

import static com.intro.to.appium.demo.Utils.ElementHelper.*;


public class PrinterStepsDef {

    public static final String ACTION_DISPLAY_SETTINGS = null;

    public AndroidDriver driver = (AndroidDriver) CucumberTest.driver;

    public LoginStepsDef loginStepsDef = new LoginStepsDef();
    public WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
    public MakeASalePage makeASalePage = new MakeASalePage(driver);


    @Given("^the user is on the Make a Sale screen$")
    public void theUserIsOnTheMakeASaleScreen() {

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.thePropositionShouldBeChoosenByTheUser();
        loginStepsDef.PedPairingIsSkipped();
        checkElementVisibleThenClick(whatsNewPage.closeButton);
        loginStepsDef.theUserIsLoggedInSuccessfully();

        // driver.startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));


    }

    @And("^the user has a saved basket$")
    public void theUserHasASavedBasket() {

        checkElementVisibleThenClick(makeASalePage.custom);

        //Enter item1//
        checkElementVisibleThenClick(makeASalePage.price);
        checkElementVisibleThenClick(makeASalePage.price1);
        checkElementVisibleThenClick(makeASalePage.doubleZero);
        checkElementVisibleThenClick(makeASalePage.add);

        //Enter item2//

        checkElementVisibleThenClick(makeASalePage.price);
        checkElementVisibleThenClick(makeASalePage.price2);
        checkElementVisibleThenClick(makeASalePage.doubleZero);
        checkElementVisibleThenClick(makeASalePage.add);

        //Enter item3//
        checkElementVisibleThenClick(makeASalePage.price);
        checkElementVisibleThenClick(makeASalePage.price3);
        checkElementVisibleThenClick(makeASalePage.doubleZero);
        checkElementVisibleThenClick(makeASalePage.add);

        //Save Basket//
        //checkElementVisibleThenClick(makeASalePage.btnExpand);
        checkElementVisibleThenClick(makeASalePage.saveBasketButton);
        checkElementVisibleThenClick(makeASalePage.saveButton);
    }

    @And("^the basket is open$")
    public void theBasketIsOpen() {

        checkElementVisibleThenClick(makeASalePage.myBasketsBtn);
        // checkElementVisibleThenClick(makeASalePage.basketExpand);
        //checkElementVisibleThenClick(makeASalePage.btnExpand);
        checkElementVisibleThenClick(makeASalePage.openBasket);

    }

    @When("^the user selects the basket options$")
    public void theUserSelectsTheBasketOptions() {

        //checkElementVisibleThenClick(makeASalePage.dropdownBtn);
        checkElementVisibleThenClick(makeASalePage.dropdownBasketName);
    }

    @Then("^the Print Bill option is present$")
    public void thePrintBillOptionIsPresent() {

        checkElementVisible(makeASalePage.printBillBtn);
    }

    @When("^the user selects Print Bill$")
    public void theUserSelectsPrintBill() {

        checkElementVisibleThenClick(makeASalePage.printBillBtn);
        //checkElementVisibleThenClick(makeASalePage.okBtn);
    }

    @And("^a printer is not connected$")
    public void aPrinterIsNotConnected() {

        driver.startActivity(new Activity("com.android.settings", "com.android.settings.Settings"));
        checkElementVisibleThenClick(makeASalePage.blueTooth);

        checkElementVisible(makeASalePage.pairedDevicesTitle);
        int index = 0;

        for (MobileElement element : makeASalePage.pairedDevices) {
            if (element.getText().equals("STAR L200-01477") || element.getText().equals("mC-Print3-J0019")) {

                break;
            }
            index++;
        }
       // System.out.println("Index: " + index);
       // System.out.println("Connected devices: " + makeASalePage.pairedDevicesSettingsButton.size());
       // if (index + 1 > makeASalePage.pairedDevicesSettingsButton.size())
        //    System.out.println("Printer not connected");
    }

}
