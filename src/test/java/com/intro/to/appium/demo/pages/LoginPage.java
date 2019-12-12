package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;

public class LoginPage extends AbstractPage {

    @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Log in')]") public MobileElement logIn;

    @AndroidFindBy(id = "account_email_edittext")
    @iOSXCUITFindBy(accessibility = "Email")
    public MobileElement emailField;

    @AndroidFindBy(id = "account_password_edittext")
    @iOSXCUITFindBy(accessibility = "Password")
    public MobileElement passwordField;

    @AndroidFindBy(id = "account_login_button")
    @iOSXCUITFindBy(accessibility = "Login")
    public MobileElement loginButton;

    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/imageView2")
    public MobileElement readerProposition;

    @AndroidFindBy(id = "proposition_done")
    public MobileElement continueBtn;

    @AndroidFindBy(id = "intro_login_button")
    public MobileElement loginToGetStarted;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }



}
