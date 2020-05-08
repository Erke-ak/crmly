package com.crmly.pages;

import com.crmly.utilities.Driver;
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

    @FindBy(xpath = "//span[contains(text(),'Message')]")
    public WebElement message;

    @FindBy(xpath = "//span[contains(text(),'Task')]")
    public WebElement task;

    @FindBy(xpath = "//span[contains(text(),'Event')]")
    public WebElement event;

    @FindBy(xpath = "//span[contains(text(),'Poll')]")
    public WebElement poll;

    @FindBy(xpath = "//span[contains(text(),'More')]")
    public WebElement more;





    public List<String> getTaskOptions(){
        return getListOfString(taskOptions);


    }

    public List<String> getSubTitlesOfMainPage(){
        return getListOfString(subtitlesOfMainPage);
    }


    public void clickButton(String button){

         switch (button){
             case "Message":
                 message.click();
                 break;

             case "Task":
                 task.click();
                 break;

             case "Event":
                 event.click();
                 break;

             case "Poll":
                 poll.click();
                 break;

             case "More":
                 more.click();
                 break;

             default:
                 throw new RuntimeException("Invalid role!");
         }
         }

    }










