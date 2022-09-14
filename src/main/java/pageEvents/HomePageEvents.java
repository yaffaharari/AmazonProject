package main.java.pageEvents;


import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

public class HomePageEvents {

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        //elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
        WebElement element = BaseTest.driver.findElement(By.xpath("//span[text()='Sign in']"));
        String inputText = "Rozmeen";
        String js = "//span[text()='Sign in'].setAttribute('value','"+inputText+"')";
        ((JavascriptExecutor) BaseTest.driver).executeScript(js, element);
    }
}
