package com.crmly.stepDefinitions;

import com.crmly.pages.MainPage;
import com.crmly.pages.MorePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MoreStepDefinitions {

  MorePage morePage=new MorePage();
    MainPage mainPage = new MainPage();

    @Then("User verified that following drop down menu options are displayed")
    public void user_verified_that_following_drop_down_menu_options_are_displayed( List<String> dataTable) {
        System.out.println(dataTable);
        System.out.println(morePage.getMoreDropDownMenuOptions());
        Assert.assertEquals(dataTable,morePage.getMoreDropDownMenuOptions());
        Assert.assertEquals(4,morePage.moreDropDownMenu.size());




    }

}
