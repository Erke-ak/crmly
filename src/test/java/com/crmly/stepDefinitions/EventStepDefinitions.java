package com.crmly.stepDefinitions;

import com.crmly.pages.BasePage;
import com.crmly.pages.EventPage;
import com.crmly.pages.LoginPage;
import com.crmly.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EventStepDefinitions {

    EventPage eventPage = new EventPage();
    MainPage mainPage = new MainPage();
   // BasePage basePage =new BasePage();

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
//            eventPage.startDateInputBox.clear();
//            eventPage.startDateInputBox.sendKeys(map.get("Start Date"));
//            BasePage.wait(3);
//            eventPage.endDateInputBox.click();
//            eventPage.endDateInputBox.clear();
//            eventPage.endDateInputBox.sendKeys(map.get("End Date"));
//            BasePage.wait(2);

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
            BasePage.wait(4);
            mainPage.event.click();
            BasePage.wait(4);

        }
    }

    @Then("User clicks on {string} button on the Event Window")
    public void user_clicks_on_button_on_the_Event_Window(String button) {
        //BasePage.scrollDown(button);
        BasePage.wait(6);
        mainPage.clickButtonOnEventWindow(button);
        BasePage.wait(3);

    }

    @Then("User verifies that {string} and {string} message displayed on the Event Window")
    public void user_verifies_that_and_message_displayed_on_the_Event_Window(String string, String string2) {
        System.out.println(mainPage.AttendeesConfirmed.getText());
        System.out.println(mainPage.youAreAttendingThisEventMessage.getText());
        Assert.assertEquals(string,mainPage.youAreAttendingThisEventMessage.getText());
        Assert.assertEquals(string2,mainPage.AttendeesConfirmed.getText());


    }

    @Then("user verifies following informers options are displayed")
    public void user_verifies_following_informers_options_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        System.out.println();

    }

    @Then("User can write comment first {int} event")
    public void user_can_write_comment_first_event(Integer int1) {

    }




}
