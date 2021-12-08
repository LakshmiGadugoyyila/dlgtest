package com.dlg.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage {
     WebDriver driver;
    @FindBy(className = "logged-in__success")
    public WebElement LoginSuccessTextMsg;

     public LoginSuccessPage(WebDriver driver)
     {
        this.driver = driver;
        PageFactory.initElements(driver,this);
     }
    public String getLoginSuccessText()
    {
        return LoginSuccessTextMsg.getText();
    }
}
