package com.todolist.stepDef;

import com.todolist.pages.HomePage;
import io.cucumber.java.en.Given;

import static com.todolist.base.TestBase.driver;

public class DeleteItemSteps {
    HomePage homePage = new HomePage(driver);

    @Given("delete the added item")
    public void delete_the_added_item() {
        homePage.click_on_radioBtn();
    }

    @Given("item is deleted")
    public void item_is_deleted() {
        homePage.verify_item_addem().contains("hola");
    }

}
