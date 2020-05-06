package com.crmly.stepDefinitions;

import com.crmly.pages.LoginPage;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();


    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
       // Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User logs in as hr")
    public void user_logs_in_as_hr() {
        loginPage.login();

    }

    @Then("User verifies that {string} Page title is displayed")
    public void user_verifies_that_Page_title_is_displayed(String string) {
        System.out.println(string);
        System.out.println(Driver.get().getTitle());
      Assert.assertEquals(string,Driver.get().getTitle() );

    }

    @Given("User enters {string} as a username and {string} as password")
    public void user_enters_as_a_username_and_as_password(String username, String password) {
        loginPage.login(username, password);

    }
}
