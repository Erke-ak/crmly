package com.crmly.stepDefinitions;

import com.crmly.pages.MainPage;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MainPageStepDefinitions {

    MainPage mainPage=new MainPage();

    @When("User verifies that {string} logo is displayed")
    public void user_verifies_that_logo_is_displayed(String string) {
        mainPage.crm24Logo.click();
        Assert.assertTrue(mainPage.crm24Logo.isDisplayed());
    }
    @When("User verified that following options are displayed")
    public void user_verified_that_following_options_are_displayed(List<String> dataTable) {
        mainPage.getTaskOptions();
        System.out.println(dataTable);
        System.out.println(mainPage.getTaskOptions());
        Assert.assertEquals(dataTable,mainPage.getTaskOptions());
    }
    @When("User verified that following subtitles are displayed for Activity Stream")
    public void user_verified_that_following_subtitles_are_displayed_for_Activity_Stream(List<String> dataTable) {
       mainPage.getSubTitlesOfMainPage();
        System.out.println(dataTable);
        System.out.println(mainPage.getSubTitlesOfMainPage());
        Assert.assertEquals(dataTable,mainPage.getSubTitlesOfMainPage());
        System.out.println(mainPage.subtitlesOfMainPage.size());
    }


}
