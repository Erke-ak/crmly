package com.crmly.pages;

import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(css="[name='USER_LOGIN']")
    public WebElement userNameInputBox;

    @FindBy(css = "[name='USER_PASSWORD']")
    public WebElement passwordInputBox;

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    public void login(String userName, String password){
        userNameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password, Keys.ENTER);


    }
    public void login(){
        login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

}
