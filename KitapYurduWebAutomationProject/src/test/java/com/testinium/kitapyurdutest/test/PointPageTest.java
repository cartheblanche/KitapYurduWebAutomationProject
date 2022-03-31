package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.LoginPage;
import com.testinium.kitapyurdutest.page.PointPage;
import org.junit.jupiter.api.Test;

public class PointPageTest extends BaseTest{
    LoginPage loginPage;


    @Test
    public void pointTest(){
        PointPage pointPage = new PointPage();
        loginPage = new LoginPage();

        loginPage.login();
        pointPage.point();

    }


}
