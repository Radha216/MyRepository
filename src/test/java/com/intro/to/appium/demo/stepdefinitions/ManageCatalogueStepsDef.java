package com.intro.to.appium.demo.stepdefinitions;

import com.intro.to.appium.demo.*;
import com.intro.to.appium.demo.pages.*;
import cucumber.api.java.en.*;
import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.touch.offset.*;
import org.apache.commons.lang3.*;
import org.openqa.selenium.*;

import java.util.*;

import static com.intro.to.appium.demo.Utils.ElementHelper.*;

public class ManageCatalogueStepsDef {

    public String addedCategoryName;
    public String basketAmount;

    public AndroidDriver driver = (AndroidDriver) CucumberTest.driver;
    public WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
    public NavigationDrawerPage navigationDrawerPage = new NavigationDrawerPage(driver);
    public LoginStepsDef loginStepsDef = new LoginStepsDef();
    public ManageCataloguePage manageCataloguePage = new ManageCataloguePage(driver);
    public MakeASalePage makeASalePage = new MakeASalePage(driver);

    @Given("^the user is logged in and on Manage Catalogue Page$")

     public void theUserIsLoggedInAndOnManageCataloguePage(){

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.PedPairingIsSkipped();
        checkElementVisibleThenClick(whatsNewPage.closeButton);
        loginStepsDef.theUserIsLoggedInSuccessfully();
        checkElementVisibleThenClick(navigationDrawerPage.navBar);
        checkElementVisibleThenClick(manageCataloguePage.manageCatalogue);
        }


    @And("^the user selects 'ADD CATEGORY \\+'$")
    public void theUserSelectsADDCATEGORY() {

        checkElementVisibleThenClick(manageCataloguePage.addCategoryBtn);

    }

    @And("^the user is taken to the Add Category screen$")
    public void theUserIsTakenToTheAddCategoryScreen() {

       checkElementVisible(manageCataloguePage.addCategoryTitle);

    }

    @When("^the user enters a unique name$")
    public void theUserEntersAUniqueName() {

        checkElementVisible(manageCataloguePage.nameField);
        addedCategoryName= RandomStringUtils.randomAlphabetic(4);
        setValue(manageCataloguePage.nameField, addedCategoryName);
    }

    @And("^the user selects a colour$")
    public void theUserSelectsAColour() {

        checkElementVisibleThenClick(manageCataloguePage.elementColor);
        checkElementVisibleThenClick(manageCataloguePage.roseColor);
    }

    @And("^the user selects 'ADD'$")
    public void theUserSelectsADD() {

        checkElementVisibleThenClick(manageCataloguePage.addCategoryFinal);
        checkElementVisibleThenClick(manageCataloguePage.cancelButton);
        checkElementVisibleThenClick(manageCataloguePage.discardButton);
    }

    @Then("^the category is added to the Catalogue$")
    public void theCategoryIsAddedToTheCatalogue() {

        checkElementVisibleShort(navigationDrawerPage.mainMenu);

        findIt(addedCategoryName, "category");
    }

    MobileElement findIt(String name, String type) {
        int count = 0;
        while (count < 15) {
            if (count != 0) scrollDown();
            List<MobileElement> shownElements = type.equals("item") ? manageCataloguePage.items
                    : manageCataloguePage.categories;
            for (MobileElement el : shownElements) {
                if (el.getText().equals(name)) {
                    return el;
                }
            }
            count++;
        }
        throw new ElementNotVisibleException(type + " named " + name + " cannot be found");

    }
        private void scrollDown() {
            TouchAction scrollAction = new TouchAction(driver);
            Dimension dimension = manageCataloguePage.manageCatalogueContainer.getSize();
            int height = dimension.height / 100;
            int width = manageCataloguePage.manageCatalogueContainer.getCenter().x;
            PointOption startPointOption = new PointOption().withCoordinates(width, height * 90);
            PointOption finishPointOption = new PointOption().withCoordinates(width, height * 20);
            scrollAction.longPress(startPointOption).moveTo(finishPointOption).release().perform();
        }

    @Given("^The user is logged in and on the make a sale screen - custom sale$")
    public void theUserIsLoggedInAndOnTheMakeASaleScreenCustomSale() {

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.PedPairingIsSkipped();
        checkElementVisibleThenClick(whatsNewPage.closeButton);
        loginStepsDef.theUserIsLoggedInSuccessfully();
        checkElementVisibleThenClick(makeASalePage.custom);

    }

