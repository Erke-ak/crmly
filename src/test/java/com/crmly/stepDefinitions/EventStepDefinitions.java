package com.crmly.stepDefinitions;

import com.crmly.pages.BasePage;
import com.crmly.pages.EventPage;
import com.crmly.pages.LoginPage;
import com.crmly.pages.MainPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EventStepDefinitions {

    EventPage eventPage = new EventPage();
    MainPage mainPage = new MainPage();

    @Then("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        mainPage.clickButton(string);
        System.out.println(string + " button is clicked");
        BasePage.wait(3);

    }

    @Then("User enters following information")
    public void user_enters_following_information(List<Map<String, String>> dataTable) {

        int row = 0;
        for(Map<String, String> map: dataTable){

            System.out.println(dataTable);

            eventPage.eventNameInputBox.sendKeys(map.get("Event Name"));
            BasePage.wait(2);

            eventPage.startDateInputBox.clear();
            eventPage.startDateInputBox.sendKeys(map.get("Start Date"));
            BasePage.wait(2);

            eventPage.selectMeetingRoom(map.get("Meeting Room"));
            BasePage.wait(2);

            eventPage.members.click();
            BasePage.wait(2);
            eventPage.ToAllEmployees.click();
            BasePage.wait(2);
            eventPage.clickWithJS(eventPage.saveButton);
            BasePage.wait(10);
            Assert.assertEquals(map.get("Event Name"),eventPage.eventNameAfterCreation.getText());
            System.out.println(map.get("Event Name"));
            System.out.println(eventPage.eventNameAfterCreation.getText());
            BasePage.wait(2);
            row++;

            if(row!=dataTable.size()){
                mainPage.event.click();
                BasePage.wait(2);
            }
        }
    }


}
