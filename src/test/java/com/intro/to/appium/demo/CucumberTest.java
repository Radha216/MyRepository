package com.intro.to.appium.demo;

import cucumber.api.*;
import cucumber.api.junit.*;
import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.ios.*;
import io.appium.java_client.remote.*;
import org.junit.*;
import org.junit.runner.*;
import org.openqa.selenium.remote.*;

import java.net.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "html:target/cucumberHtmlReport"},
        features = "src/test/resources/features/",
        tags = {"@Sprint"},
        strict = false
)

    public  class CucumberTest {

    public static AppiumDriver driver;

    @BeforeClass
    public static void beforeAll() throws MalformedURLException {
        //This is code which will be executed once, before all scenarios.
        boolean isAndroid = true;
        DesiredCapabilities capabilities = getDesiredCapbilities(isAndroid, "emulator-5554");
        if (isAndroid) {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        } else {
            driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        }

        driver.resetApp();
    }

    @AfterClass
    public static void afterAll() {

//     driver.quit();
    }

        public AppiumDriver getDriver() {
            return driver;
        }

        public void setDriver(AppiumDriver driver) {
            this.driver = driver;
        }



    private static DesiredCapabilities getDesiredCapbilities(boolean isAndroid, String udid) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.UDID, udid);
        //This mean that each time driver.close() or driver.launch() is called, the app data isn't reset...
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        //Pass in the path on the local machine to the AUT location.
        if (System.getProperty("appPath") != null) {
            caps.setCapability(MobileCapabilityType.APP, System.getProperty(""));
        } else if (isAndroid) {
            caps.setCapability("appActivity", "com.worldpay.omnihub.ui.prelogin.PreLoginActivity");
            caps.setCapability("appPackage", "com.worldpay.omnihub.fte03");
            caps.setCapability("userName","wpostest@worldpay.com");
            caps.setCapability("password","HUWvipptfo9");
            caps.setCapability("newCommandTimeout","120");
        } else {
            caps.setCapability("bundleId", "com.worldpay.MyBusinessHub.staging");
        }
        if (isAndroid) {
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
            caps.setCapability(MobileCapabilityType.APP, "/Users/radhapriyajammalamadugu/Downloads/app-fte03-debug-2.10.0.dev.73487a1.apk");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        } else {
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iOS");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            //There are some additional capabilites for iOS to do with code signing too
            caps.setCapability("xcodeOrgId", "LPBQ5BR8NU");
            caps.setCapability("xcodeSigningId", "iPhone Developer");
            caps.setCapability("updatedWDABundleId", "com.worldpay.WebDriverAgentRunner");
        }
        return caps;
    }

}

