package com.testinium.kitapyurdutest.methods;

import com.testinium.kitapyurdutest.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ISelect;

import java.time.Duration;

public class Methods {
    private static final Logger log = LogManager.getLogger(Methods.class);
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    Logger logger = LogManager.getLogger(Methods.class);

    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;

    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    protected JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }

    public void waitBySeconds(long seconds) {

        try {
            Thread.sleep(seconds * 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void sendKeys(By by, String text) {
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        if (!element.isDisplayed()) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        waitUntilElementClickable(by);
        element.sendKeys(text);
    }

    protected void scrollTo(int x, int y) {
        String jsStmt = String.format("window.scrollTo(%d, %d);", x, y);
        getJSExecutor().executeScript(jsStmt, true);
    }

    public void waitUntilElementClickable(By by) {
        log.info("Waiting for element to be clickable...");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private void waitUntilPresence(By by) {
    }

    public boolean isElementVisible(By by) {
        try {

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            logger.info("True");
            return true;

        } catch (Exception e) {

            logger.info("False" + e.getMessage());
            return false;
        }

    }


    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }

    /*
    public void selectByText(By by, String text) {
        getSelect(by).selectByVisibleText(text);
    }
     */

    private ISelect getSelect(By by) {
        return null;
    }

    public void scrollWithJavaScript(By by) {
        jsdriver.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }

    public String getAttribute(By by, String attributeName) {
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by) {
        return findElement(by).getText();


    }

    public String getValue(By by) {
        return jsdriver.executeScript("return arguments[0].value;", findElement(by)).toString();
    }

    public void clickElement(By by) {
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        if (!element.isDisplayed()) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        try {
            waitUntilElementClickable(by);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            Assertions.fail("Element is not clickable!");
        }
        element.click();
    }

    public void hoverElement(By by) {
        Actions action = new Actions(driver);
        log.info("Element hovered over: " + by);
        action.moveToElement(findElement(by)).build().perform();
        waitBySeconds(1);

    }


}