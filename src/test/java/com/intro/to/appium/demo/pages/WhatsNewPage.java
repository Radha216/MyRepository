package com.intro.to.appium.demo.pages;


import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;

public class WhatsNewPage extends AbstractPage {

    //@AndroidFindBy(id = "close_button") public MobileElement close;

    @AndroidFindBy(id = "whats_new_txt") public MobileElement whatsNew;

    @AndroidFindBy(id = "whats_new_panel_title") public MobileElement whatsNewPanelTitle;
//    @AndroidBy(xpath = "//android.widget.TextView[contains(@text, 'VAT breakdown straight to your inbox')]") public MobileElement whatsNewPanelTitle;

    @AndroidFindBy(id = "whats_new_screenshot") public MobileElement whatsNewScreenShot;

    @AndroidFindBy(id = "panel_description") public MobileElement panelDescription;

    @AndroidFindBy(id = "close_button") public MobileElement closeButton;

    @AndroidFindBy(id = "back_arrow") public MobileElement backArrow;

    public WhatsNewPage(AppiumDriver driver){
        super(driver);
        loadPage();

    }
}
