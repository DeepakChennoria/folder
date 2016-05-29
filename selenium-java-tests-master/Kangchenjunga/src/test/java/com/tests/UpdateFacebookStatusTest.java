package com.tests;

import com.base.AbstractTest;
import com.pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UpdateFacebookStatusTest extends AbstractTest {
    LoginPage loginPage;
    @Override
    public void testSetup() {
        loginPage = new LoginPage();

    }

    @Test(description = "Update Facebook user text status")
    public void updateTextStatus() {
        loginPage.loginAs("giu","hjb");

        }
}