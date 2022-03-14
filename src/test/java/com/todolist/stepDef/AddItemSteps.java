package com.todolist.stepDef;

import com.todolist.base.TestBase;
import com.todolist.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.todolist.base.TestBase.driver;

public class AddItemSteps {
    HomePage homePage = new HomePage(driver);

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        String title = TestBase.driver.getTitle();
        Assert.assertEquals("Todo List", title);

    }

    @Given("enter a todo item")
    public void enter_a_todo_item() {
        homePage.add_item("Hola!!, Como estas");

    }

    @Given("click on add link")
    public void click_on_add_link() {
        homePage.clickAddBtn();
    }

    @Then("verify item is added")
    public void verify_item_is_added() {
        homePage.verify_item_addem().contains("Hola!!, Como estas");
    }

    @Given("enter multiple todo items")
    public void enter_multiple_todo_items() {
        homePage.add_multiple_items("", "وعليكم السلام", "مع السلامه");

    }

    @Then("verify items is added")
    public void verify_items_is_added() {
        homePage.verify_added_items().contains("السلام عليكم");
    }

}
