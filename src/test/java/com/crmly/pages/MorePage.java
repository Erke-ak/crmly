package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MorePage extends BasePage{

    @FindBy(css ="[class='menu-popup-items']>span")
    public List<WebElement> moreDropDownMenu;

    public List<String> getMoreDropDownMenuOptions(){
        return getListOfString( moreDropDownMenu);
    }



}
