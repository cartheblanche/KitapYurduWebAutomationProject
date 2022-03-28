package com.testinium.kitapyurdutest.page;

import com.testinium.kitapyurdutest.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    Methods methods;
    public String thirdProduct;
    public SearchPage() { methods = new Methods();}

    public void searchToy(){
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.clickElement(By.cssSelector("#search > span"));
        methods.scrollWithAction(By.cssSelector(".product-cr:nth-child(7)"));

        methods.clickElement(By.cssSelector(".product-cr:nth-child(7) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        methods.clickElement(By.cssSelector(".product-cr:nth-child(8) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        methods.clickElement(By.cssSelector(".product-cr:nth-child(9) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        thirdProduct = methods.getAttribute(By.cssSelector(".product-cr:nth-child(9)"), "id");
        methods.clickElement(By.cssSelector(".product-cr:nth-child(10) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        methods.waitBySeconds(3);
        methods.clickElement(By.cssSelector("#header-bottom > div > div.logo-text > a > img"));
        methods.waitBySeconds(3);


    }
}
