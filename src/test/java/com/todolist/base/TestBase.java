package com.todolist.base;

import com.todolist.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.browserName("chrome");
        driver.get("https://mongodblist.herokuapp.com/Anwarica");
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
