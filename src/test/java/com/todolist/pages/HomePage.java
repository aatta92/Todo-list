package com.todolist.pages;

import com.todolist.base.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "[placeholder='New Item']")
    WebElement new_itemField;

    @FindBy(css = "[type='submit']")
    WebElement add_link;

    @FindBy(css = "body > div:nth-child(2)")
    WebElement todolistContainer;

    @FindBy(css = "body > div:nth-child(2) > form:nth-child(6) > div > input[type=checkbox]")
    WebElement input_radioBtn;

    @FindBy(css = "[placeholder='New Item']")
    WebElement items_placeHolder;

    public void add_item(String todoItem) {
        new_itemField.sendKeys(todoItem, Keys.ENTER);
    }

    public void clickAddBtn() {
        add_link.click();
        wait_in_seconds(1);
    }

    public String verify_item_addem() {
        return todolistContainer.getText();


    }

    public void click_on_radioBtn() {
        input_radioBtn.click();
        wait_in_seconds(1);
    }

    public String verify_item_is_deleted() {
        return todolistContainer.getText();
    }

    public void add_multiple_items(String todoItem, String todoItem2, String todoItem3) {
        new_itemField.sendKeys(todoItem);
        add_link.click();
        new_itemField.sendKeys(todoItem2);
        add_link.click();
        new_itemField.sendKeys(todoItem3);
        add_link.click();
    }

    public String verify_added_items() {
        return todolistContainer.getText();
    }


    public String item_place_holder_should_be_empty() {
        return items_placeHolder.getText();
    }
}
