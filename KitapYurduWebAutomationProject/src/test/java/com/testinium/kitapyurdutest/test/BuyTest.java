package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.BuyPage;
import com.testinium.kitapyurdutest.page.LoginPage;
import org.junit.jupiter.api.Test;

public class BuyTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void buyTest() {
        BuyPage buyPage = new BuyPage();
        loginPage = new LoginPage();

        loginPage.login();
        buyPage.buy();
    }
}

