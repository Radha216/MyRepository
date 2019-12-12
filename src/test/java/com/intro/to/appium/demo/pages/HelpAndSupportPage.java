package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.pagefactory.*;

public class HelpAndSupportPage extends AbstractPage {

    @AndroidFindBy(id = "whats_new_title_txt") public MobileElement whatsNewHelpAndSupport;

    @AndroidFindBy(id = "pdf_title_txt") public MobileElement userManual;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Help & Support']") public MobileElement helpAndSupport;


    @AndroidFindBy(xpath= "//android.view.ViewGroup[@content-desc=\"v2.6.0\n" + " Worldpay POS" +" User Manual\n" +" \"]") public MobileElement getUserManual;

    @AndroidFindBy(id = "com.google.android.apps.docs:id/projector_toolbar") public MobileElement toolbarPdfViewer;

    @AndroidFindBy(accessibility = "Navigate up") public MobileElement backButton;

    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/help_centre_layout") public MobileElement helpCentre;
    private AndroidDriver driver;


    public HelpAndSupportPage(AndroidDriver driver){

        super(driver);
        loadPage();
    }
}