    @And("^the user adds a custom item to the basket with a value of \"([^\"]*)\" and VAT of \"([^\"]*)\"$")
    public void theUserAddsACustomItemToTheBasketWithAValueOfAndVATOf(String arg0, String arg1)  {

        checkElementVisibleThenClick(makeASalePage.priceTwo);
        checkElementVisibleThenClick(makeASalePage.priceTwo);
        checkElementVisibleThenClick(makeASalePage.priceZero);
        checkElementVisibleThenClick(makeASalePage.vAT);
        checkElementVisibleThenClick(makeASalePage.vATSelector);
        checkElementVisibleThenClick(makeASalePage.add);
        checkElementVisibleThenClick(makeASalePage.expandButton);
        checkElementVisibleThenClick(makeASalePage.btnPay);

    }

    @And("^The cash option is chosen$")
    public void theCashOptionIsChosen() {

        checkElementVisibleThenClick(makeASalePage.cashOption);

    }

    @When("^the user clicks the \"([^\"]*)\" quick link$")
    public void theUserClicksTheQuickLink(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        checkElementVisibleThenClick(makeASalePage.quickLink);

    }

    @And("^the amount displayed in the Enter cash amount field is \"([^\"]*)\"$")
    public void theAmountDisplayedInTheEnterCashAmountFieldIs(String arg0) {
        // Write code here that turns the phrase above into concrete actions

        checkElementVisible(makeASalePage.cashSaleNumberPad);
        assertEquals("2.20",checkElementVisibleThenReturnText(makeASalePage.cashSaleNumberPad));

    }

    @And("^the user ticks button$")
    public void theUserTicksButton() {

        checkElementVisibleThenClick(makeASalePage.confirmationTick);
    }

    @Then("^the user is taken to the Issue Receipts screen$")
    public void theUserIsTakenToTheIssueReceiptsScreen() {

        checkElementVisible(makeASalePage.issue_receipt_text);
    }

    @And("^the change due is \"([^\"]*)\"$")
    public void theChangeDueIs(String arg0)  {


       checkElementVisible(makeASalePage.changeDue);

    }

    @And("^the handwritten receipt option is chosen$")
    public void theHandwrittenReceiptOptionIsChosen() {

        checkElementVisibleThenClick(makeASalePage.handwrittenReceipt);
    }

    @Given("^The user is logged in and on the make a sale screen$")
    public void theUserIsLoggedInAndOnTheMakeASaleScreen() {

        loginStepsDef.theInitialLoginPageIsShown();
        loginStepsDef.theLoginToGetStartedButtonIsPressedAndTheLoginPageIsShown();
        loginStepsDef.CorrectLoginCredentialsAreProvided();
        loginStepsDef.PedPairingIsSkipped();
        checkElementVisibleThenClick(whatsNewPage.closeButton);
        loginStepsDef.theUserIsLoggedInSuccessfully();
    }

    @And("^within a category with (\\d+) or more items$")
    public void withinACategoryWithOrMoreItems(int arg0) {

      int count = 0;
      boolean found = false;
      int itemsAndCats = manageCataloguePage.items.size() + manageCataloguePage.categories.size();
      while(count <15){

          if(count != 0 && itemsAndCats > 8) scrollDown();
          for(MobileElement cat : manageCataloguePage.categoryNumbers) {
              int itemCount = Integer.valueOf(cat.getText().replaceAll("//D+", ""));
              if (itemCount > 2) {
                  cat.click();
                  found = true;
                  break;
              }
          }
          count++;
          if(found) break;

      }

    }

    @And("^the user selects a random catalogue item$")
    public void theUserSelectsARandomCatalogueItem() {

        checkElementVisibleThenClick(manageCataloguePage.items.get(new Random().nextInt(manageCataloguePage.items.size()-1)));
    }

    @And("^the basket amount is known$")
    public void theBasketAmountIsKnown() {

        basketAmount = checkElementVisibleThenReturnText(manageCataloguePage.totalAmount);

    }


    @And("^the user enters an amount equal to that of the basket$")
    public void theUserEntersAnAmountEqualToThatOfTheBasket() {


    }
}

