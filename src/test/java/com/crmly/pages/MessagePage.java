package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MessagePage extends BasePage {

    @FindBy(xpath ="(//div[@class='feed-add-post-text'])[1]")
    public WebElement messageInputBox;

    public void writeMessage(String message){
        //Driver.get().findElement(By.cssSelector("[class='bx-editor-iframe']")).click();
        Driver.get().switchTo().frame("bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm");
        messageInputBox.sendKeys( message);
    }

    }

