package com.testinium.kitapyurdutest.page;

import com.testinium.kitapyurdutest.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    final static String EMAIL = "aberkedural@gmail.com";
    final static String PASS = "animelover-1a1b";
    public LoginPage(){ methods = new Methods(); }


    public void login() {
        methods.clickElement(By.cssSelector("[href=\"https://www.kitapyurdu.com/index.php?route=account/login\"]"));
        methods.sendKeys(By.id("login-email"),EMAIL);
        methods.sendKeys(By.id("login-password"),PASS);
        methods.clickElement(By.cssSelector("#login > div.ky-form-buttons > button"));
        methods.waitBySeconds(2);
        Assertions.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));

    }

}

