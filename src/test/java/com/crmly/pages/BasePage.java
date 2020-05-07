package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BasePage {


<<<<<<< HEAD
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public static List<String> getListOfString(List<WebElement> listOfWebElements) {
        List<String> listOfStrings = new ArrayList<>();
        for (WebElement element : listOfWebElements) {
            String value = element.getText().trim();
            //if there is no text
            //do not add this blank text into list
            if (value.length() > 0) {
                listOfStrings.add(value);
            }

        }
        return listOfStrings;
=======
    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
>>>>>>> 2f8a7e5c352d1c271d378bbdf40b00a00a3fe8ed
    }
}