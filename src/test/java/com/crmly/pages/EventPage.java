package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.Period;

public class EventPage extends BasePage {

    @FindBy(name = "EVENT_NAME")
    public WebElement eventNameInputBox;

    @FindBy(name = "DATE_FROM")
    public WebElement startDateInputBox;

    @FindBy(css = "[name='TIME_FROM_']")
    public WebElement startTimeInputBox;

    @FindBy(css="[name = 'DATE_TO']")
    public WebElement endDateInputBox;

    @FindBy(css = "[name='TIME_TO_']")
    public WebElement endTimeInputBox;

    @FindBy(name = "EVENT_LOCATION")
    public WebElement meetingRoom;

    @FindBy(id = "feed-event-dest-add-link")
    public WebElement members;

    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement ToAllEmployees;

    @FindBy(id = "blog-submit-button-save")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Central Meeting Room']")
    public WebElement centralMeetingRoom;

    @FindBy(xpath = "//*[text()='East Meeting Room']")
    public WebElement eastMeetingRoom;

    @FindBy(xpath = "//*[text()='West Meeting Room']")
    public WebElement westMeetingRoom;





    public void selectMeetingRoom(String room) {

        meetingRoom.click();
        if (room.equals("Central Meeting Room")) {
            centralMeetingRoom.click();
        } else if (room.equals("East Meeting Room")) {
            eastMeetingRoom.click();
        } else if (room.equals("West Meeting Room")) {
            westMeetingRoom.click();


        }


    }
}