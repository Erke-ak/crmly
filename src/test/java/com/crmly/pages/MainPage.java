package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(css = "[id='logo_24_text']")
    public WebElement crm24Logo;

    @FindBy(css = "[id='feed-add-post-form-tab'] > span")
    public List<WebElement> taskOptions;

    @FindBy(css = "[id='left-menu-list']>li")
    public List<WebElement> subtitlesOfMainPage;

    @FindBy(xpath = "//span[contains(text(),'Message')]")
    public WebElement message;

    @FindBy(xpath = "//span[contains(text(),'Task')]")
    public WebElement task;

    @FindBy(xpath = "//span[contains(text(),'Event')]")
    public WebElement event;

    @FindBy(xpath = "//span[contains(text(),'Poll')]")
    public WebElement poll;

    @FindBy(css = "[id='feed-add-post-form-link-text']")
    public WebElement more;

    @FindBy(xpath = "(//span[contains(text(),'Confirm attendance')])[1]")
    public WebElement confirmAttendance;

    @FindBy(xpath = "(//div[@class='feed-event-att-status feed-event-att-status-accepted'])[1]")
    public WebElement youAreAttendingThisEventMessage;

    @FindBy(xpath = "(//td[@class='feed-calendar-view-text-cell-l'])[3]")
    public WebElement AttendeesConfirmed;

    @FindBy(css = "[class*='menu-popup-item-text']")
    public List<WebElement> moreButtonOptionsOnTheEventWindow;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement eventWindowMoreButton;

    @FindBy(xpath = "(//a[@class='feed-com-add-link'])[1]")
    public WebElement commentInputBox;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']")
    public WebElement writtenCommentMessage;

    @FindBy(linkText = "Like")
    public WebElement likeUnderComment;

    @FindBy(css = "[class='feed-post-emoji-icon-inner']>div")
    public List<WebElement> emojis;

    @FindBy(css = "[class='feed-com-reply feed-com-reply-Y']")
    public WebElement replyUnderComment;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement moreUnderComment;

    @FindBy(css = "[class='feed-post-emoji-icon-container']")
    public WebElement likeImageOnTheComment;




    public List<String> getTaskOptions() {
        return getListOfString(taskOptions);


    }

    public List<String> getSubTitlesOfMainPage() {

        return getListOfString(subtitlesOfMainPage);
    }

    public List<String> getMoreOptionsOnTheEventWindow() {
        return getListOfString(moreButtonOptionsOnTheEventWindow);
    }

    public List<String> getEmojis() {
        return getListOfString(emojis);
    }


    public void clickButton(String button) {

        switch (button) {
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

            case "MORE":
                more.click();
                break;

            default:
                throw new RuntimeException("Invalid role!");
        }
    }

    public void clickButtonOnEventWindow(String button) {

        switch (button) {

            case "Confirm Attendance:":
                confirmAttendance.click();
                break;

            default:
                throw new RuntimeException("Invalid role!");

        }

    }

    public void clickButtonUnderComment(String button) {

        if (button.equals("Like")) {
            likeUnderComment.click();
        }
        else if (button.equals("Reply")) {
            replyUnderComment.click();
        }
        else if (button.equals("More")) {
            moreUnderComment.click();
        }

    }
}








