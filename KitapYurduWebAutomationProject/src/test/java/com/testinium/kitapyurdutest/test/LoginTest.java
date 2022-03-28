package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

}
