package com.testinium.kitapyurdutest.page;

import com.testinium.kitapyurdutest.methods.Methods;
import org.openqa.selenium.By;

public class BuyPage {
    Methods methods;

    public BuyPage(){ methods = new Methods();}

    public void buy(){
        methods.clickElement(By.cssSelector("#cart > div.heading"));

        methods.clickElement(By.cssSelector("#js-cart"));

        methods.sendKeys(By.cssSelector("#cart_module > div.cart-info > table > tbody > tr > td.quantity > form > input[type=text]:nth-child(1)"),"2");

        methods.clickElement(By.cssSelector("#cart_module > div.cart-info > table > tbody > tr > td.quantity > form > i"));

        methods.clickElement(By.cssSelector("#cart_module > div.buttons > div.right > a"));

        methods.waitBySeconds(2);

    }
}
