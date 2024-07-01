
 package com.prollo.testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
//        features = "src/main/resources/features/",
        features = {"src/main/resources/features/01.Login.feature", "src/main/resources/features/02.Dashboard.feature"},
//        features = {"src/main/resources/features/01.Login.feature", "src/main/resources/features/03.ListClient.feature"},
        glue = {"com.prollo"},
        dryRun = false,
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"}
)   
public class TestRun extends AbstractTestNGCucumberTests {


}