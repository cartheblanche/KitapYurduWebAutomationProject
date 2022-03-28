package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.SearchPage;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    LoginTest loginTest;
    public SearchTest(){loginTest = new LoginTest();}
    @Test
    public void searchToy(){
        SearchPage searchPage = new SearchPage();

        loginTest.loginTest();
        searchPage.searchToy();
    }

}
