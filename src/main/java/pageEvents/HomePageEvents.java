package main.java.pageEvents;


import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import test.java.BaseTest;

import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class HomePageEvents {

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",
                HomePageElements.signInButton).click();
    }
}
