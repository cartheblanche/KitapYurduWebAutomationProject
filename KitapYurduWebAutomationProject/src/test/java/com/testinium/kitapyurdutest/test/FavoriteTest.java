package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.FavoritePage;
import com.testinium.kitapyurdutest.page.LoginPage;
import org.junit.jupiter.api.Test;

public class FavoriteTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void favoriteTest(){
        FavoritePage favoritePage = new FavoritePage();
        loginPage = new LoginPage();

        loginPage.login();
        favoritePage.deleteFromFavorites();
    }
}
