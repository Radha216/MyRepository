package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.pagefactory.*;

public class MessagesAndNotifications extends AbstractPage {

    @AndroidFindBy(id = "android:id/message") public MobileElement message;
    @AndroidFindBy(id = "button1") public MobileElement yes;
    @AndroidFindBy(id = "button2") public MobileElement cancel;
    @AndroidBy(id = "panel_description")

    public MessagesAndNotifications(AndroidDriver driver) {
        super(driver);
        loadPage();
    }




}
