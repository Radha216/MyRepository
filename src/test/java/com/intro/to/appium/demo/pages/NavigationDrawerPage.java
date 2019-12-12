package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.pagefactory.*;

public class NavigationDrawerPage extends AbstractPage {


    @AndroidFindBy(accessibility="Open navigation drawer") public MobileElement navBar;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Help & Support')]") public MobileElement helpAndSupport;

    @AndroidFindBy(accessibility = "More options") public MobileElement mainMenu;

    public NavigationDrawerPage(AndroidDriver driver){
        super(driver);
        loadPage();
    }
}
