package com.prollo.stepdefinitions;

import com.prollo.hooks.Hooks;
import com.prollo.pages.DashboardPage;
import com.prollo.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static DashboardPage dashboardPage = new DashboardPage();
    private String companyName;

    public TestDashboard() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("click menu dashboard")
    public void click_menu_dashboard() {
        Hooks.delay(1);
        dashboardPage.clickBtnDashboard();
        extentTest.log(LogStatus.PASS, "Clik menu dashboard");
    }

    @When("click summary progress {string}")
    public void click_summary_progress(String progressType) {
        Hooks.delay(1);
        if (progressType.equals("Prospect")) {
            dashboardPage.clickProspect();
            extentTest.log(LogStatus.PASS, "Click summary prospect");
        } else if (progressType.equals("Share Compro")) {
            dashboardPage.clickShareCompro();
            extentTest.log(LogStatus.PASS, "Click summary share compro");
        } else if (progressType.equals("Client Assessment")) {
            dashboardPage.clickClientAssessment();
            extentTest.log(LogStatus.PASS, "Click summary client assessment");
        } else if (progressType.equals("Complete")) {
            dashboardPage.clickComplete();
            extentTest.log(LogStatus.PASS, "Click summary complete");
        } else if (progressType.equals("Initial Meeting")) {
            dashboardPage.clickInitialMeeting();
            extentTest.log(LogStatus.PASS, "Click summary initial meeting");
        } else if (progressType.equals("Client Drop")) {
            dashboardPage.clickClientDrop();
            extentTest.log(LogStatus.PASS, "Click summary client drop");
        } else {
            System.err.println();
        }

    }

    @Then("make sure the total summary is the same as the total list data {string}")
    public void make_sure_the_total_summary_is_the_same_as_the_total_list_data(String typeProgress) {
        Hooks.delay(1);
        int expected = switch (typeProgress) {
            case "Prospect" -> Integer.parseInt(dashboardPage.getTotalProspect());
            case "Share Compro" -> Integer.parseInt(dashboardPage.getTotalShareCompro());
            case "Initial Meeting" -> Integer.parseInt(dashboardPage.getTotalInitialMeeting());
            case "Client Assessment" -> Integer.parseInt(dashboardPage.getTotalCA());
            case "Complete" -> Integer.parseInt(dashboardPage.getTotalCompleted());
            case "Client Drop" -> Integer.parseInt(dashboardPage.getTotalDrop());
            default -> 0;
        };
        Hooks.delay(0.5);
        Assert.assertEquals(dashboardPage.getCountRows(), expected);
        extentTest.log(LogStatus.PASS, "Make sure the total summary is the same as the total list data");
    }


    @When("select and click one of the data in the list")
    public void select_and_click_one_of_the_data_in_the_list() {
        Hooks.delay(1);
        companyName = dashboardPage.getTxtCompanyName();
        Hooks.delay(1);
        dashboardPage.clickListClientProgress();
        extentTest.log(LogStatus.PASS, "Select and click one of the data in the list");
    }

    @Then("check detailed prospect data")
    public void check_detailed_prospect_data() {
        Hooks.delay(1);
        Assert.assertEquals(dashboardPage.getCompanyNameProgress().trim(), companyName);
        extentTest.log(LogStatus.PASS, "check detailed prospect data");
    }

}
