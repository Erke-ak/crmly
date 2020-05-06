package com.crmly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/features",

        glue = "com/crmly/stepDefinitions",

        dryRun = false,

<<<<<<< HEAD
        tags = "@login",
=======
        tags = "@login_credentials_ddt",
>>>>>>> d35a9a64fa0f119c662b0171374a799e5154f541

        plugin = {"html:target/default-cucumber-reports",

                "json:target/cucumber.json",

                "rerun:target/rerun.txt"

        }

)

public class CucumberRunner {

}
