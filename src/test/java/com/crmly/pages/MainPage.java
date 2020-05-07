package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{

    @FindBy(css = "[id='logo_24_text']")
    public WebElement crm24Logo;

    @FindBy(css="[id='feed-add-post-form-tab'] > span")
    public List<WebElement> taskOptions;

    @FindBy(css="[id='left-menu-list']>li")
    public List<WebElement> subtitlesOfMainPage;

    public List<String> getTaskOptions(){
        return getListOfString(taskOptions);


    }

    public List<String> getSubTitlesOfMainPage(){
        return getListOfString(subtitlesOfMainPage);
    }








}

