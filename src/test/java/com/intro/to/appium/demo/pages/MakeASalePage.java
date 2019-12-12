package com.intro.to.appium.demo.pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;

import java.util.*;

public class MakeASalePage extends AbstractPage {


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Make a Sale')]")
    public MobileElement makeASale;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'2')]")
    public MobileElement priceTwo;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'0')]")
    public MobileElement priceZero;

    @AndroidFindBy(id = "catalogue_button_user_switch_to_staff")
    public MobileElement administrator;


    @AndroidFindBy(id = "switch_to_custom_button")
    public MobileElement custom;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'2')]")
    public MobileElement price1;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'00')]")
    public MobileElement doubleZero;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'3')]")
    public MobileElement price2;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'4')]")
    public MobileElement price3;

    @AndroidFindBy(id = "switch_to_mybaskets_button")
    public MobileElement myBaskets;

    @AndroidFindBy(id = "btn_my_baskets_button")
    public MobileElement myBasketsBtn;

    @AndroidFindBy(id = "multi_basketname_textview")
    public MobileElement openBasket;

    @AndroidFindBy(id = "dropdown_basket_name")
    public MobileElement dropdownBasketName;

    @AndroidFindBy(id = "btn_expand")
    public MobileElement btnExpand;

    @AndroidFindBy(id = "multi_basketname_textview")
    public MobileElement basketExpand;

    @AndroidFindBy(id = "drop_down_btn")
    public MobileElement dropdownBtn;

    @AndroidFindBy(id = "print_bill_btn")
    public MobileElement printBillBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Bluetooth')]")
    public MobileElement blueTooth;

    @AndroidFindBy(xpath = "(//android.widget.Button)[11]")
    public MobileElement cashOption;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Paired devices')]")
    public MobileElement pairedDevicesTitle;

    @AndroidFindBy(id = "android:id/title")
    public List<MobileElement> pairedDevices;

    @AndroidFindBy(id = "android:id/widget_frame")
    public List<MobileElement> pairedDevicesSettingsButton;

    @AndroidFindBy(id = "android:id/title")
    public MobileElement availableDevices;


    @AndroidFindBy(id = "android:id/button1")
    public MobileElement okBtn;


    @AndroidFindBy(id = "price")
    public MobileElement price;

    @AndroidFindBy(id = "vat")
    public MobileElement vAT;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'20%')]")
    public MobileElement vATSelector;

    @AndroidFindBy(id = "add")
    public MobileElement add;

    @AndroidFindBy(id = "btn_save_basket_button")
    public MobileElement saveBasketButton;

    @AndroidFindBy(id = "create_button")
    public MobileElement saveButton;

    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/btn_expand")
    public MobileElement expandButton;


    @AndroidFindBy(id = "btn_pay")
    public MobileElement btnPay;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Cash')]")
    public MobileElement CashOption;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'2.20')]")
    public MobileElement quickLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'£0.00')]")
    public MobileElement changeDue;

    @AndroidFindBy(accessibility = "CONFIRM")
    public MobileElement confirmationTick;

    @AndroidFindBy(id = "cash_sale_numberpad")
    public MobileElement cashSaleNumberPad;

    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/issue_receipt_text")
    public MobileElement issue_receipt_text;

    @AndroidFindBy(id = "cashsale_confirmchange_textview")
    public MobileElement cashSaleView;

    @AndroidFindBy(id = "com.worldpay.omnihub.fte03:id/cash_btn_handwritten_receipt")
    public MobileElement handwrittenReceipt;


    public MakeASalePage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }


}
