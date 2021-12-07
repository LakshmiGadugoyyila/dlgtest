package com.dlg.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(name="loginUsername")
    public  WebElement emailTextbox;
    @FindBy(name="loginPassword")
    public WebElement passwordTextbox;
    @FindBy(xpath = "//button[text() ='Login']")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterEmail(String em)
    {
        emailTextbox.sendKeys(em);
    }
    public void enterPassword(String pw)
    {
        passwordTextbox.sendKeys(pw);
    }
    public void clickLogin()
    {
        loginBtn.click();
    }
}
