package com.core;

import com.tools.selenium.WebDriverService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by dpk on 5/17/2016.
 */
public class WebObjects {
    private static final WebDriver driver;


    static {
        driver = WebDriverService.getDriver();
    }

    public static WebElement waitForElement(final By by) {
        WebElement webElement = null;
        try {
            webElement = new WebDriverWait(driver, 60).until(new ExpectedCondition<WebElement>() {
                @Override
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return webElement;
    }

    public void click(By by){
        waitForElement(by).click();
    }

    public void type(By by, String text){
        waitForElement(by).sendKeys(text);
    }
}
