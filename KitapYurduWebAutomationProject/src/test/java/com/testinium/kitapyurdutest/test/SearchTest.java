package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.LoginPage;
import com.testinium.kitapyurdutest.page.SearchPage;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void searchToy(){

        SearchPage searchPage = new SearchPage();
        loginPage = new LoginPage();

        loginPage.login();
        searchPage.searchToy();
    }

}
