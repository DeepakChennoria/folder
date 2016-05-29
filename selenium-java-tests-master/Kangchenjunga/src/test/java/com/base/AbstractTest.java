package com.base;

import com.tools.selenium.WebDriverService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class AbstractTest {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true, description = "Start the Browser")
    @Parameters("browser")
    public void startBrowser(@Optional("firefox") String browser) {
        driver = WebDriverService.startDriver(browser);
        driver.get("http://www.facebook.com");
        testSetup();
    }

    @AfterClass(description = "Stop the Browser", alwaysRun = true)
    public void stopBrowser() {
        WebDriverService.stopDriver();
    }

    public abstract void testSetup();
}
