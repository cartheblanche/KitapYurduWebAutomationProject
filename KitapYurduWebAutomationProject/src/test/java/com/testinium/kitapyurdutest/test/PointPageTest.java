package com.testinium.kitapyurdutest.test;

import com.testinium.kitapyurdutest.driver.BaseTest;
import com.testinium.kitapyurdutest.page.PointPage;
import org.junit.jupiter.api.Test;

public class PointPageTest extends BaseTest{
    @Test
    public void pointTest(){
        PointPage pointPage = new PointPage();
        pointPage.point();

    }

}
