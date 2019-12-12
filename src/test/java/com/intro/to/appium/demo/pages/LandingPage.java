package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;

public class LandingPage extends AbstractPage {


    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "button1")
    public MobileElement landingPageElementConfirm;

    @AndroidFindBy(accessibility = "More options") public MobileElement moreOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Skip reader setup')]")
    public MobileElement skipPedSetup;

    @AndroidFindBy(id ="android:id/button1") public MobileElement YesSkip;


    public LandingPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

}
