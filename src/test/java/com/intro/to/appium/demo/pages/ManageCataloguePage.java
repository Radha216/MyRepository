package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;

import java.util.*;

public class ManageCataloguePage extends AbstractPage{



    @AndroidFindBy(id = "product_name_text") public static List<MobileElement> items;
    @AndroidFindBy(id = "category_title") public static List<MobileElement> categories;
    @AndroidFindBy(id = "category_items_text") public static List<MobileElement> categoryNumbers;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Manage Catalogue')]") public MobileElement manageCatalogue;
    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/catalogue_add_category") public MobileElement addCategoryBtn;
    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/catalogue_item_name_field" ) public MobileElement categoryName;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add Category')]") public MobileElement addCategoryTitle;
    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/catalogue_item_name_field") public MobileElement nameField;
    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/catalogue_element_color") public MobileElement elementColor;
    @AndroidFindBy(id = "colour_item_layout") public MobileElement colourList;
    @AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Rose')]") public MobileElement roseColor;
    @AndroidFindBy(id = "catalogue_create_element_button") public MobileElement addCategoryFinal;
    @AndroidFindBy(id = "catalogue_recycleView") public static MobileElement manageCatalogueContainer;
    @AndroidFindBy(accessibility = "More options") public MobileElement kebabMenu;
    @AndroidFindBy(id = "cancel_element_button") public MobileElement cancelButton;
    @AndroidFindBy(id = "android:id/button1") public MobileElement discardButton;
    @AndroidFindBy(id = "txt_total_value") public MobileElement totalAmount;




    public ManageCataloguePage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
}
