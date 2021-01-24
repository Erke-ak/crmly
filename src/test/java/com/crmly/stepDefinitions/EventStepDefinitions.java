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

//    @Then("User enters following information")
//    public void user_enters_following_information(List<Map<String, String>> dataTable) {
//
//        for(Map<String, String> map: dataTable){
//            eventPage.eventNameInputBox.sendKeys(map.get("Event Name"));
//            BasePage.wait(2);
//            eventPage.startDateInputBox.clear();
//            eventPage.startDateInputBox.sendKeys(map.get("Start Date"));
//            BasePage.wait(3);
//            eventPage.endDateInputBox.click();
//            eventPage.endDateInputBox.clear();
//            eventPage.endDateInputBox.sendKeys(map.get("End Date"));
//            BasePage.wait(2);
//
//            eventPage.selectMeetingRoom(map.get("Meeting Room"));
//            BasePage.wait(2);
//
//            eventPage.members.click();
//            BasePage.wait(2);
//            eventPage.ToAllEmployees.click();
//            BasePage.wait(2);
//            eventPage.saveButton.click();
//            BasePage.wait(45);
//
//        }



    

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

    @Then("user verifies that more button on the event page has following options")
    public void user_verifies_that_more_button_on_the_event_page_has_following_options(List<String> dataTable) {
        mainPage.eventWindowMoreButton.click();
        BasePage.wait(2);
        System.out.println(dataTable);
        System.out.println(mainPage.getMoreOptionsOnTheEventWindow());
        Assert.assertEquals(dataTable, mainPage.getMoreOptionsOnTheEventWindow());

    }

    @When("User enters {string} message on the comment box")
    public void user_enters_message_on_the_comment_box(String message) {
        mainPage.commentInputBox.sendKeys(message);
        System.out.println(message);

    }

    @When("User verifies that {string} message showed up on the event window")
    public void user_verifies_that_message_showed_up_on_the_event_window(String message) {
        System.out.println(mainPage.writtenCommentMessage.getText());
        Assert.assertEquals(message,mainPage.writtenCommentMessage.getText());


    }
    @When("User hover over the like button under event comment")
    public void user_hover_over_the_like_button_under_event_comment() {
        Actions action = new Actions(Driver.get());
        action.moveToElement(mainPage.likeUnderComment).perform();

    }

    @Then("User verifies that six emoji showed up")
    public void user_verifies_that_six_emogi_showed_up() {
        BasePage.wait(3);
        System.out.println(mainPage.emojis.size());
        //System.out.println(mainPage.getEmojis());
        Assert.assertEquals(6,mainPage.emojis.size());


    }

    @Then("User clicks {string} under event comment")
    public void user_clicks_under_event_comment(String button) {
        mainPage.clickButtonUnderComment(button);

    }

    @Then("User verifies that like image was displayed on the comment")
    public void user_verifies_that_like_image_was_displayed_on_the_comment() {
        Assert.assertTrue(mainPage.likeImageOnTheComment.isDisplayed());

    }






}
