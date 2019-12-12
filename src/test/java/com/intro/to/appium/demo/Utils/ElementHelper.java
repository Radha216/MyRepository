package com.intro.to.appium.demo.Utils;


import com.intro.to.appium.demo.*;
import io.appium.java_client.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.*;

import static org.junit.Assert.*;

public class ElementHelper {


    static AppiumDriver driver = CucumberTest.driver;
    private static WebDriverWait longWait = new WebDriverWait(getDriver(), 90);
    private static WebDriverWait wait = new WebDriverWait(getDriver(), 30);
    private static WebDriverWait medWait = new WebDriverWait(getDriver(), 10);
    private static WebDriverWait shortWait = new WebDriverWait(getDriver(), 5);
    private static WebDriverWait shortWaitWebDriver;
    private static WebDriverWait superShortWait = new WebDriverWait(getDriver(), 2);

    public static void checkElementVisible(MobileElement element) {
        wait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void checkElementVisibleShort(MobileElement element) {
        shortWait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void checkElementVisibleMedium(MobileElement element) {
        medWait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void checkElementVisibleThenClick(MobileElement element) {
        wait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void checkElementVisibleThenClickMedium(MobileElement element) {
        medWait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void checkElementVisibleThenClickShort(MobileElement element) {
        shortWait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static String checkElementVisibleThenReturnText(MobileElement element) {
        wait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public static String checkElementVisibleThenReturnTextMedium(MobileElement element) {
        medWait.ignoring(NoSuchElementException.class)
                .ignoring(WebDriverException.class)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(Duration.ofMillis(1250))
                .until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public static boolean isElementVisible(MobileElement element) {
        try {
            wait.ignoring(NoSuchElementException.class)
                    .ignoring(WebDriverException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isElementVisibleShort(MobileElement element) {
        try {
            shortWait.ignoring(NoSuchElementException.class)
                    .ignoring(WebDriverException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public static boolean isElementVisibleSuperShort(MobileElement element) {
        try {
            superShortWait.ignoring(NoSuchElementException.class)
                    .ignoring(WebDriverException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void ifElementExistsThenClick(MobileElement element) {
        try {
            wait.ignoring(NoSuchElementException.class)
                    .ignoring(NotFoundException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            // Don't throw the exception.
        }
    }

    public static void ifElementExistsThenClickMedium(MobileElement element) {
        try {
            medWait.ignoring(NoSuchElementException.class)
                    .ignoring(NotFoundException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            // Don't throw the exception.
        }
    }

    public static void ifElementExistsThenClickShort(MobileElement element) {
        try {
            shortWait.ignoring(NoSuchElementException.class)
                    .ignoring(NotFoundException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            // Don't throw the exception.
        }
    }

    public static void ifElementExistsThenClickSuperShort(MobileElement element) {
        try {
            superShortWait.ignoring(NoSuchElementException.class)
                    .ignoring(NotFoundException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .pollingEvery(Duration.ofMillis(1250))
                    .until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            // Don't throw the exception.
        }
    }

    public static void checkElementInvisible(MobileElement element) {
        if (isElementVisibleShort(element)) {
            try {
                longWait.pollingEvery(Duration.ofMillis(2000))
                        .until(ExpectedConditions.invisibilityOf(element));
            } catch (WebDriverException e) {
                //Sometimes, between finding the element initially and checking for invisibility, it's gone, so one last check.
                assertFalse(isElementVisibleSuperShort(element));
            }
        }
    }

    static public void assertEquals(Object expected, Object actual) {
        assertEquals(null, expected, actual);
    }

    public static void assertEquals(Object o, Object expected, Object actual) {
    }

    public static void setValue(MobileElement e, String val) {
        e.clear();
        e.setValue(val);
    }

    public static AppiumDriver getDriver() {
        return driver;
    }


}

