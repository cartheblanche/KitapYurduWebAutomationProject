package com.testinium.kitapyurdutest.page;

import com.testinium.kitapyurdutest.methods.Methods;
import org.openqa.selenium.By;

public class FavoritePage {
    Methods methods;

    public FavoritePage(){methods = new Methods();}

    public void deleteFromFavorites(){

        methods.scrollWithAction(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > a"));

        methods.hoverElement(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > a"));

        methods.clickElement(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > div > ul > li:nth-child(1) > a"));

        methods.clickElement(By.cssSelector("#content > div.grid_9 > div.box.no-padding > div.product-filter > div > div.display > a > span"));

        methods.clickElement(By.cssSelector(String.format("#%s > div.grid_2.alpha.omega.relative > div.hover-menu > a:nth-child(3) > i", SearchPage.thirdProduct)));
    }

}
