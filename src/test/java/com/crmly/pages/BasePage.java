package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
