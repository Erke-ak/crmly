package com.crmly.stepDefinitions;

import com.crmly.pages.BasePage;
import com.crmly.pages.EventPage;
import com.crmly.pages.LoginPage;
import com.crmly.pages.MainPage;
import io.cucumber.java.en.Then;
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

        for(Map<String, String> map: dataTable){
            eventPage.eventNameInputBox.sendKeys(map.get("Event Name"));
            BasePage.wait(2);
            eventPage.startDateInputBox.clear();
            eventPage.startDateInputBox.sendKeys(map.get("Start Date"));
            BasePage.wait(3);
            eventPage.endDateInputBox.click();
            eventPage.endDateInputBox.clear();
            eventPage.endDateInputBox.sendKeys(map.get("End Date"));
            BasePage.wait(2);

            eventPage.selectMeetingRoom(map.get("Meeting Room"));
            BasePage.wait(2);

            eventPage.members.click();
            BasePage.wait(2);
            eventPage.ToAllEmployees.click();
            BasePage.wait(2);
            eventPage.saveButton.click();
            BasePage.wait(45);

        }



    }

}
