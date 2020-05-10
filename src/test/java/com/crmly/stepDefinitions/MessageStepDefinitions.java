package com.crmly.stepDefinitions;

import com.crmly.pages.MainPage;
import com.crmly.pages.MessagePage;
import io.cucumber.java.en.Then;

public class MessageStepDefinitions {
    MessagePage messagePage =new MessagePage();
    MainPage mainPage=new MainPage();

    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {
        mainPage.clickButton(string);
    }

    @Then("User enters {string}")
    public void user_enters(String message) {
    messagePage.writeMessage(message);
    }

    @Then("User clicks {string} options to window")
    public void user_clicks_options_to_window(String string) {

    }

    @Then("User clicks {string} options on people window")
    public void user_clicks_options_on_people_window(String string) {

    }

    @Then("User choose first address from people window")
    public void user_choose_first_address_from_people_window() {

    }

    @Then("User close people window")
    public void user_close_people_window() {

    }

    @Then("User close {string} option from to window")
    public void user_close_option_from_to_window(String string) {

    }

    @Then("User verifies message is displayed on the main page")
    public void user_verifies_message_is_displayed_on_the_main_page() {

    }


}
