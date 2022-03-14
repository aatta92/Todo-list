package com.todolist.stepDef;

import com.todolist.pages.HomePage;
import io.cucumber.java.en.Then;

import static com.todolist.base.TestBase.driver;

public class Plus_iconStep {

    HomePage homePage = new HomePage(driver);

    @Then("item place holder should be empty")
    public void item_place_holder_should_be_empty() {
        homePage.item_place_holder_should_be_empty().contains("");
    }
}
