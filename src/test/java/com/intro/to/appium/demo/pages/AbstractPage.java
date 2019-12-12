package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;

import java.time.*;


public abstract class AbstractPage {

    public AppiumDriver driver;

   // public AbstractPage(AppiumDriver driver) {
    //    this.driver = driver;
   // }

    public AbstractPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {

        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
    }


}
