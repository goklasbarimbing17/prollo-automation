package com.prollo.stepdefinitions;

import com.prollo.hooks.Hooks;
import com.prollo.pages.DashboardPage;
import com.prollo.pages.ListClientPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class TestListClient {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ListClientPage listClientPage = new ListClientPage();
    private Random random = new Random();

    private String companyNamee;

    public TestListClient() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // ACCESS LIST CLIENT MENU ---------------------------------------------------------------------------------------->
    @When("click prospect menu")
    public void click_prospect_menu() {
        Hooks.delay(0.5);
        listClientPage.clickProspectMenu();
        extentTest.log(LogStatus.PASS, "Click prospect menu");
    }

    @When("click list client menu")
    public void click_list_client_menu() {
        Hooks.delay(0.5);
        listClientPage.clickListClientMenu();
        extentTest.log(LogStatus.PASS, "Click list client menu");
    }

    @Then("validation displays the list client menu")
    public void validation_displays_the_list_client_menu() {
        Hooks.delay(0.5);
        Assert.assertEquals(listClientPage.getTxtListClientPage(), "Client List");
        extentTest.log(LogStatus.PASS, "Validation displays the list client menu");
    }

    //FILTER STATUS PROGRESS ------------------------------------------------------------------------------------------>
    @When("select dropdown filter client progress {int}")
    public void select_dropdown_filter_client_progress(Integer index) {
        Hooks.delay(1);
        listClientPage.setDropdownFilter(index);
        extentTest.log(LogStatus.PASS, "select dropdown filter client progress");
    }

    @Then("Validate filter client progress {string} {string}")
    public void validate_filter_client_progress(String result, String status) {
        Hooks.delay(0.8);
        Assert.assertEquals(listClientPage.getResultFilter(), result);
        extentTest.log(LogStatus.PASS, "Validate filter client progress");
    }

    //ACCESS CREATE NEW CLIENT FORM ----------------------------------------------------------------------------------->
    @When("click create new client")
    public void click_create_new_client() {
        Hooks.delay(0.5);
        listClientPage.setDropdownFilter(0);
        Hooks.delay(2);
        listClientPage.clickBtnCreateNewClient();
        extentTest.log(LogStatus.PASS, "click create new client");
    }

    @Then("validation display the create new client form")
    public void validation_display_the_create_new_client_form() {
        Hooks.delay(0.5);
        Assert.assertEquals(listClientPage.validateFormAddClient(), "Is Displayed");
        extentTest.log(LogStatus.PASS, "validation display the create new client form");
    }

    //CREATE NEW CLIENT AND EDIT CLIENT ------------------------------------------------------------------------------->
    @When("select client type client list {int}")
    public void select_client_type_client_list(int index) {
        Hooks.delay(2);
        listClientPage.setClientType(index);
        extentTest.log(LogStatus.PASS, "Select client type client list");
    }

    @When("input company name client list {string}")
    public void input_company_name_client_list(String status) {
        Hooks.delay(0.5);
        listClientPage.setCompanyName(status);
        extentTest.log(LogStatus.PASS, "Input company name client list");
    }

    @When("input name PIC client list")
    public void input_name_pic_client_list() {
        Hooks.delay(0.5);
        listClientPage.setNamePIC();
        extentTest.log(LogStatus.PASS, "Input name PIC client list");
    }

    @When("input phone PIC client list")
    public void input_phone_pic_client_list() {
        Hooks.delay(0.5);
        listClientPage.setPhonePIC();
        extentTest.log(LogStatus.PASS, "Input phone PIC client list");
    }

    @When("input email PIC client list")
    public void input_email_pic_client_list() {
        Hooks.delay(0.5);
        listClientPage.setEmailPIC();
        Hooks.delay(1);
        Hooks.Enter();
        extentTest.log(LogStatus.PASS, "Input email PIC client list");
    }

    @When("select source client list {int}")
    public void select_source_client_list(int index) {
        Hooks.delay(0.5);
        listClientPage.setSourceNewClient(index);
        extentTest.log(LogStatus.PASS, "Select source client list");
    }

    @When("click button create client list")
    public void click_button_create_client_list() {
        Hooks.delay(0.5);
        listClientPage.clickBtnCreate();
        extentTest.log(LogStatus.PASS, "click button create client list");
    }

    @When("click button save edit client")
    public void click_button_save_edit_client() {
        Hooks.delay(0.5);
        listClientPage.clickBtnSaveEditClient();
        extentTest.log(LogStatus.PASS, "click button save edit client");
    }

    @Then("Validate create new client {string} {string}")
    public void validate_create_new_client(String result, String status) {
        Hooks.delay(1);
        switch (status) {
            case "Company Name Empty" -> {
                Assert.assertEquals(listClientPage.getTxtCompanyNameEmpty(), "Nama Perusahaan tidak boleh kosong");
                extentTest.log(LogStatus.PASS, "Validate create new client with company name empty");
            }
            case "Source Empty" -> {
                Assert.assertEquals(listClientPage.getTxtSourceEmpty(), "Source tidak boleh kosong");
                extentTest.log(LogStatus.PASS, "Validate create new client with source empty");
            }
            case "Duplicate" -> {
                listClientPage.clickBtnCancelDanger();
                Assert.assertEquals(listClientPage.getAlertDuplicateAddClient(), "Data is duplicate");
                extentTest.log(LogStatus.PASS, "Validate create new client with duplicate data");
            }
            case "Success" -> {
                Assert.assertEquals(listClientPage.getAlertSuccessAddProspect(), "Sukses menambahkan Client");
                Assert.assertEquals(listClientPage.getTxtNewProspect(), "New Prospect");
                extentTest.log(LogStatus.PASS, "Validate create new client with valid credentials");
            }
        }
    }

    //VIEW DETAIL CLIENT ---------------------------------------------------------------------------------------------->
    @When("click view detail fitur")
    public void click_view_detail_fitur() {
        Hooks.delay(0.5);
        listClientPage.clickBtnDetail();
        extentTest.log(LogStatus.PASS, "click view detail fitur");
    }

    @Then("validation display the detail data client form")
    public void validatin_display_the_detail_data_client_form() {
        Hooks.delay(0.5);
        Assert.assertEquals(listClientPage.validateFormEditClient(), "Is Displayed");
        extentTest.log(LogStatus.PASS, "validation display the detail data client form");
    }

    //EDIT DATA CLIENT ------------------------------------------------------------------------------------------------>
    @When("click button edit")
    public void click_button_edit() {
        Hooks.delay(0.5);
        listClientPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS, "click button edit");
    }

    @Then("validation display the edit client form")
    public void validation_display_the_edit_client_form() {
        Hooks.delay(0.5);
        Assert.assertTrue(listClientPage.checkFieldClientType());
        Assert.assertTrue(listClientPage.checkFieldCompanyName());
        Assert.assertTrue(listClientPage.checkFieldPicName());
        Assert.assertTrue(listClientPage.checkFieldTelpPic());
        Assert.assertTrue(listClientPage.checkFieldSource());
        extentTest.log(LogStatus.PASS, "validation display the edit client form");
    }

    @When("select client type edit client {int}")
    public void select_client_type_edit_client(Integer index) {
        Hooks.delay(0.5);
        listClientPage.setClientType(index);
        extentTest.log(LogStatus.PASS, "select client type edit client");
    }

    @When("input company name edit client {string}")
    public void input_company_name_edit_client(String status) {
        Hooks.delay(0.5);
        listClientPage.setCompanyName(status);
        extentTest.log(LogStatus.PASS, "input company name edit client");
    }

    @When("input name PIC edit client")
    public void input_name_pic_edit_client() {
        Hooks.delay(0.5);
        listClientPage.setNamePIC();
        extentTest.log(LogStatus.PASS, "Input name PIC edit client");
    }

    @When("input phone PIC edit client")
    public void input_phone_pic_edit_client() {
        Hooks.delay(0.5);
        listClientPage.setPhonePIC();
        extentTest.log(LogStatus.PASS, "Input phone PIC edit client");
    }

    @When("select source edit client {int}")
    public void select_source_edit_client(Integer index) {
        Hooks.delay(0.5);
        listClientPage.setSourceNewClient(index);
        extentTest.log(LogStatus.PASS, "select source edit client");
    }

    @Then("Validate edit client {string}")
    public void validate_edit_client(String status) {
        Hooks.delay(1);
        switch (status) {
            case "Company Name Empty" -> {
                Assert.assertEquals(listClientPage.getTxtCompanyNameEmpty(), "Nama Perusahaan tidak boleh kosong");
                extentTest.log(LogStatus.PASS, "Validate edit client with company name empty");
            }
            case "Source Empty" -> {
                Assert.assertEquals(listClientPage.getTxtSourceEmpty(), "Source tidak boleh kosong");
                extentTest.log(LogStatus.PASS, "Validate edit client with source empty");
                System.out.println(listClientPage.getTxtSourceEmpty());
            }
            case "Duplicate" -> {
                Assert.assertEquals(listClientPage.getAlertDuplicateEditClient(), "Data is duplicate");
                extentTest.log(LogStatus.PASS, "Validate duplicate edit data client");
            }
            case "Success Edit" -> {
                Assert.assertEquals(listClientPage.getAlertSuccessEditClient(), "Success edit form");
                extentTest.log(LogStatus.PASS, "Validate edit data client");
            }
        }
    }
}
