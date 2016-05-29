package com.pages;

import com.core.WebObjects;
import com.google.common.base.Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.testng.Assert.assertEquals;


public class LoginPage extends WebObjects {

    // Driver instance.
    private WebObjects loginInputField;
    private WebObjects passWord;

    public LoginPage() {
        loginInputField = new WebObjects();
        passWord = new WebObjects();
    }

    public HomePage loginAs(String emailOrPhone, String password) {
        loginInputField.type(By.id("email"), emailOrPhone);
        passWord.type(By.id("pass"), password);
        return new HomePage();
    }
}
