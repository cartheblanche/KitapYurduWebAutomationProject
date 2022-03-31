package com.testinium.kitapyurdutest.driver;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-poup-blocking");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-extensions");
        chromeOptions.setExperimentalOption("w3c", false);


        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.kitapyurdu.com/");


    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();

        }


    }


}