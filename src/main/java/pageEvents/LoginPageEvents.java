package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class LoginPageEvents {

    public void verifyLoginPageOpenedOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that the login page opened or not");
       // Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0, "Login page did not open");
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0, "Login page did not open");
    }

    public void enterEmailId(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the email id");
        elementFetch.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("yaffah19@gmail.com");
    }
}
