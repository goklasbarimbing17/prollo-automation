package com.prollo.stepdefinitions;

import com.prollo.hooks.Hooks;
import com.prollo.pages.ProgressPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSignature {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ProgressPage progressPage = new ProgressPage();
    private String companyName;

    public TestSignature() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//    @When("open web employee")
//    public void open_web_employee() {
//        driver.get("https://dev.ptdika.com/employee/panel/login/");
//    }
//
//    @When("login to system")
//    public void login_to_system() {
//        progressPage.setLogin();
//    }
//
//    @When("click menu signature")
//    public void click_menu_signature() {
//        Hooks.delay(2);
//        progressPage.clickMenuSignature();
//    }
//
//    @When("create signature")
//    public void create_signature() {
//        Hooks.delay(1);
//        progressPage.setSignature();
//        Hooks.delay(3);
//    }
}
