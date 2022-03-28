package com.testinium.kitapyurdutest.page;

import com.testinium.kitapyurdutest.methods.Methods;
import com.testinium.kitapyurdutest.test.LoginTest;
import org.openqa.selenium.By;
import java.util.concurrent.ThreadLocalRandom;

public class PointPage {
    Methods methods;
    LoginTest loginTest;
    public PointPage(){ methods = new Methods(); }

    public void point(){
        loginTest = new LoginTest();
        loginTest.loginTest();
        methods.clickElement(By.cssSelector("#mainNav > div.nav-content > div > div.lvl1catalog > a"));
        methods.clickElement(By.cssSelector("#landing-point > div:nth-child(4) > a:nth-child(2) > img"));
        methods.clickElement(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select > option:nth-child(6)"));
        methods.hoverElement(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
        methods.clickElement(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > div > div.open-menu-ct.bookAllCategories > div > ul:nth-child(3) > li:nth-child(14) > a"));
        methods.clickElement(By.cssSelector("#list_product_carousel_best_sell-view-all"));
        int randomNum = ThreadLocalRandom.current().nextInt(2, 16);
        methods.scrollWithAction(By.cssSelector(String.format(".product-cr:nth-child(%d)", randomNum)));
        methods.clickElement(By.cssSelector(String.format(".product-cr:nth-child(%d) [class = hover-menu] [class = add-to-cart] [class = \"fa fa-shopping-cart\"]", randomNum)));
        methods.scrollWithAction(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > a"));
        methods.hoverElement(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > a"));
        methods.clickElement(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > div > ul > li:nth-child(1) > a"));
        methods.waitBySeconds(5);
    }
}
