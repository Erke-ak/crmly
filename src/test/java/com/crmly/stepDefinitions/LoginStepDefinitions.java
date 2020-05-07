package com.crmly.stepDefinitions;

import com.crmly.pages.LoginPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on the landing page");
    }


    @Given("User logs in as hr")
    public void user_logs_in_as_hr() {
        loginPage.login();
        System.out.println("User logs in as hr");

    }

    @When("User logs in {string}")
    public void user_logs_in(String role) {
        loginPage.login(role);

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
        System.out.println("User enters the username and password");


    }
    @Given("User logs in as marketing with following credentials")
    public void user_logs_in_as_marketing_with_following_credentials(Map <String,String> dataTable) {
        System.out.println(dataTable);
        loginPage.login(dataTable.get("username"),dataTable.get("password"));

    }
    @Given("User logs in as {string}")
    public void user_logs_in_as(String role) {
        loginPage.login(role );

    }


}
