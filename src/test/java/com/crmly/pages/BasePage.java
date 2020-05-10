package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BasePage {



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

    }
    public static void wait(int seconds) {

        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollDown(String button) {
        /**
         *  this script must scroll, until link element is visible
         *  once link element visible, it will stop scrolling
         *  arguments[0] = means first webelement after comma (link)
         *  arguments it's an array of webelements after comma
         *  arguments[0] = link web element, it can be any web element
         */

        wait(2);
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
       wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)", button);
       wait(2);

    }
}