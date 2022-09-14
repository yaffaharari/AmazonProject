package main.java.pageObjects;

public interface LoginPageElements {

    String loginText = "//h1[contains(text(), 'Sign in']";
    //String loginText = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/h1";
    //String emailAddress = "ap_email";
    String emailAddress = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]";

}
