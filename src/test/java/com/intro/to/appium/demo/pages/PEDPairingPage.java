package com.intro.to.appium.demo.pages;



import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.pagefactory.*;

public class PEDPairingPage extends AbstractPage {


    public LoginPage loginPage = new LoginPage(driver);


    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'More options']")
     public MobileElement MoreOptions;

    public PEDPairingPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }
}
